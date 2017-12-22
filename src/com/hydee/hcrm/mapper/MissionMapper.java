package com.hydee.hcrm.mapper;

import java.util.ArrayList;
import com.hydee.hcrm.pojo.BuyBack;
import com.hydee.hcrm.pojo.Page;
import com.hydee.hcrm.pojo.PurchaseHistory;
import com.hydee.hcrm.pojo.TaskList;
import com.hydee.hcrm.pojo.t_crm_activity_c;
import com.hydee.hcrm.pojo.t_crm_memcard_reg;

//我的任务
public interface MissionMapper {
	//获取任务记录数
	public String getMissionCount(Integer userid);
	//获取任务名单
	public ArrayList<TaskList> getMissionList(Page page);
	//慢病购药记录
	public ArrayList<BuyBack> getBuyBack(t_crm_activity_c activity_c);
	//获取会员信息
	public ArrayList<t_crm_memcard_reg> getMember(t_crm_activity_c activity_c);
	//购药记录
	public ArrayList<PurchaseHistory> getShoppingRecord(t_crm_activity_c activity_c);
	//反馈信息
	public int getFeedBack(t_crm_activity_c activity_c);
	//获取本月完成数
	public String getDoneCount(t_crm_activity_c activity_c);
	//获取本月任务数
	public String getMonthCount(t_crm_activity_c activity_c);
	//获取上月完成数
	public String getUltimoFinish(t_crm_activity_c activity_c);
	//获取上月任务数
	public String getUltimo(t_crm_activity_c activity_c);
	//获取本月时间
	public String getDate();
	//获取上月时间
	public String getUltimoDate();
	
	

}
