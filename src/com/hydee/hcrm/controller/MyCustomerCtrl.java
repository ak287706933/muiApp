package com.hydee.hcrm.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.hydee.hcrm.pojo.Page;
import com.hydee.hcrm.pojo.member_sale;
import com.hydee.hcrm.pojo.t_crm_addhealth;
import com.hydee.hcrm.pojo.t_crm_disease;
import com.hydee.hcrm.pojo.t_crm_disease_note;
import com.hydee.hcrm.pojo.t_crm_drug;
import com.hydee.hcrm.pojo.t_crm_drug_note;
import com.hydee.hcrm.pojo.t_crm_entity;
import com.hydee.hcrm.pojo.t_crm_entity_symptom;
import com.hydee.hcrm.pojo.t_crm_entity_syndrome;
import com.hydee.hcrm.pojo.t_crm_entity_type;
import com.hydee.hcrm.pojo.t_crm_health_list;
import com.hydee.hcrm.pojo.t_crm_health_modilis;
import com.hydee.hcrm.pojo.t_crm_memcard_reg;
import com.hydee.hcrm.pojo.t_crm_ware;
import com.hydee.hcrm.service.MyCustomerService;
import com.hydee.hcrm.util.Log;
import com.hydee.hcrm.util.TaskTool;

@Controller
public class MyCustomerCtrl {
	@Resource
	private MyCustomerService mycustomerservice;
	
	private Gson gson = new Gson();
	
	private String memcardno;
	
	//输出客户数量
	@RequestMapping("clientcount")
	public void getClientCount(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_memcard_reg reg=new t_crm_memcard_reg();
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		reg.setCLERK(uid);
		String mun=mycustomerservice.getClientCount(reg);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8");
		String jsonStr=gson.toJson(mun);
		rep.getWriter().print(jsonStr);
	}
	
	//获取客户列表
	@RequestMapping("clientlist")
	public void getClientList(@RequestParam String begin,@RequestParam String end,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		Page page=new Page();
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		int index=Integer.parseInt(begin);
		int ShowSize=Integer.parseInt(end);
		page.setUserid(uid);
		page.setIndex(index);
		page.setShowSize(ShowSize);
		ArrayList<t_crm_memcard_reg> list=mycustomerservice.getClientList(page);
		
		for(int i = 0 ; i < list.size() ; i++) {
			list.get(i).setPERSENT(list.get(i).getPERSENT().substring(1, 3));
			if(list.get(i).getAGE()==null){
				list.get(i).setAGE(" ");
			}
		}
		
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(list);
		rep.getWriter().print(jsonStr);
	}
	
	//按反馈日期输出客户列表
	@RequestMapping("clienttime")
	public void getClientTime(@RequestParam String begin,@RequestParam String end,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		Page page=new Page();
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		int index=Integer.parseInt(begin);
		int ShowSize=Integer.parseInt(end);
		page.setUserid(uid);
		page.setIndex(index);
		page.setShowSize(ShowSize);
		ArrayList<t_crm_memcard_reg> list=mycustomerservice.getClientTime(page);
		
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getACCEPT_DATE()==null){
				list.get(i).setACCEPT_DATE(" ");
			}
		}
		
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(list);
		rep.getWriter().print(jsonStr);
	}
	//按最后购买日期输出客户列表
	@RequestMapping("buytime")
	public void getBuyTime(@RequestParam String begin,@RequestParam String end,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		Page page=new Page();
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		int index=Integer.parseInt(begin);
		int ShowSize=Integer.parseInt(end);
		page.setUserid(uid);
		page.setIndex(index);
		page.setShowSize(ShowSize);
		ArrayList<t_crm_memcard_reg> list=mycustomerservice.getBuyTime(page);
		
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getLASTDATE()==null){
				list.get(i).setLASTDATE(" ");
			}
			
		}
		
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(list);
		rep.getWriter().print(jsonStr);
	}
	//输出账号信息111
	@RequestMapping("accountinfo")
	public void getAccountInfo(@RequestParam String memcardno,@RequestParam String compid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_memcard_reg reg=new t_crm_memcard_reg();
		reg.setMEMCARDNO(memcardno);
		reg.setCOMPID(Integer.parseInt(compid));
		reg=mycustomerservice.getAccountInfo(reg);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(reg);
		rep.getWriter().print(jsonStr);
	}
	
	//输出回访记录
	@RequestMapping("accessrecord")
	public void getAccessRecord(@RequestParam String memcardno,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_memcard_reg reg=new t_crm_memcard_reg();
		reg.setMEMCARDNO(memcardno);
		reg=mycustomerservice.getAccessRecord(reg);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(reg);
		rep.getWriter().print(jsonStr);
	}
	
	//采集健康档案信息
	@RequestMapping("addHealth")
	public void addHealth(@RequestParam String memcardno,
						  @RequestParam String compid,
						  @RequestParam String ctime,
						  @RequestParam String remark,
						  @RequestParam String tval,
						  @RequestParam String collecttype,
						  @RequestParam(value="vaguetime",required=false) String vaguetime,
						  @RequestParam(value="tval1",required=false) String tval1,
						  HttpServletRequest req,HttpServletResponse rep) throws IOException{
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		int cid=Integer.parseInt(compid);
		double val=Double.parseDouble(tval);
		t_crm_addhealth h=new t_crm_addhealth();
		String rk=new String(remark.getBytes("ISO-8859-1"),"utf-8");
		h.setVALUE1(val);
		h.setMEMCARDNO(memcardno);
		h.setCOMPID(cid);
		h.setCREATETIME(ctime);
		h.setREMARK(rk);
		h.setCOLLECTTYPE(collecttype);
		h.setCREATEUSER(uid);
		if(vaguetime==null){
			if(tval1!=null){
				double val1=Double.parseDouble(tval1);
				h.setVALUE2(val1);
			}
			h.setVAGUETIME("");
		}else{
			h.setVAGUETIME(vaguetime);
		}
		int num=mycustomerservice.addHealth(h);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(num);
		rep.getWriter().print(jsonStr);
	}
	//输出健康档案信息111
	@RequestMapping("showall")
	public void showall(@RequestParam String memcardno,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		mycustomerservice.getHeight(h);
		mycustomerservice.getWeight(h);
		mycustomerservice.getTemperature(h);
		mycustomerservice.getHeartrate(h);
		mycustomerservice.getSteps(h);
		mycustomerservice.getSystolic(h);
		mycustomerservice.getDiastolic(h);
		mycustomerservice.getOxygen(h);
		mycustomerservice.getBloodsugar1(h);
		mycustomerservice.getBloodsugar2(h);
		mycustomerservice.getBloodsugar3(h);
		mycustomerservice.getBloodsugar4(h);
		mycustomerservice.getBloodsugar5(h);
		mycustomerservice.getBloodsugar6(h);
		mycustomerservice.getBloodsugar7(h);
		mycustomerservice.getGlycosylated(h);
		mycustomerservice.getCholesterol(h);
		mycustomerservice.getTriglyceride(h);
		mycustomerservice.getHighlipoprotein(h);
		mycustomerservice.getLowlipoprotein(h);
		mycustomerservice.getHomocysteine(h);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.gethealths());
		rep.getWriter().print(jsonStr);
	}
	
	//获取日数据
	@RequestMapping("getday")
	public void getDay(@RequestParam String memcardno,
					   @RequestParam String collecttype,
			HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getDay(h));
		rep.getWriter().print(jsonStr);
	}
	//输出周数据普通类型
	@RequestMapping("getweek")
	public void getWeek(@RequestParam String memcardno,
						@RequestParam String collecttype,
						@RequestParam(value="vaguetime",required=false) String vaguetime,
			HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		if(vaguetime!=null){
			h.setVAGUETIME(vaguetime);
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getWeek(h));
		rep.getWriter().print(jsonStr);
	}
	//输出周数据血压
	@RequestMapping("weekpressure")
	public void getWeekPressure(@RequestParam String memcardno,
								@RequestParam String collecttype,
								@RequestParam(value="vaguetime",required=false) String vaguetime,
								HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		if(vaguetime!=null){
			h.setVAGUETIME(vaguetime);
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getWeekPressure(h));
		rep.getWriter().print(jsonStr);
	}
	//输出月数据
	@RequestMapping("getMonth")
	public void getMonth(@RequestParam String memcardno,
						 @RequestParam String collecttype,
						 @RequestParam(value="vaguetime",required=false) String vaguetime,
						 HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		if(vaguetime!=null){
			h.setVAGUETIME(vaguetime);
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getMonth(h));
		rep.getWriter().print(jsonStr);
	}
	//获取月数据血压
	@RequestMapping("MonthPressure")
	public void getMonthPressure(@RequestParam String memcardno,
								 @RequestParam String collecttype,
								 @RequestParam(value="vaguetime",required=false) String vaguetime,
								 HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		if(vaguetime!=null){
			h.setVAGUETIME(vaguetime);
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getMonthPressure(h));
		rep.getWriter().print(jsonStr);
	}
	//输出年数据
	@RequestMapping("getyear")
	public void getYear(@RequestParam String memcardno,
					    @RequestParam String collecttype,
						@RequestParam(value="vaguetime",required=false) String vaguetime,
						HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		if(vaguetime!=null){
			h.setVAGUETIME(vaguetime);
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getYear(h));
		rep.getWriter().print(jsonStr);
	}
	//输出年数据血压
	@RequestMapping("yearPressure")
	public void getYearPressure(@RequestParam String memcardno,
					    @RequestParam String collecttype,
						@RequestParam(value="vaguetime",required=false) String vaguetime,
						HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		if(vaguetime!=null){
			h.setVAGUETIME(vaguetime);
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getYearPressure(h));
		rep.getWriter().print(jsonStr);
	}
	//输出备注
	@RequestMapping("getremark")
	public void getRemark(@RequestParam String memcardno,
						  @RequestParam String collecttype,
			HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getRemark(h));
		rep.getWriter().print(jsonStr);
	}
	//电话回访获取相关信息
	@RequestMapping("getMemcrd")
	public void getMemcrd(@RequestParam String memcardno,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getMemcrd(h));
		rep.getWriter().print(jsonStr);
	}
	//添加电话回访记录
	@RequestMapping(value="memberfk",method=RequestMethod.POST)
	public void setMemberfk(@RequestParam String memcardno,
							@RequestParam String compid,
							@RequestParam String busno,
							@RequestParam String status,
							@RequestParam(value="remark",required=false) String remark,
			HttpServletRequest req,HttpServletResponse rep) throws IOException{
		member_sale sale=new member_sale();
		Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date=df.format(d);
		sale.setMEMCARDNO(memcardno);
		sale.setCOMPID(Integer.parseInt(compid));
		sale.setBUSNO(Integer.parseInt(busno));
		sale.setSTATUS(Integer.parseInt(status));
		sale.setCREATETIME(date);
		if(remark!=null){
			String notes=new String(remark.getBytes("ISO-8859-1"),"utf-8");
			sale.setNOTES(notes);
		}
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		sale.setCALLER(uid);
		sale.setCREATEUSER(uid);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.setMemberfk(sale));
		rep.getWriter().print(jsonStr);
	}
	
	//输出电话回访记录111
	@RequestMapping("memberhf")
	public void getMemberhf(@RequestParam String memcardno,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		member_sale sale=new member_sale();
		sale.setMEMCARDNO(memcardno);
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		sale.setCALLER(uid);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getMemberhf(sale));
		rep.getWriter().print(jsonStr);
	}
	//输出周平均值
	@RequestMapping("weekavg")
	public void getWeekavg(@RequestParam String memcardno,
			               @RequestParam String collecttype,
			               @RequestParam(value="vaguetime",required=false) String vaguetime,
			HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		if(vaguetime!=null){
			h.setVAGUETIME(vaguetime);
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getWeekavg(h));
		rep.getWriter().print(jsonStr);
	}
	//输出月数据
	@RequestMapping("monthavg")
	public void getMonthavg(@RequestParam String memcardno,
					        @RequestParam String collecttype,
					        @RequestParam(value="vaguetime",required=false) String vaguetime,
			HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		if(vaguetime!=null){
			h.setVAGUETIME(vaguetime);
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getMonthavg(h));
		rep.getWriter().print(jsonStr);
	}
	//输出年数据
	@RequestMapping("yearavg")
	public void getYearavg(@RequestParam String memcardno,
					       @RequestParam String collecttype,
					       @RequestParam(value="vaguetime",required=false) String vaguetime,
			HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		h.setMEMCARDNO(memcardno);
		h.setCOLLECTTYPE(collecttype);
		if(vaguetime!=null){
			h.setVAGUETIME(vaguetime);
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getYearavg(h));
		rep.getWriter().print(jsonStr);
	}
	
	//搜索会员
	@RequestMapping("searchmember")
	public void SearchMember(@RequestParam String parameter,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_memcard_reg reg=new t_crm_memcard_reg();
		if(TaskTool.isNumeric(parameter)){
			int pmtl=parameter.length();
			if(pmtl==11){
				reg.setMOBILE(parameter);
			}else if(pmtl==18){
				reg.setIDCARD(parameter);
			}else{
				reg.setMEMCARDNO(parameter);
			}
		}else{
			String ptr=new String(parameter.getBytes("ISO-8859-1"),"utf-8");
			reg.setCARDHOLDER(ptr);
		}
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		reg.setCLERK(uid);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.SearchMember(reg));
		rep.getWriter().print(jsonStr);
	}
	
	//输出账号信息（微信）
	@RequestMapping("WXAccountinfo")
	public void WXAccountinfo(@RequestParam(value="code",required=false) String code,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_memcard_reg reg=new t_crm_memcard_reg();
		String openId=null;
		code = req.getParameter("code");
		Logger log = Logger.getLogger("lavasoft.blog"); 
		//log.info("1111"+code);
		try {
			openId=mycustomerservice.WXinfo(code,req, rep);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reg.setWEIXINID(openId);
		//log.info("openId==========="+openId);
		ArrayList<t_crm_memcard_reg> r=mycustomerservice.getWXAccountInfo(reg);
		//log.info("reg2==========="+reg.getMEMCARDNO());
		memcardno=r.get(0).getMEMCARDNO();
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(r.get(0));
		rep.getWriter().print(jsonStr);
	}
	
	//输出健康档案信息（微信）
	@RequestMapping("WXshowall")
	public void WXshowall(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_addhealth h=new t_crm_addhealth();
		//String memcardno=(String) req.getSession().getAttribute("memcardno");
		h.setMEMCARDNO(memcardno);
		mycustomerservice.getHeight(h);
		mycustomerservice.getWeight(h);
		mycustomerservice.getTemperature(h);
		mycustomerservice.getHeartrate(h);
		mycustomerservice.getSteps(h);
		mycustomerservice.getSystolic(h);
		mycustomerservice.getDiastolic(h);
		mycustomerservice.getOxygen(h);
		mycustomerservice.getBloodsugar1(h);
		mycustomerservice.getBloodsugar2(h);
		mycustomerservice.getBloodsugar3(h);
		mycustomerservice.getBloodsugar4(h);
		mycustomerservice.getBloodsugar5(h);
		mycustomerservice.getBloodsugar6(h);
		mycustomerservice.getBloodsugar7(h);
		mycustomerservice.getGlycosylated(h);
		mycustomerservice.getCholesterol(h);
		mycustomerservice.getTriglyceride(h);
		mycustomerservice.getHighlipoprotein(h);
		mycustomerservice.getLowlipoprotein(h);
		mycustomerservice.getHomocysteine(h);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.gethealths());
		rep.getWriter().print(jsonStr);
	}
	
	//输出电话回访记录（微信）
	@RequestMapping("WXmemberhf")
	public void WXmemberhf(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		member_sale sale=new member_sale();
		//String memcardno=(String) req.getSession().getAttribute("memcardno");
		sale.setMEMCARDNO(memcardno);
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		sale.setCALLER(uid);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getMemberhf(sale));
		rep.getWriter().print(jsonStr);
	}
	
	//查询患病信息
	@RequestMapping("getDisease")
	public void getDisease(@RequestParam String memcardno,@RequestParam String compid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_disease disease=new t_crm_disease();
		disease.setMemcardno(memcardno);
		disease.setCompid(Integer.parseInt(compid));
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getDisease(disease));
		rep.getWriter().print(jsonStr);
	}
	
	//查询病种信息
	@RequestMapping("getEntity")
	public void getEntity(@RequestParam String compid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_entity entity=new t_crm_entity();
		entity.setCOMPID(Integer.parseInt(compid));
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getEntity(entity));
		rep.getWriter().print(jsonStr);
	}
	
	//查询病种类型信息
	@RequestMapping("getEntityType")
	public void getEntityType(@RequestParam String entityname,@RequestParam String compid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_entity entity=new t_crm_entity();
		t_crm_entity_type entityType=new t_crm_entity_type();
		Logger log = Logger.getLogger("lavasoft.blog"); 
     	
		int cid=Integer.parseInt(compid);
		entity.setCOMPID(cid);
		entityname= URLDecoder.decode(entityname, "UTF-8");
		entity.setENTITYNAME(entityname);
		log.info("getEntityType前===="+gson.toJson(entity));
		entity=mycustomerservice.getEntityByCompid(entity);
		log.info("getEntityType后===="+gson.toJson(entity));
		entityType.setENTITYID(entity.getENTITYID());
		entityType.setCOMPID(Integer.parseInt(compid));
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getEntityType(entityType));
		rep.getWriter().print(jsonStr);
	}
	
	//查询病种对应基本症状信息
	@RequestMapping("getEntitySymptom")
	public void getEntitySymptom(@RequestParam String entityname,@RequestParam String compid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_entity entity=new t_crm_entity();
		t_crm_entity_symptom entitySymptom=new t_crm_entity_symptom();
		Logger log = Logger.getLogger("lavasoft.blog"); 
		int cid=Integer.parseInt(compid);
		entity.setCOMPID(cid);
		entityname= URLDecoder.decode(entityname, "UTF-8");
		entity.setENTITYNAME(entityname);
		log.info("getEntitySymptom前===="+gson.toJson(entity));
		entity=mycustomerservice.getEntityByCompid(entity);
		log.info("getEntitySymptom中===="+gson.toJson(entity));
		entitySymptom.setENTITYID(entity.getENTITYID());
		entitySymptom.setCOMPID(Integer.parseInt(compid));
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		log.info("getEntitySymptom后===="+gson.toJson(mycustomerservice.getEntitySymptom(entitySymptom)));
		String jsonStr=gson.toJson(mycustomerservice.getEntitySymptom(entitySymptom));
		
		rep.getWriter().print(jsonStr);
	}
	
	//查询病种对应并发症状信息
	@RequestMapping("getEntitySyndrome")
	public void getEntitySyndrome(@RequestParam String entityname,@RequestParam String compid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_entity entity=new t_crm_entity();
		t_crm_entity_syndrome entitySyndrome=new t_crm_entity_syndrome();
		Logger log = Logger.getLogger("lavasoft.blog"); 
		int cid=Integer.parseInt(compid);
		entity.setCOMPID(cid);
		entityname= URLDecoder.decode(entityname, "UTF-8");
		entity.setENTITYNAME(entityname);
		log.info("getEntitySyndrome前===="+gson.toJson(entity));
		entity=mycustomerservice.getEntityByCompid(entity);
		log.info("getEntitySyndrome中===="+gson.toJson(entity));
		entitySyndrome.setENTITYID(entity.getENTITYID());
		entitySyndrome.setCOMPID(Integer.parseInt(compid));
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		log.info("getEntitySymptom后===="+gson.toJson(mycustomerservice.getEntitySyndrome(entitySyndrome)));
		String jsonStr=gson.toJson(mycustomerservice.getEntitySyndrome(entitySyndrome));
		rep.getWriter().print(jsonStr);
	}
	
	//添加病患信息
	@RequestMapping("addDisease")
	public void addDisease(@RequestParam String memcardno,
						  @RequestParam String compid,
						  @RequestParam String diseasename,
						  @RequestParam String diseasetype,
						  @RequestParam String treatmentstate,
						  @RequestParam String concurrent,
						  @RequestParam String pathogeny,
						  @RequestParam String symptom,
						  @RequestParam String fileno,
						  HttpServletRequest req,HttpServletResponse rep) throws IOException{
		int cid=Integer.parseInt(compid);
		t_crm_entity entity=new t_crm_entity();
		entity.setCOMPID(cid);
		entity.setENTITYNAME(diseasename);
		entity=mycustomerservice.getEntityByCompid(entity);
		
		t_crm_disease disease=new t_crm_disease();
		disease.setCompid(cid);
		disease.setFileno(fileno);
		disease.setBillno(mycustomerservice.getBillno());
		disease.setMemcardno(memcardno);
		disease.setEntityid(entity.getENTITYID());
		disease.setDiseaseid(entity.getENTITYID());
		disease.setDiseasetype(diseasetype);
		disease.setDiseasename(diseasename);
		//disease.setShootingtime(shootingtime);
		disease.setTreatmentstate(treatmentstate);
		disease.setPathogeny(pathogeny);
		disease.setConcurrent(concurrent);
		disease.setSymptoms(symptom);
		t_crm_addhealth h=new t_crm_addhealth();
		h.setCOMPID(cid);
		h.setMEMCARDNO(memcardno);
		disease.setFileno(mycustomerservice.getFileno(h));
		
		int num=mycustomerservice.addDisease(disease);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(num);
		rep.getWriter().print(jsonStr);
	}
	
	//添加病患信息
	@RequestMapping("updateDisease")
	public void updateDisease(@RequestParam String memcardno,
							  @RequestParam String compid,
							  @RequestParam String diseasename,
							  @RequestParam String diseasetype,
							  @RequestParam String treatmentstate,
							  @RequestParam String concurrent,
							  HttpServletRequest req,HttpServletResponse rep) throws IOException{
			
		int cid=Integer.parseInt(compid);
		t_crm_entity entity=new t_crm_entity();
		entity.setCOMPID(cid);
		entity.setENTITYNAME(diseasename);
		entity=mycustomerservice.getEntityByCompid(entity);
			
		t_crm_disease disease=new t_crm_disease();
		disease.setCompid(cid);
		disease.setBillno(mycustomerservice.getBillno());
		disease.setFileno("1712050001003");
		//disease.setFileno(mycustomerservice.getFileno(memcardno));
		disease.setMemcardno(memcardno);
		disease.setEntityid(entity.getENTITYID());
		disease.setDiseaseid(entity.getENTITYID());
		disease.setDiseasetype(diseasetype);
		disease.setDiseasename(diseasename);
		//disease.setShootingtime(shootingtime);
		disease.setTreatmentstate(treatmentstate);
		//disease.setPathogeny(pathogeny);
		disease.setConcurrent(concurrent);
		int num=mycustomerservice.updateDisease(disease);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(num);
		rep.getWriter().print(jsonStr);
	}
	
	//添加病患信息
	@RequestMapping("updateDiseaseStatus")
	public void updateDiseaseStatus(@RequestParam String treatmentstate,@RequestParam String entityid,@RequestParam String compid,@RequestParam String billno,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		
		t_crm_disease_note note=new t_crm_disease_note();
		note.setBillno(billno);
		note.setEntityid(entityid);
		note.setCompid(Integer.parseInt(compid));
		note.setTreatmentstate(treatmentstate);
		int num=mycustomerservice.updateDiseaseStatus(note);
		
		if(num==0){
			t_crm_disease dis=new t_crm_disease();
			dis.setBillno(billno);
			dis.setEntityid(entityid);
			dis.setCompid(Integer.parseInt(compid));
			dis=mycustomerservice.getDiseaseByBillno(dis);
			t_crm_disease_note diseaseNote=new t_crm_disease_note();
			diseaseNote.setCompid(dis.getCompid());
			diseaseNote.setBillno(dis.getBillno());
			diseaseNote.setMemcardno(dis.getMemcardno());
			diseaseNote.setEntityid(dis.getEntityid());
			diseaseNote.setDiseaseid(dis.getDiseaseid());
			diseaseNote.setDiseasename(dis.getDiseasename());
			diseaseNote.setDiseasetype(dis.getDiseasetype());
			diseaseNote.setTreatmentstate(dis.getTreatmentstate());
			//diseaseNote.setConcurrent(dis.getConcurrent());
			diseaseNote.setShootingtime(dis.getShootingtime());
			//diseaseNote.setSymptoms(dis.getSymptoms());
			diseaseNote.setFileno(dis.getFileno());
			int count=mycustomerservice.addDiseaseNote(diseaseNote);
			diseaseNote.setBillno(billno);
			diseaseNote.setEntityid(entityid);
			diseaseNote.setCompid(Integer.parseInt(compid));
			diseaseNote.setTreatmentstate(treatmentstate);
			int num2=mycustomerservice.updateDiseaseStatus(diseaseNote);
		}
		
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(num);
		rep.getWriter().print(jsonStr);
			
	}
	
	//查询家庭健康档案信息(除本人以外)
	@RequestMapping("getMemberRelationShip")
	public void getMemberRelationShip(@RequestParam String memcardno,@RequestParam String compid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
	   t_crm_health_list healthList=new t_crm_health_list();
	   healthList.setMEMCARDNO(memcardno);
	   healthList.setCOMPID(Integer.parseInt(compid));
	   
	   ArrayList<t_crm_health_list> list=mycustomerservice.getMemberRelationShip(healthList);
	   
	   for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getFILETYPE()==null){
				list.get(i).setFILETYPE(0);
			}
		}
	   
	   rep.setCharacterEncoding("UTF-8");  
	   rep.setContentType("text/html;charset=UTF-8");
	   
	   String jsonStr=gson.toJson(list);
	   rep.getWriter().print(jsonStr);
	}
	
	//查询家庭健康档案信息(本人)
	@RequestMapping("getMemberRelationShipMe")
	public void getMemberRelationShipMe(@RequestParam String memcardno,@RequestParam String compid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
	   t_crm_health_list healthList=new t_crm_health_list();
	   healthList.setMEMCARDNO(memcardno);
	   healthList.setCOMPID(Integer.parseInt(compid));
	   String jsonStr;  
	   t_crm_health_list list=mycustomerservice.getMemberRelationShipMe(healthList);
	   if(list==null){
		   jsonStr=gson.toJson("未添加");
	   }
	   rep.setCharacterEncoding("UTF-8");  
	   rep.setContentType("text/html;charset=UTF-8"); 
	   jsonStr=gson.toJson(list);
	   rep.getWriter().print(jsonStr);
	}
	
	//查询家庭健康档案信息(个人明细)
	@RequestMapping("getMemberRelationShipDetails")
	public void getMemberRelationShipDetails(@RequestParam String memcardno,@RequestParam String compid,@RequestParam String fileno,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_health_list healthList=new t_crm_health_list();
		healthList.setMEMCARDNO(memcardno);
		healthList.setCOMPID(Integer.parseInt(compid));
		healthList.setFILENO(fileno);
			   
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getMemberRelationShipDetails(healthList));
		rep.getWriter().print(jsonStr);
	}
	
	//查询用药记录
	@RequestMapping("getDrug")
	public void getDrug(@RequestParam String memcardno,@RequestParam String compid,@RequestParam String fileno,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_drug drug=new t_crm_drug();
		drug.setMEMCARDNO(memcardno);
		drug.setCOMPID(Integer.parseInt(compid));
		drug.setFILENO(fileno);
				   
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getDrug(drug));
		rep.getWriter().print(jsonStr);
	}
	
	//查询用药记录明细
	@RequestMapping("getDrugDetails")
	public void getDrugDetails(@RequestParam String memcardno,@RequestParam String compid,@RequestParam String fileno,@RequestParam String wareid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_drug drug=new t_crm_drug();
		drug.setMEMCARDNO(memcardno);
		drug.setCOMPID(Integer.parseInt(compid));
		drug.setFILENO(fileno);
		drug.setWAREID(Integer.parseInt(wareid));
					   
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(mycustomerservice.getDrugDetails(drug));
		rep.getWriter().print(jsonStr);
	}
	
	//修改用药信息
	@RequestMapping("updateDrug")
	public void updateDrug(@RequestParam String availabledays,
						   @RequestParam String stilluse,
						   @RequestParam String startTime,
						   @RequestParam String endTime,
						   @RequestParam String compid,
						   @RequestParam String notes,
						   @RequestParam String wareid,
						   @RequestParam String wareidtag,
						   HttpServletRequest req,HttpServletResponse rep) throws IOException, ParseException{
				
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");			
		t_crm_drug_note drugNote=new t_crm_drug_note();
		int widtag;
		int num = 0;
		int wid=Integer.parseInt(wareid);
		if(wareidtag==""){
			widtag=Integer.parseInt("1");
		}else{
			widtag=Integer.parseInt(wareidtag);
		}
		
		drugNote.setCOMPID(Integer.parseInt(compid));
		drugNote.setNOTES(notes);
		drugNote.setWAREID(wid);
		drugNote.setAVAILABLEDAYS(Integer.parseInt(availabledays));
		if(stilluse.equals("使用中")){
			drugNote.setSTILLUSE(1);
		}else{
			drugNote.setSTILLUSE(0);
		}
		drugNote.setSTARTTIME(dateFormat.parse(startTime));
		drugNote.setENDTIME(dateFormat.parse(endTime));
		if(widtag==1){
			num=mycustomerservice.updateDrug(drugNote);
		}else{
			num=mycustomerservice.updateDrug(drugNote);
			drugNote.setWAREID(widtag);
			num=mycustomerservice.updateDrugWareid(drugNote);
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(num);
		rep.getWriter().print(jsonStr);
	}
	
	//新增用药信息
	@RequestMapping("addDrug")
	public void addDrug(@RequestParam String warecode,
						@RequestParam String warename,
					    @RequestParam String factoryname,
					    @RequestParam String usage,
						@RequestParam String warespec,
						@RequestParam String availabledays,
					    @RequestParam String stilluse,
						@RequestParam String startTime,
						@RequestParam String endTime,
						@RequestParam String compid,
						@RequestParam String fileno,
						@RequestParam String notes,
						@RequestParam String memcardno,
						@RequestParam String wareid,
						HttpServletRequest req,HttpServletResponse rep) throws IOException, ParseException{
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");			
		t_crm_drug_note drugNote=new t_crm_drug_note();
		drugNote.setCOMPID(Integer.parseInt(compid));
		drugNote.setMEMCARDNO(memcardno);
		drugNote.setBILLNO(mycustomerservice.getBillno());
		drugNote.setFILENO(fileno);
		drugNote.setWARECODE(warecode);
		drugNote.setWARENAME(warename);
		drugNote.setFACTORYNAME(factoryname);
		drugNote.setWARESPEC(warespec);
		drugNote.setUSAGE(usage);
		drugNote.setWAREID(Integer.parseInt(wareid));
		drugNote.setAVAILABLEDAYS(Integer.parseInt(availabledays));
		if(stilluse.equals("使用中")){
			drugNote.setSTILLUSE(1);
		}else{
			drugNote.setSTILLUSE(0);
		}
		drugNote.setSTARTTIME(dateFormat.parse(startTime));
		drugNote.setENDTIME(dateFormat.parse(endTime));
		drugNote.setNOTES(notes);
		int num=mycustomerservice.addDrug(drugNote);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(num);
		rep.getWriter().print(jsonStr);
	}
	
	//检索商品
	@RequestMapping("getWare")
	public void getWare(@RequestParam String ware,@RequestParam String compid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_ware wares=new t_crm_ware();
		String jsonStr = null;
//		String wareTag=ware.substring(0,1);
//		if(wareTag=="1"||wareTag=="2"||wareTag=="3"||wareTag=="4"||wareTag=="5"||wareTag=="6"||wareTag=="7"||wareTag=="8"||wareTag=="9"||wareTag=="0"){
//			wares.setCOMPID(Integer.parseInt(compid));
//			wares.setWARECODE(ware);
//			wares.setWAREID(Integer.parseInt(ware));
//			jsonStr=gson.toJson(mycustomerservice.getWare(wares));
//		}else{
//			wares.setCOMPID(Integer.parseInt(compid));getClass();
//			wares.setWARENAME(ware);
//			wares.setWAREABC(ware);
//			jsonStr=gson.toJson(mycustomerservice.getWareName(wares));
//		}
		
		if(strIsEnglish(ware)){
			wares.setCOMPID(Integer.parseInt(compid));
			wares.setWAREABC(ware);
			jsonStr=gson.toJson(mycustomerservice.getWareEnglish(wares));
		}else if(strIsNumber(ware)){
			wares.setCOMPID(Integer.parseInt(compid));
			wares.setWARECODE(ware);
			jsonStr=gson.toJson(mycustomerservice.getWare(wares));
		}else{
			wares.setCOMPID(Integer.parseInt(compid));getClass();
			wares.setWARENAME(ware);
			jsonStr=gson.toJson(mycustomerservice.getWareName(wares));
		}
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		
		rep.getWriter().print(jsonStr);
	}
	
	//判断表示是否全为英文  
    private boolean strIsEnglish(String str) {  
        for (int i = 0; i < str.length(); i++) {  
            if (!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')  
                    && !(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {  
                return false;  
            }  
        }  
        return true;  
    }  
    
    private boolean strIsNumber(String str){
    	for (int i = str.length();--i>=0;){   
    	   if (!Character.isDigit(str.charAt(i))){
    	    return false;
    	   }
        }
    	  return true;
    }
	
	//查询会员健康信息
	@RequestMapping("getHealthModilis")
	public void getHealthModilis(@RequestParam String memcardno,@RequestParam String compid,@RequestParam String fileno,@RequestParam String type,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		    req.setCharacterEncoding("UTF-8");
		    t_crm_health_list health=new t_crm_health_list();
	     	health.setMEMCARDNO(memcardno);
	     	health.setCOMPID(Integer.parseInt(compid));
	     	health.setFILENO(fileno);
	     	type= URLDecoder.decode(type, "UTF-8");
	     	health.setTYPE(type);
	     	Logger log = Logger.getLogger("lavasoft.blog"); 
	     	log.info("===="+gson.toJson(health));
			rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			String jsonStr=gson.toJson(mycustomerservice.getHealthModilis(health));
			log.info(jsonStr);
			rep.getWriter().print(jsonStr);
	}
	
	//新增家庭健康档案信息
	@RequestMapping("addMembers")
	public void addMembers(@RequestParam String memcardno,
						@RequestParam String CARDHOLDER,
						@RequestParam String SEX,
						@RequestParam String IDCARD,
						@RequestParam String FAMILY,
						@RequestParam String MODBUSNO,
						@RequestParam String MEDICAL,
						@RequestParam String FILETYPE,
						@RequestParam String MOBILE,
						@RequestParam String EMECONTACT,
						@RequestParam String TEL,
						@RequestParam String HEIGHT,
						@RequestParam String WEIGHT,
						@RequestParam String TEMPERATURE,
						@RequestParam String STEPS,
						@RequestParam String OXYGEN,
						@RequestParam String SYSTOLIC,
						@RequestParam String DIASTOLIC,
						@RequestParam String HEARTRATE,
						@RequestParam String BLOODSUGAR1,
						@RequestParam String BLOODSUGAR2,
						@RequestParam String BLOODSUGAR3,
						@RequestParam String BLOODSUGAR4,
						@RequestParam String BLOODSUGAR5,
						@RequestParam String BLOODSUGAR6,
						@RequestParam String BLOODSUGAR7,
						@RequestParam String BLOODSUGAR8,
						@RequestParam String GLYCOSYLATED,
						@RequestParam String CHOLESTEROL,
						@RequestParam String TRIGLYCERIDE,
						@RequestParam String HIGHLIPOPROTEIN,
						@RequestParam String LOWLIPOPROTEIN,
						@RequestParam String HOMOCYSTEINE,
						@RequestParam String diseasename,
						@RequestParam String diseasetype,
						@RequestParam String treatmentstate,
						@RequestParam String symptom,
						@RequestParam String concurrent,
						@RequestParam String pathogeny,
						@RequestParam String warecode,
						@RequestParam String warename,
					    @RequestParam String factoryname,
					    @RequestParam String usage,
						@RequestParam String warespec,
						@RequestParam String availabledays,
					    @RequestParam String stilluse,
						@RequestParam String startTime,
						@RequestParam String endTime,
						@RequestParam String notes,
						@RequestParam String wareid,
						@RequestParam String compid,
						HttpServletRequest req,HttpServletResponse rep) throws IOException, ParseException{
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");			
			
			//健康会员
			t_crm_health_modilis healthModilis=new t_crm_health_modilis();
			healthModilis.setCOMPID(Integer.parseInt(compid));
			healthModilis.setFILENO(mycustomerservice.getNewFileno());
			healthModilis.setMEMCARDNO(memcardno);
			
			CARDHOLDER= URLDecoder.decode(CARDHOLDER, "UTF-8");
			if(CARDHOLDER==null||CARDHOLDER==""){
				healthModilis.setCARDHOLDER("无");
			}else{
				healthModilis.setCARDHOLDER(CARDHOLDER);
			}
			
			SEX= URLDecoder.decode(SEX, "UTF-8");
			if(SEX==null||SEX==""){
				healthModilis.setSEX("女");
			}else{
				healthModilis.setSEX(SEX);
			}
			
			if(IDCARD==null||IDCARD==""){
				healthModilis.setIDCARD("1");
			}else{
				healthModilis.setIDCARD(IDCARD);
			}
			
			if(MODBUSNO==null||MODBUSNO==""){
				healthModilis.setMODBUSNO(1);
			}else{
				healthModilis.setMODBUSNO(Integer.parseInt(MODBUSNO));
			}
			
			MEDICAL= URLDecoder.decode(MEDICAL, "UTF-8");
			if(MEDICAL==null||MEDICAL==""){
				healthModilis.setMEDICAL("01");
			}else{
				healthModilis.setMEDICAL(MEDICAL);
			}
			
			FILETYPE= URLDecoder.decode(FILETYPE, "UTF-8");
			if(FILETYPE.equals("普通")){
				healthModilis.setFILETYPE(0);
			}else{
				healthModilis.setFILETYPE(1);
			}
			
			healthModilis.setBILLNO(mycustomerservice.getBillno());
			
			if(MOBILE==null||MOBILE==""){
				healthModilis.setMOBILE("无");
			}else{
				healthModilis.setMOBILE(MOBILE);
			}
			
			if(MODBUSNO==null||MODBUSNO==""){
				healthModilis.setBUSNO(1);
			}else{
				healthModilis.setBUSNO(Integer.parseInt(MODBUSNO));
			}
			
			EMECONTACT= URLDecoder.decode(EMECONTACT, "UTF-8");
			if(EMECONTACT==null||EMECONTACT==""){
				healthModilis.setEMECONTACT("1无");
			}else{
				healthModilis.setEMECONTACT(EMECONTACT);
			}
			
			if(TEL==null||TEL==""){
				healthModilis.setTEL("无");
			}else{
				healthModilis.setTEL(TEL);
			}
			
			if(HEIGHT==null||HEIGHT==""){
				healthModilis.setHEIGHT(0);
			}else{
				healthModilis.setHEIGHT(Integer.parseInt(HEIGHT));
			}
			
			if(WEIGHT==null||WEIGHT==""){
				healthModilis.setWEIGHT(0);
			}else{
				healthModilis.setWEIGHT(Integer.parseInt(WEIGHT));
			}
			
			if(TEMPERATURE==null||TEMPERATURE==""){
				healthModilis.setTEMPERATURE(0);
			}else{
				healthModilis.setTEMPERATURE(Integer.parseInt(TEMPERATURE));
			}
			
			if(STEPS==null||STEPS==""){
				healthModilis.setSTEPS(0);
			}else{
				healthModilis.setSTEPS(Integer.parseInt(STEPS));
			}
			
			if(OXYGEN==null||OXYGEN==""){
				healthModilis.setOXYGEN(0);
			}else{
				healthModilis.setOXYGEN(Integer.parseInt(OXYGEN));
			}
			
			if(SYSTOLIC==null||SYSTOLIC==""){
				healthModilis.setSYSTOLIC(0);
			}else{
				healthModilis.setSYSTOLIC(Integer.parseInt(SYSTOLIC));
			}
			
			if(DIASTOLIC==null||DIASTOLIC==""){
				healthModilis.setDIASTOLIC(0);
			}else{
				healthModilis.setDIASTOLIC(Integer.parseInt(DIASTOLIC));
			}
			
			if(HEARTRATE==null||HEARTRATE==""){
				healthModilis.setHEARTRATE(0);
			}else{
				healthModilis.setHEARTRATE(Integer.parseInt(HEARTRATE));
			}
			
			if(BLOODSUGAR1==null||BLOODSUGAR1==""){
				healthModilis.setBLOODSUGAR1(0);
			}else{
				healthModilis.setBLOODSUGAR1(Integer.parseInt(BLOODSUGAR1));
			}
			
			if(BLOODSUGAR2==null||BLOODSUGAR2==""){
				healthModilis.setBLOODSUGAR2(0);
			}else{
				healthModilis.setBLOODSUGAR2(Integer.parseInt(BLOODSUGAR2));
			}
			if(BLOODSUGAR3==null||BLOODSUGAR3==""){
				healthModilis.setBLOODSUGAR3(0);
			}else{
				healthModilis.setBLOODSUGAR3(Integer.parseInt(BLOODSUGAR3));
			}
			if(BLOODSUGAR4==null||BLOODSUGAR4==""){
				healthModilis.setBLOODSUGAR4(0);
			}else{
				healthModilis.setBLOODSUGAR4(Integer.parseInt(BLOODSUGAR4));
			}
			if(BLOODSUGAR5==null||BLOODSUGAR5==""){
				healthModilis.setBLOODSUGAR5(0);
			}else{
				healthModilis.setBLOODSUGAR5(Integer.parseInt(BLOODSUGAR5));
			}
			if(BLOODSUGAR6==null||BLOODSUGAR6==""){
				healthModilis.setBLOODSUGAR6(0);
			}else{
				healthModilis.setBLOODSUGAR6(Integer.parseInt(BLOODSUGAR6));
			}
			if(BLOODSUGAR7==null||BLOODSUGAR7==""){
				healthModilis.setBLOODSUGAR7(0);
			}else{
				healthModilis.setBLOODSUGAR7(Integer.parseInt(BLOODSUGAR7));
			}
			if(BLOODSUGAR8==null||BLOODSUGAR8==""){
				healthModilis.setBLOODSUGAR8(0);
			}else{
				healthModilis.setBLOODSUGAR8(Integer.parseInt(BLOODSUGAR8));
			}
			
			if(GLYCOSYLATED==null||GLYCOSYLATED==""){
				healthModilis.setGLYCOSYLATED(0);
			}else{
				healthModilis.setGLYCOSYLATED(Integer.parseInt(GLYCOSYLATED));
			}
			if(CHOLESTEROL==null||CHOLESTEROL==""){
				healthModilis.setCHOLESTEROL(0);
			}else{
				healthModilis.setCHOLESTEROL(Integer.parseInt(CHOLESTEROL));
			}
			
			if(TRIGLYCERIDE==null||TRIGLYCERIDE==""){
				healthModilis.setTRIGLYCERIDE(0);
			}else{
				healthModilis.setTRIGLYCERIDE(Integer.parseInt(TRIGLYCERIDE));
			}
			if(HIGHLIPOPROTEIN==null||HIGHLIPOPROTEIN==""){
				healthModilis.setHIGHLIPOPROTEIN(0);
			}else{
				healthModilis.setHIGHLIPOPROTEIN(Integer.parseInt(HIGHLIPOPROTEIN));
			}
			if(LOWLIPOPROTEIN==null||LOWLIPOPROTEIN==""){
				healthModilis.setLOWLIPOPROTEIN(0);
			}else{
				healthModilis.setLOWLIPOPROTEIN(Integer.parseInt(LOWLIPOPROTEIN));
			}
			FAMILY= URLDecoder.decode(FAMILY, "UTF-8");
			if(FAMILY==null||FAMILY==""){
				healthModilis.setTYPE("本人");
			}else{
				healthModilis.setTYPE(FAMILY);
			}
			//Log log = Log.getLogger();
			
			Logger log = Logger.getLogger("lavasoft.blog"); 
			log.info("healthModilis前=="+gson.toJson(healthModilis));
			int num2=mycustomerservice.addMembers(healthModilis);
			log.info("addMembers=="+num2);
			num2=mycustomerservice.updateMembersStatus(healthModilis);
			log.info("updateMembersStatus=="+num2);
			
			//病患
			t_crm_entity entity=new t_crm_entity();
			entity.setCOMPID(Integer.parseInt(compid));
			diseasename= URLDecoder.decode(diseasename, "UTF-8");
			if(diseasename==null||diseasename==""){
				entity.setENTITYNAME("糖尿病");
			}else{
				entity.setENTITYNAME(diseasename);
			}
			entity=mycustomerservice.getEntityByCompid(entity);
			log.info("getEntityByCompid=="+entity);
			t_crm_disease disease=new t_crm_disease();
			disease.setCompid(Integer.parseInt(compid));
			disease.setFileno(mycustomerservice.getNewFilenoTop());
			disease.setBillno(mycustomerservice.getNewBillnoTop(mycustomerservice.getNewFilenoTop()));
			disease.setMemcardno(memcardno);
			disease.setEntityid(entity.getENTITYID());
			disease.setDiseaseid(entity.getENTITYID());
			
			diseasetype= URLDecoder.decode(diseasetype, "UTF-8");
			if(diseasetype==null||diseasetype==""){
				disease.setDiseasetype("无");
			}else{
				disease.setDiseasetype(diseasetype);
			}
			
			diseasename= URLDecoder.decode(diseasename, "UTF-8");
			if(diseasename==null||diseasename==""){
				disease.setDiseasename("无");
			}else{
				disease.setDiseasename(diseasename);
			}
			
//			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//			System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
			disease.setShootingtime(new Date());
			treatmentstate= URLDecoder.decode(treatmentstate, "UTF-8");
			if(treatmentstate==null||treatmentstate==""){
				disease.setTreatmentstate("无");
			}else{
				disease.setTreatmentstate(treatmentstate);
			}
			
			pathogeny= URLDecoder.decode(pathogeny, "UTF-8");
			if(pathogeny==null||pathogeny==""){
				disease.setPathogeny("无");
			}else{
				disease.setPathogeny(pathogeny);
			}
			
			concurrent= URLDecoder.decode(concurrent, "UTF-8");
			if(concurrent==null||concurrent==""){
				disease.setConcurrent("无");
			}else{
				disease.setConcurrent(concurrent);
			}
			
			symptom= URLDecoder.decode(symptom, "UTF-8");
			if(symptom==null||symptom==""){
				disease.setSymptoms("无");
			}else{
				disease.setSymptoms(symptom);
			}
			
//			t_crm_addhealth h=new t_crm_addhealth();
//			h.setCOMPID(Integer.parseInt(compid));
//			h.setMEMCARDNO(memcardno);
//			disease.setFileno(mycustomerservice.getFileno(h));
			log.info("disease=="+gson.toJson(disease));
			int num1=mycustomerservice.addDisease(disease);
			log.info("addDisease=="+num1);
			//用药
			t_crm_drug_note drugNote=new t_crm_drug_note();
			drugNote.setCOMPID(Integer.parseInt(compid));
			drugNote.setMEMCARDNO(memcardno);
			drugNote.setFILENO(mycustomerservice.getNewFilenoTop());
			drugNote.setBILLNO(mycustomerservice.getNewBillnoTop(mycustomerservice.getNewFilenoTop()));
			warecode= URLDecoder.decode(warecode, "UTF-8");
			if(warecode==null||warecode==""){
				drugNote.setWARECODE("1");
			}else{
				drugNote.setWARECODE(warecode);
			}
			
			warename= URLDecoder.decode(warename, "UTF-8");
			if(warename==null||warename==""){
				drugNote.setWARENAME("1");
			}else{
				drugNote.setWARENAME(warename);
			}
			
			factoryname= URLDecoder.decode(factoryname, "UTF-8");
			if(factoryname==null||factoryname==""){
				drugNote.setFACTORYNAME("1");
			}else{
				drugNote.setFACTORYNAME(factoryname);
			}
			
			warespec= URLDecoder.decode(warespec, "UTF-8");
			if(warespec==null||warespec==""){
				drugNote.setWARESPEC("1");
			}else{
				drugNote.setWARESPEC(warespec);
			}
			
			usage= URLDecoder.decode(usage, "UTF-8");
			if(usage==null||usage==""){
				drugNote.setUSAGE("无");
			}else{
				drugNote.setUSAGE(usage);
			}
			
			if(wareid==null||wareid==""){
				drugNote.setWAREID(1);
			}else{
				drugNote.setWAREID(Integer.parseInt(wareid));
			}
			
			availabledays= URLDecoder.decode(availabledays, "UTF-8");
			if(availabledays==null||availabledays==""){
				drugNote.setAVAILABLEDAYS(1);
			}else{
				drugNote.setAVAILABLEDAYS(Integer.parseInt(availabledays));
			}
			
			stilluse= URLDecoder.decode(stilluse, "UTF-8");
			if(stilluse==null||stilluse==""){
				drugNote.setSTILLUSE(1);
			}else{
				if(stilluse.equals("使用中")){
					drugNote.setSTILLUSE(1);
				}else{
					drugNote.setSTILLUSE(0);
				}
			}
			
			drugNote.setSTARTTIME(new Date());
			drugNote.setENDTIME(new Date());
			notes= URLDecoder.decode(notes, "UTF-8");
			if(notes==null||notes==""){
				drugNote.setNOTES("无");
			}else{
				drugNote.setNOTES(notes);
			}
			
			log.info("drugNote=="+gson.toJson(drugNote));
			int num=mycustomerservice.addDrug(drugNote);
			log.info("addDrug=="+num);
			rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			String jsonStr=gson.toJson(num2);
			rep.getWriter().print(jsonStr);
		}
	
	//修改信息
	@RequestMapping("updateMembers")
	public void updateMembers(@RequestParam String memcardno,
							  @RequestParam String compid,
							  @RequestParam String fileno,
							  @RequestParam String CARDHOLDER,
							  @RequestParam String SEX,
							 // @RequestParam String IDCARD,
							 //@RequestParam String TEL,
							 // @RequestParam String ADDRESS,
							  @RequestParam String family_identity,
							  @RequestParam String MEDICAL,
							  @RequestParam String FILETYPE,
							 // @RequestParam String EMECONTACT,
							//  @RequestParam String mobile,
							  @RequestParam String modbusno,
							  HttpServletRequest req,HttpServletResponse rep) throws IOException{
			//int cid=Integer.parseInt(compid);
			
			t_crm_health_modilis health_modilis=new t_crm_health_modilis();
			health_modilis.setCOMPID(Integer.parseInt(compid));
			health_modilis.setMEMCARDNO(memcardno);
			health_modilis.setFILENO(fileno);
			health_modilis.setCARDHOLDER(CARDHOLDER);
			health_modilis.setSEX(SEX);
			//health_modilis.setIDCARD(IDCARD);
			//health_modilis.setTEL(TEL);
			health_modilis.setTYPE(family_identity);
			health_modilis.setBILLNO(mycustomerservice.getBillno());
			health_modilis.setMODBUSNO(Integer.parseInt(modbusno));
			
//			if(MEDICAL=="省医保"){
//				health_modilis.setMEDICAL("01");
//			}else if(MEDICAL=="市医保"){
//				health_modilis.setMEDICAL("02");
//			}else if(MEDICAL=="新农合"){
//				health_modilis.setMEDICAL("03");
//			}else{
//				health_modilis.setMEDICAL("04");
//			}
			health_modilis.setMEDICAL(MEDICAL);
			if(FILETYPE=="慢病"){
				health_modilis.setFILETYPE(1);;
			}else{
				health_modilis.setFILETYPE(0);;
			}
			//health_modilis.setEMECONTACT(EMECONTACT);
			//health_modilis.setMOBILE(mobile);
			
			int num=mycustomerservice.updateMembers(health_modilis);
			num=mycustomerservice.updateMembersStatus(health_modilis);
			rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			String jsonStr=gson.toJson(num);
			rep.getWriter().print(jsonStr);
		}
	
}
