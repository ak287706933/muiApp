package com.hydee.hcrm.mapper;

import java.util.ArrayList;

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

//我的顾客
public interface MyCustomerMapper {
	//输出所有客户数量
	public String getClientCount(t_crm_memcard_reg reg);
	//输出客户列表信息
	public ArrayList<t_crm_memcard_reg> getClientList(Page page);
	//按反馈时间输出客户信息
	public ArrayList<t_crm_memcard_reg> getClientTime(Page page);
	//按最后购买时间输出客户信息
	public ArrayList<t_crm_memcard_reg> getBuyTime(Page page);
	//输出客户账号信息
	public t_crm_memcard_reg getAccountInfo(t_crm_memcard_reg reg);
	//采集健康档案信息
	public int addHealth(t_crm_addhealth health);
	//健康档案信息单个
	public t_crm_addhealth getHealthRecordSingle(t_crm_addhealth helth);
	//回访记录
	public t_crm_memcard_reg getAccessRecord(t_crm_memcard_reg reg);
	//身高
	public t_crm_addhealth getHeight(t_crm_addhealth helth);
	//体重
	public t_crm_addhealth getWeight(t_crm_addhealth helth);
	//体温
	public t_crm_addhealth getTemperature(t_crm_addhealth helth);
	//心率
	public t_crm_addhealth getHeartrate(t_crm_addhealth helth);
	//步数
	public t_crm_addhealth getSteps(t_crm_addhealth helth);
	//收缩压 
	public t_crm_addhealth getSystolic(t_crm_addhealth helth);
	//舒张压 
	public t_crm_addhealth getDiastolic(t_crm_addhealth helth);
	//输出血氧
	public t_crm_addhealth getOxygen(t_crm_addhealth helth);
	//早餐前血糖 
	public t_crm_addhealth getBloodsugar1(t_crm_addhealth helth);
	//早餐后血糖
	public t_crm_addhealth getBloodsugar2(t_crm_addhealth helth);
	//午餐前血糖
	public t_crm_addhealth getBloodsugar3(t_crm_addhealth helth);
	//午餐后血糖
	public t_crm_addhealth getBloodsugar4(t_crm_addhealth helth);
	//晚饭前血糖
	public t_crm_addhealth getBloodsugar5(t_crm_addhealth helth);
	//晚饭后血糖
	public t_crm_addhealth getBloodsugar6(t_crm_addhealth helth);
	//睡觉前血糖
	public t_crm_addhealth getBloodsugar7(t_crm_addhealth helth);
	//糖化血红蛋白
	public t_crm_addhealth getGlycosylated(t_crm_addhealth helth);
	//输出总胆固醇
	public t_crm_addhealth getCholesterol(t_crm_addhealth helth);
	//甘油三酯
	public t_crm_addhealth getTriglyceride(t_crm_addhealth helth);
	//高密度脂蛋白
	public t_crm_addhealth getHighlipoprotein(t_crm_addhealth helth);
	//低密度脂蛋白 
	public t_crm_addhealth getLowlipoprotein(t_crm_addhealth helth);
	//同型半胱氯酸 
	public t_crm_addhealth getHomocysteine(t_crm_addhealth helth);
	//获取日数据
	public ArrayList<t_crm_addhealth> getDay(t_crm_addhealth helth);
	//输出周数据
	public ArrayList<t_crm_addhealth> getWeek(t_crm_addhealth helth);
	//输出周数据血压
	public ArrayList<t_crm_addhealth> getWeekPressure(t_crm_addhealth helth);
	//输出月数据
	public ArrayList<t_crm_addhealth> getMonth(t_crm_addhealth helth);
	//获取月数据血压
	public ArrayList<t_crm_addhealth> getMonthPressure(t_crm_addhealth helth);
	//输出年数据
	public ArrayList<t_crm_addhealth> getYear(t_crm_addhealth helth);
	//输出年数据血压
	public ArrayList<t_crm_addhealth> getYearPressure(t_crm_addhealth helth);
	//输出备注
	public ArrayList<t_crm_addhealth> getRemark(t_crm_addhealth helth);
	//电话回访获取相关信息 
	public t_crm_memcard_reg getMemcrd(t_crm_addhealth helth);
	//添加电话回访记录
	public int setMemberfk(member_sale sele);
	//输出电话回访记录
	public ArrayList<member_sale> getMemberhf(member_sale sele);
	//输出周平均值
	public t_crm_addhealth getWeekavg(t_crm_addhealth helth);
	//输出月平均值
	public t_crm_addhealth getMonthavg(t_crm_addhealth helth);
	//输出年平均值
	public t_crm_addhealth getYearavg(t_crm_addhealth helth);
	//搜索客户
	public ArrayList<t_crm_memcard_reg> SearchMember(t_crm_memcard_reg reg);
	
	//输出客户账号信息
	public ArrayList<t_crm_memcard_reg> getWXAccountInfo(t_crm_memcard_reg reg);
	//查询患病信息
	public ArrayList<t_crm_disease> getDisease(t_crm_disease disease);
	//查询病种信息
	public ArrayList<t_crm_entity> getEntity(t_crm_entity entity);
	//查询病种类型信息
	public ArrayList<t_crm_entity_type> getEntityType(t_crm_entity_type entityType);
	//查询病种对应基本症状信息
	public ArrayList<t_crm_entity_symptom> getEntitySymptom(t_crm_entity_symptom entitySymptom);
	//查询病种对应并发症状信息
	public ArrayList<t_crm_entity_syndrome> getEntitySyndrome(t_crm_entity_syndrome entitySyndrome);
	//添加病患信息
	public int addDisease(t_crm_disease disease);
	//修改病患信息
	public int updateDisease(t_crm_disease disease);
	public int updateDiseaseStatus(t_crm_disease_note note);
	//根据compid etityname查询慢病病种信息
	public t_crm_entity getEntityByCompid(t_crm_entity e);
	//获取Billno
	public String getBillno();
	public String getNewBillnoTop(String fileno);
	public String getNewFileno();
	public String getNewFilenoTop();
	//获取Fileno
	public String getFileno(t_crm_addhealth h);
	
	public t_crm_disease getDiseaseByBillno(t_crm_disease d);
	public int addDiseaseNote(t_crm_disease_note note);
	//查询家庭健康档案信息(除本人以外)
	public ArrayList<t_crm_health_list> getMemberRelationShip(t_crm_health_list healthList);
	//查询家庭健康档案信息(本人)
	public t_crm_health_list getMemberRelationShipMe(t_crm_health_list healthList);
	//查询家庭健康档案信息(个人明细)
	public t_crm_health_list getMemberRelationShipDetails(t_crm_health_list healthList);
	//查询用药记录
	public ArrayList<t_crm_drug> getDrug(t_crm_drug drug);
	//查询用药记录明细
	public t_crm_drug getDrugDetails(t_crm_drug drug);
	//添加用药记录
	public int addDrug(t_crm_drug_note drugNote);
	//修改用药记录
	public int updateDrug(t_crm_drug_note drugNote);
	//修改用药记录
	public int updateDrugWareid(t_crm_drug_note drugNote);
	//检索商品
	public ArrayList<t_crm_ware> getWare(t_crm_ware ware);
	public ArrayList<t_crm_ware> getWareName(t_crm_ware ware);
	public ArrayList<t_crm_ware> getWareEnglish(t_crm_ware ware);
	//查询会员健康信息
	public t_crm_health_list getHealthModilis(t_crm_health_list health);
	//添加家庭健康信息
	public int addMembers(t_crm_health_modilis health);
	public int updateMembers(t_crm_health_modilis health);
	public int updateMembersStatus(t_crm_health_modilis health);
	
}
