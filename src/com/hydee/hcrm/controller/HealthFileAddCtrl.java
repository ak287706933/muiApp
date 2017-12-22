package com.hydee.hcrm.controller;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hydee.hcrm.pojo.CrmDiseaseNote;
import com.hydee.hcrm.pojo.CrmDrugNote;
import com.hydee.hcrm.pojo.CrmHealthModilis;
import com.hydee.hcrm.pojo.t_crm_memcard_reg;
import com.hydee.hcrm.service.MyCustomerService;
import com.hydee.hcrm.service.i.IHealthFileAddService;
import com.hydee.hcrm.vo.HealthFileAddVO;

@Controller
@RequestMapping(value="/healthFileAdd")
public class HealthFileAddCtrl {
private final Logger logger = Logger.getLogger(HealthFileAddCtrl.class);
	@Resource
	private MyCustomerService mycustomerservice;
	
	@Resource
	private IHealthFileAddService healthFileAddService;
	
	/**
	 * 跳转至健康档案新增页面
	 * @param request
	 * @param vo
	 * @return
	 */
	@RequestMapping(value="/toAdd") 
	public String toAdd(HttpServletRequest request){
		logger.info("--健康档案新增页面跳转--toEdit---begin----");
		HealthFileAddVO vo = new HealthFileAddVO();
		
		String memcardno = request.getParameter("memcardno");
		Integer compid = Integer.valueOf(request.getParameter("compid"));
		
		t_crm_memcard_reg reg=new t_crm_memcard_reg();
		reg.setMEMCARDNO(memcardno);
		reg.setCOMPID(compid);
		reg=mycustomerservice.getAccountInfo(reg);
		
		CrmHealthModilis healthModilis = new CrmHealthModilis();
		healthModilis.setMemcardNo(memcardno);
		healthModilis.setCompid(compid);
		healthModilis.setType("本人");
		healthModilis.setCardHolder(reg.getCARDHOLDER());
		healthModilis.setBirthday(reg.getBIRTHDAY());
		healthModilis.setIdcard(reg.getIDCARD());
		healthModilis.setBusno(reg.getBUSNO());
		healthModilis.setBusName(reg.getBUSNOS());
		healthModilis.setSex(reg.getSEX());
		
		CrmDrugNote crmDrugNote = new CrmDrugNote();
		
		vo.setReg(reg);
		vo.setCrmHealthModilis(healthModilis);
		vo.setCrmDrugNote(crmDrugNote);
		
		request.setAttribute("vo", vo);
		
		logger.info("--健康档案新增页面跳转--toEdit---end----");
		return "healthFileAdd";
	}
	
	/**
	 * 保存健康档案信息
	 * @param request
	 * @param session
	 * @param vo
	 * @return
	 */
	@RequestMapping(value="/addCrmHealthFile", method=RequestMethod.POST)
	@ResponseBody
	public String addCrmHealthFile(HttpServletRequest request, @ModelAttribute HealthFileAddVO vo){
		logger.info("--保存健康档案信息--addCrmHealthFile---begin----");
		
		String result = "ERROR";
		
		CrmHealthModilis healthModilis = vo.getCrmHealthModilis();
		healthModilis.setBillNo(mycustomerservice.getBillno());
		healthModilis.setFileNo(healthFileAddService.findHealthFileNo());
		
		String userid=(String) request.getSession().getAttribute("userid");
		Cookie[] cookie=request.getCookies();
		int uid = 0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
				uid=Integer.parseInt(userid);
				break;
			}
		}
		
		Timestamp lastTime = new Timestamp(System.currentTimeMillis());
		healthModilis.setCreatetime(lastTime);
		healthModilis.setCreateuser(uid);
		//病史列表
		vo.setCrmDiseaseNoteList(initDiseaseNotes(request, healthModilis));
		
		healthFileAddService.addCrmHealthFile(vo);
		result = "OK";
		logger.info("--保存健康档案信息--addCrmHealthFile---end----");
		return result;
	}

	/**
	 * 初始化病史
	 * @param request
	 * @param vo
	 */
	private List<CrmDiseaseNote> initDiseaseNotes(HttpServletRequest request, CrmHealthModilis healthModilis) {
		List<CrmDiseaseNote> crmDiseaseNoteList = new ArrayList<>();
		
		String[] entityIdArr = request.getParameterValues("entityIdArr");
		String[] diseaseIdArr = request.getParameterValues("diseaseIdArr");
		String[] diseaseNameArr = request.getParameterValues("diseaseNameArr");
		String[] shootingtimeArr = request.getParameterValues("shootingtimeArr");
		String[] diseaseTypeArr = request.getParameterValues("diseaseTypeArr");
		String[] treatmentStateArr = request.getParameterValues("treatmentStateArr");
		String[] symptomsArr = request.getParameterValues("symptomsArr");
		String[] concurrentArr = request.getParameterValues("concurrentArr");
		String[] pathogenyArr = request.getParameterValues("pathogenyArr");
		if(entityIdArr != null && entityIdArr.length > 0){
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			for (int i = 0; i < entityIdArr.length; i++) {
				CrmDiseaseNote diseaseNote = new CrmDiseaseNote();
				diseaseNote.setAddType(1);
				diseaseNote.setBillNo(healthModilis.getBillNo());
				diseaseNote.setCompid(healthModilis.getCompid());
				diseaseNote.setConcurrent(concurrentArr[i]);
				diseaseNote.setDiseaseId(diseaseIdArr[i]);
				diseaseNote.setDiseaseName(diseaseNameArr[i]);
				diseaseNote.setDiseaseType(diseaseTypeArr[i]);
				diseaseNote.setEntityId(entityIdArr[i]);
				diseaseNote.setFileNo(healthModilis.getFileNo());
				diseaseNote.setMemcardNo(healthModilis.getMemcardNo());
				diseaseNote.setPathogeny(pathogenyArr[i]);
				if(!StringUtils.isEmpty(shootingtimeArr[i])){
					try {
						diseaseNote.setShootingtime(new Timestamp(df.parse(shootingtimeArr[i]).getTime()));
					} catch (ParseException e) {
						e.printStackTrace();
						logger.error("时间转换失败:"+e);
					}
				}
				diseaseNote.setSymptoms(symptomsArr[i]);
				diseaseNote.setTreatmentState(treatmentStateArr[i]);
				diseaseNote.setLastTime(healthModilis.getCreatetime());
				diseaseNote.setLastModify(healthModilis.getCreateuser());
				
				crmDiseaseNoteList.add(diseaseNote);
			}
		}
		
		return crmDiseaseNoteList;
	}
	
}
