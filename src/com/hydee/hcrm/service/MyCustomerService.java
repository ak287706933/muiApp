package com.hydee.hcrm.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.hydee.hcrm.mapper.MyCustomerMapper;
import com.hydee.hcrm.pojo.AdvancedUtil;
import com.hydee.hcrm.pojo.Page;
import com.hydee.hcrm.pojo.WeixinOauth2Token;
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

@Service
public class MyCustomerService {
	@Resource
	private MyCustomerMapper mycustomer;
	//输出所有健康信息
	private t_crm_health_list healths=new t_crm_health_list();
	
	public t_crm_health_list gethealths() {
		
		return healths;
	}
	
	public void sethealth(t_crm_health_list healths){
		
		this.healths = healths;
	}
	//获取客户数
	public String getClientCount(t_crm_memcard_reg reg){
		
		return mycustomer.getClientCount(reg);
	}
	
	//获取客户列表
	public ArrayList<t_crm_memcard_reg> getClientList(Page page){
		
		return mycustomer.getClientList(page);
	}
	
	//按反馈时间输出客户列表
	public ArrayList<t_crm_memcard_reg> getClientTime(Page page){
		
		return mycustomer.getClientTime(page);
	}
	
	//按最后购买时间输出客户列表
	public ArrayList<t_crm_memcard_reg> getBuyTime(Page page){
		
		return mycustomer.getBuyTime(page);
	}
	
	//输出账号信息
	public t_crm_memcard_reg getAccountInfo(t_crm_memcard_reg reg){
		
		return mycustomer.getAccountInfo(reg);
	}
	
	//输出回访记录
	public t_crm_memcard_reg getAccessRecord(t_crm_memcard_reg reg){
		
		return mycustomer.getAccessRecord(reg);
	}
	
	//采集健康档案信息
	public int addHealth(t_crm_addhealth health){
		
		return mycustomer.addHealth(health);
	}
	
	public void getHeight(t_crm_addhealth h){
		if(mycustomer.getHeight(h)!=null){
			healths.setHEIGHT(mycustomer.getHeight(h).getVALUE1());
			healths.setCREATETIME1(mycustomer.getHeight(h).getCREATETIME());
		}else{
			healths.setHEIGHT(0);
			healths.setCREATETIME1("--");
		}
	}
	
	public void getWeight(t_crm_addhealth h){
		if(mycustomer.getWeight(h)!=null){
			healths.setWEIGHT(mycustomer.getWeight(h).getVALUE1());
			healths.setCREATETIME2(mycustomer.getWeight(h).getCREATETIME());
		}else{
			healths.setWEIGHT(0);
			healths.setCREATETIME2("--");
		}
	}
	
	public void getTemperature(t_crm_addhealth h){
		if(mycustomer.getTemperature(h)!=null){
			healths.setTEMPERATURE(mycustomer.getTemperature(h).getVALUE1());
			healths.setCREATETIME3(mycustomer.getTemperature(h).getCREATETIME());
		}else{
			healths.setTEMPERATURE(0);
			healths.setCREATETIME3("--");
		}
	}
	
	public void getHeartrate(t_crm_addhealth h){
		if(mycustomer.getHeartrate(h)!=null){
			healths.setHEARTRATE(mycustomer.getHeartrate(h).getVALUE1());
			healths.setCREATETIME4(mycustomer.getHeartrate(h).getCREATETIME());
		}else{
			healths.setHEARTRATE(0);
			healths.setCREATETIME4("--");
		}
	}
	
	public void getSteps(t_crm_addhealth h){
		if(mycustomer.getSteps(h)!=null){
			healths.setSTEPS(mycustomer.getSteps(h).getVALUE1());
			healths.setCREATETIME5(mycustomer.getSteps(h).getCREATETIME());
		}else{
			healths.setSTEPS(0);
			healths.setCREATETIME5("--");
		}
	}
	
	public void getSystolic(t_crm_addhealth h){
		if(mycustomer.getSystolic(h)!=null){
			healths.setSYSTOLIC(mycustomer.getSystolic(h).getVALUE1());
			healths.setCREATETIME6(mycustomer.getSystolic(h).getCREATETIME());
		}else{
			healths.setSYSTOLIC(0);
			healths.setCREATETIME6("--");
		}
	}
	
	public void getDiastolic(t_crm_addhealth h){
		if(mycustomer.getDiastolic(h)!=null){
			healths.setDIASTOLIC(mycustomer.getDiastolic(h).getVALUE2());
			healths.setCREATETIME7(mycustomer.getDiastolic(h).getCREATETIME());
		}else{
			healths.setDIASTOLIC(0);
			healths.setCREATETIME7("--");
		}
	}
	
	public void getOxygen(t_crm_addhealth h){
		if(mycustomer.getOxygen(h)!=null){
			healths.setOXYGEN(mycustomer.getOxygen(h).getVALUE1());
			healths.setCREATETIME8(mycustomer.getOxygen(h).getCREATETIME());
		}else{
			healths.setOXYGEN(0);
			healths.setCREATETIME8("--");
		}
	}
	
	public void getBloodsugar1(t_crm_addhealth h){
		if(mycustomer.getBloodsugar1(h)!=null){
			healths.setBLOODSUGAR1(mycustomer.getBloodsugar1(h).getVALUE1());
			healths.setCREATETIME9(mycustomer.getBloodsugar1(h).getCREATETIME());
		}else{
			healths.setBLOODSUGAR1(0);
			healths.setCREATETIME9("--");
		}
	}
	
	public void getBloodsugar2(t_crm_addhealth h){
		if(mycustomer.getBloodsugar2(h)!=null){
			healths.setBLOODSUGAR2(mycustomer.getBloodsugar2(h).getVALUE1());
			healths.setCREATETIME10(mycustomer.getBloodsugar2(h).getCREATETIME());
		}else{
			healths.setBLOODSUGAR2(0);
			healths.setCREATETIME10("--");
		}
	}
	
	public void getBloodsugar3(t_crm_addhealth h){
		if(mycustomer.getBloodsugar3(h)!=null){
			healths.setBLOODSUGAR3(mycustomer.getBloodsugar3(h).getVALUE1());
			healths.setCREATETIME11(mycustomer.getBloodsugar3(h).getCREATETIME());
		}else{
			healths.setBLOODSUGAR3(0);
			healths.setCREATETIME11("--");
		}
	}
	
	public void getBloodsugar4(t_crm_addhealth h){
		if(mycustomer.getBloodsugar4(h)!=null){
			healths.setBLOODSUGAR4(mycustomer.getBloodsugar4(h).getVALUE1());
			healths.setCREATETIME12(mycustomer.getBloodsugar4(h).getCREATETIME());
		}else{
			healths.setBLOODSUGAR4(0);
			healths.setCREATETIME12("--");
		}
	}
	
	public void getGlycosylated(t_crm_addhealth h){
		if(mycustomer.getGlycosylated(h)!=null){
			healths.setGLYCOSYLATED(mycustomer.getGlycosylated(h).getVALUE1());
			healths.setCREATETIME13(mycustomer.getGlycosylated(h).getCREATETIME());
		}else{
			healths.setGLYCOSYLATED(0);
			healths.setCREATETIME13("--");
		}
	}
	
	public void getCholesterol(t_crm_addhealth h){
		if(mycustomer.getCholesterol(h)!=null){
			healths.setCHOLESTEROL(mycustomer.getCholesterol(h).getVALUE1());
			healths.setCREATETIME14(mycustomer.getCholesterol(h).getCREATETIME());
		}else{
			healths.setCHOLESTEROL(0);
			healths.setCREATETIME14("--");
		}
	}
	
	public void getTriglyceride(t_crm_addhealth h){
		if(mycustomer.getTriglyceride(h)!=null){
			healths.setTRIGLYCERIDE(mycustomer.getTriglyceride(h).getVALUE1());
			healths.setCREATETIME15(mycustomer.getTriglyceride(h).getCREATETIME());
		}else{
			healths.setTRIGLYCERIDE(0);
			healths.setCREATETIME15("--");
		}
	}
	
	public void getHighlipoprotein(t_crm_addhealth h){
		if(mycustomer.getHighlipoprotein(h)!=null){
			healths.setHIGHLIPOPROTEIN(mycustomer.getHighlipoprotein(h).getVALUE1());
			healths.setCREATETIME16(mycustomer.getHighlipoprotein(h).getCREATETIME());
		}else{
			healths.setHIGHLIPOPROTEIN(0);
			healths.setCREATETIME16("--");
		}
	}
	
	public void getLowlipoprotein(t_crm_addhealth h){
		if(mycustomer.getLowlipoprotein(h)!=null){
			healths.setLOWLIPOPROTEIN(mycustomer.getLowlipoprotein(h).getVALUE1());
			healths.setCREATETIME17(mycustomer.getLowlipoprotein(h).getCREATETIME());
		}else{
			healths.setLOWLIPOPROTEIN(0);
			healths.setCREATETIME17("--");
		}
	}
	
	public void getHomocysteine(t_crm_addhealth h){
		if(mycustomer.getHomocysteine(h)!=null){
			healths.setHOMOCYSTEINE(mycustomer.getHomocysteine(h).getVALUE1());
			healths.setCREATETIME18(mycustomer.getHomocysteine(h).getCREATETIME());
		}else{
			healths.setHOMOCYSTEINE(0);
			healths.setCREATETIME18("--");
		}
	}
	//输出晚饭前血糖
	public void getBloodsugar5(t_crm_addhealth h){
		if(mycustomer.getBloodsugar5(h)!=null){
			healths.setBLOODSUGAR5(mycustomer.getBloodsugar5(h).getVALUE1());
			healths.setCREATETIME19(mycustomer.getBloodsugar5(h).getCREATETIME());
		}else{
			healths.setHOMOCYSTEINE(0);
			healths.setCREATETIME19("--");
		}
	}
	//输出晚饭前血糖
	public void getBloodsugar6(t_crm_addhealth h){
		if(mycustomer.getBloodsugar6(h)!=null){
			healths.setBLOODSUGAR6(mycustomer.getBloodsugar6(h).getVALUE1());
			healths.setCREATETIME20(mycustomer.getBloodsugar6(h).getCREATETIME());
		}else{
			healths.setHOMOCYSTEINE(0);
			healths.setCREATETIME20("--");
		}
	}
	//输出晚饭前血糖
	public void getBloodsugar7(t_crm_addhealth h){
		if(mycustomer.getBloodsugar7(h)!=null){
			healths.setBLOODSUGAR7(mycustomer.getBloodsugar7(h).getVALUE1());
			healths.setCREATETIME21(mycustomer.getBloodsugar7(h).getCREATETIME());
		}else{
			healths.setHOMOCYSTEINE(0);
			healths.setCREATETIME21("--");
		}
	}
	//获取日数据
	public ArrayList<t_crm_addhealth> getDay(t_crm_addhealth h){
		
		return mycustomer.getDay(h);
	}
	//输出周数据
	public ArrayList<t_crm_addhealth> getWeek(t_crm_addhealth h){
		
		return mycustomer.getWeek(h);
	}
	//输出周数据血压
	public ArrayList<t_crm_addhealth> getWeekPressure(t_crm_addhealth h){
		
		return mycustomer.getWeekPressure(h);
	}
	//输出月数据
	public ArrayList<t_crm_addhealth> getMonth(t_crm_addhealth h){
		
		return mycustomer.getMonth(h);
	}
	//输出月数据血压
	public ArrayList<t_crm_addhealth> getMonthPressure(t_crm_addhealth h){
		
		return mycustomer.getMonthPressure(h);
	}
	//输出年数据
	public ArrayList<t_crm_addhealth> getYear(t_crm_addhealth h){
		
		return mycustomer.getYear(h);
	}
	//输出年数据血压
	public ArrayList<t_crm_addhealth> getYearPressure(t_crm_addhealth h){
		
		return mycustomer.getYearPressure(h);
	}
	//输出备注信息
	public ArrayList<t_crm_addhealth> getRemark(t_crm_addhealth h){
		
		return mycustomer.getRemark(h);
	}
	//电话回访获取相关信息 
	public t_crm_memcard_reg getMemcrd(t_crm_addhealth helth){
		
		return mycustomer.getMemcrd(helth);
	}
	//添加电话回访
	public int setMemberfk(member_sale sele){
		
		return mycustomer.setMemberfk(sele);
	}
	//输出电话回访
	public ArrayList<member_sale> getMemberhf(member_sale sele){
		
		return mycustomer.getMemberhf(sele);
	}
	//输出周平均值
	public t_crm_addhealth getWeekavg(t_crm_addhealth h){
		
		return mycustomer.getWeekavg(h);
	}
	//输出月平均值
	public t_crm_addhealth getMonthavg(t_crm_addhealth h){
		
		return mycustomer.getMonthavg(h);
	}
	//输出年平均值
	public t_crm_addhealth getYearavg(t_crm_addhealth h){
		
		return mycustomer.getYearavg(h);
	}
	//搜索会员
	public ArrayList<t_crm_memcard_reg> SearchMember(t_crm_memcard_reg reg){
		
		return mycustomer.SearchMember(reg);
	}
	
	//输出账号信息
	public ArrayList<t_crm_memcard_reg> getWXAccountInfo(t_crm_memcard_reg reg){
		return mycustomer.getWXAccountInfo(reg);
	}
	
	public String WXinfo(String code,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        // 用户同意授权后，能获取到code
       // String code = request.getParameter("code");
        String state = request.getParameter("state");
        String openId = null;
        Logger log = Logger.getLogger("lavasoft.blog"); 
		//log.info("2222"+code);
        // 用户同意授权
        if (!"authdeny".equals(code)) {
            // 获取网页授权access_token
        	//log.info("3333");wxd90a7ac39d8f1c39
            WeixinOauth2Token weixinOauth2Token = AdvancedUtil.getOauth2AccessToken("wxa2189594b4e11677", "54c8d9881196163ea6a61659c6615293",code);
           // log.info("4444");
            // 网页授权接口访问凭证
            String accessToken = weixinOauth2Token.getAccessToken();
            // 用户标识
            openId = weixinOauth2Token.getOpenId();
        }
        if(openId==null){
        	return "1";
        }else{
        	return openId;
        }
    }
	
	//查询患病信息
	public ArrayList<t_crm_disease> getDisease(t_crm_disease disease){
		return mycustomer.getDisease(disease);
	}
	
	//查询病种信息
	public ArrayList<t_crm_entity> getEntity(t_crm_entity entity){
		return mycustomer.getEntity(entity);
	}
	
	//查询患病类型信息
	public ArrayList<t_crm_entity_type> getEntityType(t_crm_entity_type entityType){
		return mycustomer.getEntityType(entityType);
	}
	
	//查询病种对应基本症状信息
	public ArrayList<t_crm_entity_symptom> getEntitySymptom(t_crm_entity_symptom entitySymptom){
		return mycustomer.getEntitySymptom(entitySymptom);
	}
		
	//查询病种对应并发症状信息
	public ArrayList<t_crm_entity_syndrome> getEntitySyndrome(t_crm_entity_syndrome entitySyndrome){
		return mycustomer.getEntitySyndrome(entitySyndrome);
	}
	
	//添加病患档案信息
	public int addDisease(t_crm_disease disease){
		return mycustomer.addDisease(disease);
	}
	
	//修改病患档案信息
	public int updateDisease(t_crm_disease disease){
		return mycustomer.updateDisease(disease);
	}
	
	public int updateDiseaseStatus(t_crm_disease_note note){
		return mycustomer.updateDiseaseStatus(note);
	}
	
	//根据compid etityname查询慢病病种信息
	public t_crm_entity getEntityByCompid(t_crm_entity e){
		return mycustomer.getEntityByCompid(e);
	}
	
	//获取billno
	public String getBillno(){
		return mycustomer.getBillno();
	}
	public String getNewBillnoTop(String fileno){
		return mycustomer.getNewBillnoTop(fileno);
	}
	public String getNewFileno(){
		return mycustomer.getNewFileno();
	}
	public String getNewFilenoTop(){
		return mycustomer.getNewFilenoTop();
	}
	
	//获取Fileno
	public String getFileno(t_crm_addhealth h){
		return mycustomer.getFileno(h);
	}
	
	public t_crm_disease getDiseaseByBillno(t_crm_disease d){
		return mycustomer.getDiseaseByBillno(d);
	} 
	
	public int addDiseaseNote(t_crm_disease_note note){
		return mycustomer.addDiseaseNote(note);
	}
	
	//查询家庭健康档案信息(除本人以外)
	public ArrayList<t_crm_health_list> getMemberRelationShip(t_crm_health_list healthList){
		return mycustomer.getMemberRelationShip(healthList);
	}
	
	//查询家庭健康档案信息(本人)
	public t_crm_health_list getMemberRelationShipMe(t_crm_health_list healthList){
		return mycustomer.getMemberRelationShipMe(healthList);
	}
	
	//查询家庭健康档案信息(个人明细)
	public t_crm_health_list getMemberRelationShipDetails(t_crm_health_list healthList){
		return mycustomer.getMemberRelationShipDetails(healthList);
	}
	
	//查询用药记录
	public ArrayList<t_crm_drug> getDrug(t_crm_drug drug){
		return mycustomer.getDrug(drug);
	}
	
	//查询用药记录明细
	public t_crm_drug getDrugDetails(t_crm_drug drug){
		return mycustomer.getDrugDetails(drug);
	}
	
	//添加用药记录
	public int addDrug(t_crm_drug_note drugNote){
		return mycustomer.addDrug(drugNote);
	}
	
	//修改用药记录
	public int updateDrug(t_crm_drug_note drugNote){
		return mycustomer.updateDrug(drugNote);
	}
	
	//修改用药记录
	public int updateDrugWareid(t_crm_drug_note drugNote){
		return mycustomer.updateDrugWareid(drugNote);
	}
	//检索商品
	public ArrayList<t_crm_ware> getWare(t_crm_ware ware){
		return mycustomer.getWare(ware);
	}
	public ArrayList<t_crm_ware> getWareName(t_crm_ware ware){
		return mycustomer.getWareName(ware);
	}
	public ArrayList<t_crm_ware> getWareEnglish(t_crm_ware ware){
		return mycustomer.getWareEnglish(ware);
	}
	//检索商品
	public t_crm_health_list getHealthModilis(t_crm_health_list health){
		return mycustomer.getHealthModilis(health);
	}
	
	//添加家庭健康信息
	public int addMembers(t_crm_health_modilis modilis){
		return mycustomer.addMembers(modilis);
	}
	
	public int updateMembers(t_crm_health_modilis modilis){
		return mycustomer.updateMembers(modilis);
	}
	
	public int updateMembersStatus(t_crm_health_modilis modilis){
		return mycustomer.updateMembersStatus(modilis);
	}
	
}
