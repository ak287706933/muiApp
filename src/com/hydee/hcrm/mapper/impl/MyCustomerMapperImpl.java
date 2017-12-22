package com.hydee.hcrm.mapper.impl;

import java.util.ArrayList;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hydee.hcrm.mapper.MyCustomerMapper;
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

public class MyCustomerMapperImpl extends SqlSessionDaoSupport implements MyCustomerMapper {
	
	
	@Override
	public String getClientCount(t_crm_memcard_reg reg) {
		//获取会员数量
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getClientCount(reg);
	}

	@Override
	public ArrayList<t_crm_memcard_reg> getClientList(Page page) {
		//获取会员列表信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getClientList(page);
	}

	@Override
	public ArrayList<t_crm_memcard_reg> getClientTime(Page page) {
		//按反馈日期输出客户列表
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getClientTime(page);
	}

	@Override
	public ArrayList<t_crm_memcard_reg> getBuyTime(Page page) {
		//按最后购买时间输出客户信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getBuyTime(page);
	}

	@Override
	public t_crm_memcard_reg getAccountInfo(t_crm_memcard_reg reg) {
		//输出账号信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getAccountInfo(reg);
	}

	@Override
	public t_crm_memcard_reg getAccessRecord(t_crm_memcard_reg reg) {
		//输出回访记录
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getAccessRecord(reg);
	}

	@Override
	public t_crm_addhealth getHeight(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getHeight(helth);
	}

	@Override
	public t_crm_addhealth getWeight(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getWeight(helth);
	}

	@Override
	public t_crm_addhealth getTemperature(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getTemperature(helth);
	}

	@Override
	public t_crm_addhealth getHeartrate(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getHeartrate(helth);
	}

	@Override
	public t_crm_addhealth getSteps(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getSteps(helth);
	}

	@Override
	public t_crm_addhealth getSystolic(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getSystolic(helth);
	}

	@Override
	public t_crm_addhealth getDiastolic(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getDiastolic(helth);
	}

	@Override
	public t_crm_addhealth getOxygen(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getOxygen(helth);
	}

	@Override
	public t_crm_addhealth getBloodsugar1(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getBloodsugar1(helth);
	}

	@Override
	public t_crm_addhealth getBloodsugar2(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getBloodsugar2(helth);
	}

	@Override
	public t_crm_addhealth getBloodsugar3(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getBloodsugar3(helth);
	}

	@Override
	public t_crm_addhealth getBloodsugar4(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getBloodsugar4(helth);
	}

	@Override
	public t_crm_addhealth getGlycosylated(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getGlycosylated(helth);
	}

	@Override
	public t_crm_addhealth getCholesterol(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getCholesterol(helth);
	}

	@Override
	public t_crm_addhealth getTriglyceride(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getTriglyceride(helth);
	}

	@Override
	public t_crm_addhealth getHighlipoprotein(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getHighlipoprotein(helth);
	}

	@Override
	public t_crm_addhealth getLowlipoprotein(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getLowlipoprotein(helth);
	}

	@Override
	public t_crm_addhealth getHomocysteine(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getHomocysteine(helth);
	}

	@Override
	public t_crm_addhealth getHealthRecordSingle(t_crm_addhealth helth) {
		
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getHealthRecordSingle(helth);
	}

	@Override
	public int addHealth(t_crm_addhealth health) {
		//新增健康档案信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).addHealth(health);
	}

	@Override
	public t_crm_addhealth getBloodsugar5(t_crm_addhealth helth) {
		//晚饭前血糖
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getBloodsugar5(helth);
	}

	@Override
	public t_crm_addhealth getBloodsugar6(t_crm_addhealth helth) {
		//晚饭后血糖
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getBloodsugar6(helth);
	}

	@Override
	public t_crm_addhealth getBloodsugar7(t_crm_addhealth helth) {
		//睡觉前血糖
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getBloodsugar7(helth);
	}

	@Override
	public ArrayList<t_crm_addhealth> getWeek(t_crm_addhealth helth) {
		//输出周数据
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getWeek(helth);
	}
	
	@Override
	public ArrayList<t_crm_addhealth> getWeekPressure(t_crm_addhealth helth) {
		//输出周数据血压
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getWeekPressure(helth);
	}

	@Override
	public ArrayList<t_crm_addhealth> getMonth(t_crm_addhealth helth) {
		//输出月数据
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getMonth(helth);
	}
	
	@Override
	public ArrayList<t_crm_addhealth> getMonthPressure(t_crm_addhealth helth) {
		//获取月数据血压
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getMonthPressure(helth);
	}

	@Override
	public ArrayList<t_crm_addhealth> getYear(t_crm_addhealth helth) {
		//输出年数据
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getYear(helth);
	}

	@Override
	public ArrayList<t_crm_addhealth> getYearPressure(t_crm_addhealth helth) {
		//输出年数据血压
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getYearPressure(helth);
	}

	@Override
	public ArrayList<t_crm_addhealth> getRemark(t_crm_addhealth helth) {
		//输出备注
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getRemark(helth);
	}

	@Override
	public t_crm_memcard_reg getMemcrd(t_crm_addhealth helth) {
		//电话回访获取相关信息 
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getMemcrd(helth);
	}

	@Override
	public int setMemberfk(member_sale sele) {
		//添加电话回访记录
		return this.getSqlSession().getMapper(MyCustomerMapper.class).setMemberfk(sele);
	}

	@Override
	public ArrayList<member_sale> getMemberhf(member_sale sele) {
		//输出电话回访记录
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getMemberhf(sele);
	}

	@Override
	public t_crm_addhealth getWeekavg(t_crm_addhealth helth) {
		//输出周平均值
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getWeekavg(helth);
	}

	@Override
	public t_crm_addhealth getMonthavg(t_crm_addhealth helth) {
		//输出月平均值
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getMonthavg(helth);
	}

	@Override
	public t_crm_addhealth getYearavg(t_crm_addhealth helth) {
		//输出年平均值
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getYearavg(helth);
	}

	@Override
	public ArrayList<t_crm_addhealth> getDay(t_crm_addhealth helth) {
		//获取日数据
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getDay(helth);
	}

	@Override
	public ArrayList<t_crm_memcard_reg> SearchMember(t_crm_memcard_reg reg) {
		//搜索会员
		return this.getSqlSession().getMapper(MyCustomerMapper.class).SearchMember(reg);
	}
	
	@Override
	public ArrayList<t_crm_memcard_reg> getWXAccountInfo(t_crm_memcard_reg reg) {
		//输出账号信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getWXAccountInfo(reg);
	}

	@Override
	public ArrayList<t_crm_disease> getDisease(t_crm_disease disease) {
		//查询患病信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getDisease(disease);
	}

	@Override
	public ArrayList<t_crm_entity> getEntity(t_crm_entity entity) {
		//查询病种信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getEntity(entity);
	}

	@Override
	public ArrayList<t_crm_entity_type> getEntityType(t_crm_entity_type entityType) {
		//查询病种类型信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getEntityType(entityType);
	}

	@Override
	public ArrayList<t_crm_entity_symptom> getEntitySymptom(t_crm_entity_symptom entitySymptom) {
		//查询病种对应基本症状信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getEntitySymptom(entitySymptom);
	}

	@Override
	public ArrayList<t_crm_entity_syndrome> getEntitySyndrome(t_crm_entity_syndrome entitySyndrome) {
		//查询病种对应并发症状信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getEntitySyndrome(entitySyndrome);
	}
	
	@Override
	public int addDisease(t_crm_disease disease) {
		//新增病患信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).addDisease(disease);
	}

	@Override
	public t_crm_entity getEntityByCompid(t_crm_entity e) {
		//根据compid etityname查询慢病病种信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getEntityByCompid(e);
	}

	@Override
	public String getBillno() {
		//获取billno
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getBillno();
	}
	
	@Override
	public String getNewBillnoTop(String fileno) {
		//获取billno
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getNewBillnoTop(fileno);
	}
	
	@Override
	public String getNewFileno() {
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getNewFileno();
	}
	
	@Override
	public String getNewFilenoTop() {
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getNewFilenoTop();
	}

	@Override
	public String getFileno(t_crm_addhealth h) {
		//获取Fileno
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getFileno(h);
	}

	@Override
	public int updateDisease(t_crm_disease disease) {
		//修改病患信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).updateDisease(disease);
	}

	@Override
	public int updateDiseaseStatus(t_crm_disease_note note) {
		return this.getSqlSession().getMapper(MyCustomerMapper.class).updateDiseaseStatus(note);
	}

	@Override
	public t_crm_disease getDiseaseByBillno(t_crm_disease d) {
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getDiseaseByBillno(d);
	}

	@Override
	public int addDiseaseNote(t_crm_disease_note note) {
		return this.getSqlSession().getMapper(MyCustomerMapper.class).addDiseaseNote(note);
	}

	@Override
	public ArrayList<t_crm_health_list> getMemberRelationShip(t_crm_health_list healthList) {
		//查询家庭健康档案信息(除本人以外)
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getMemberRelationShip(healthList);
	}

	@Override
	public t_crm_health_list getMemberRelationShipMe(t_crm_health_list healthList) {
		//查询家庭健康档案信息(本人)
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getMemberRelationShipMe(healthList);
	}

	@Override
	public t_crm_health_list getMemberRelationShipDetails(t_crm_health_list healthList) {
		//查询家庭健康档案信息(个人明细)
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getMemberRelationShipDetails(healthList);
	}

	@Override
	public ArrayList<t_crm_drug> getDrug(t_crm_drug drug) {
		//查询用药记录
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getDrug(drug);
	}
	
	@Override
	public t_crm_drug getDrugDetails(t_crm_drug drug) {
		//查询用药记录明细
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getDrugDetails(drug);
	}

	@Override
	public int addDrug(t_crm_drug_note drugNote) {
		// 添加用药记录
		return this.getSqlSession().getMapper(MyCustomerMapper.class).addDrug(drugNote);
	}

	@Override
	public ArrayList<t_crm_ware> getWare(t_crm_ware ware) {
		//检索商品
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getWare(ware);
	}
	
	@Override
	public ArrayList<t_crm_ware> getWareEnglish(t_crm_ware ware) {
		//检索商品
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getWareEnglish(ware);
	}

	@Override
	public int updateDrug(t_crm_drug_note drugNote) {
		// 修改用药记录
		return this.getSqlSession().getMapper(MyCustomerMapper.class).updateDrug(drugNote);
	}

	@Override
	public int updateDrugWareid(t_crm_drug_note drugNote) {
		// 修改用药记录
		return this.getSqlSession().getMapper(MyCustomerMapper.class).updateDrugWareid(drugNote);
	}

	@Override
	public t_crm_health_list getHealthModilis(t_crm_health_list health) {
		//查询会员健康信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getHealthModilis(health);
	}

	@Override
	public int addMembers(t_crm_health_modilis health) {
		//添加家庭健康信息
		return this.getSqlSession().getMapper(MyCustomerMapper.class).addMembers(health);
	}

	@Override
	public int updateMembers(t_crm_health_modilis health) {
		// TODO Auto-generated method stub
		return this.getSqlSession().getMapper(MyCustomerMapper.class).updateMembers(health);
	}

	@Override
	public int updateMembersStatus(t_crm_health_modilis health) {
		return this.getSqlSession().getMapper(MyCustomerMapper.class).updateMembersStatus(health);
	}

	@Override
	public ArrayList<t_crm_ware> getWareName(t_crm_ware ware) {
		// TODO Auto-generated method stub
		return this.getSqlSession().getMapper(MyCustomerMapper.class).getWareName(ware);
	}
}
