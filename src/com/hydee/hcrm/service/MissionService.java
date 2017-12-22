package com.hydee.hcrm.service;

import java.util.ArrayList;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.hydee.hcrm.mapper.MissionMapper;
import com.hydee.hcrm.pojo.BuyBack;
import com.hydee.hcrm.pojo.Page;
import com.hydee.hcrm.pojo.PurchaseHistory;
import com.hydee.hcrm.pojo.TaskList;
import com.hydee.hcrm.pojo.t_crm_activity_c;
import com.hydee.hcrm.pojo.t_crm_memcard_reg;
//我的任务

@Service
public class MissionService {
	@Resource
	private MissionMapper missionmapper;
	
	public String getMissionCount(Integer userid){
		//获取任务的记录数
		return missionmapper.getMissionCount(userid);
	}
	
	public ArrayList<TaskList> getMissionList(Page page){
		//获取任务名单
		return missionmapper.getMissionList(page);	
	}
	
	public ArrayList<BuyBack> getBuyBack(t_crm_activity_c activity_c){
		//获取回购信息
		return missionmapper.getBuyBack(activity_c);
	}
	
	public ArrayList<t_crm_memcard_reg> getMember(t_crm_activity_c activity_c){
		//获取会员信息
		return missionmapper.getMember(activity_c);
	}
	
	public ArrayList<PurchaseHistory> getShoppingRecord(t_crm_activity_c activity_c){
		//购物记录
		return missionmapper.getShoppingRecord(activity_c);
	}
	
	public int getFeedBack(t_crm_activity_c activity_c){
		//信息反馈
		return missionmapper.getFeedBack(activity_c);
	}
	
	public String getDoneCount(t_crm_activity_c activity_c){
		//获取本月完成记录数
		return missionmapper.getDoneCount(activity_c);
	}
	
	public String getMonthCount(t_crm_activity_c activity_c){
		//获取本月任务数
		return missionmapper.getMonthCount(activity_c);
	}
	
	public String getUltimoFinish(t_crm_activity_c activity_c){
		//获取上月完成记录
		return missionmapper.getUltimoFinish(activity_c);
	}
	
	public String getUltimo(t_crm_activity_c activity_c){
		//获取上月记录数
		return missionmapper.getUltimo(activity_c);
	}
	public String getDate(){
		//获取本月时间
		return missionmapper.getDate();
	}
	public String getUltimoDate(){
		//获取上月日期
		return missionmapper.getUltimoDate();
	}
	

}
