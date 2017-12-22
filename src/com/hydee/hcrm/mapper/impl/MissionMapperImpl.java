package com.hydee.hcrm.mapper.impl;

import java.util.ArrayList;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.hydee.hcrm.mapper.MissionMapper;
import com.hydee.hcrm.pojo.BuyBack;
import com.hydee.hcrm.pojo.Page;
import com.hydee.hcrm.pojo.PurchaseHistory;
import com.hydee.hcrm.pojo.TaskList;
import com.hydee.hcrm.pojo.t_crm_activity_c;
import com.hydee.hcrm.pojo.t_crm_memcard_reg;


public class MissionMapperImpl extends SqlSessionDaoSupport implements MissionMapper{

	@Override
	public String getMissionCount(Integer userid) {
		//获取任务记录数
		return this.getSqlSession().getMapper(MissionMapper.class).getMissionCount(userid);
	}
	
	@Override
	public ArrayList<TaskList> getMissionList(Page page) {
		//获取任务名单
		return this.getSqlSession().getMapper(MissionMapper.class).getMissionList(page);
	}
	
	@Override
	public ArrayList<BuyBack> getBuyBack(t_crm_activity_c activity_c) {
		// 复购信息
		return this.getSqlSession().getMapper(MissionMapper.class).getBuyBack(activity_c);
	}

	@Override
	public ArrayList<t_crm_memcard_reg> getMember(t_crm_activity_c activity_c) {
		//获取任务会员信息
		return this.getSqlSession().getMapper(MissionMapper.class).getMember(activity_c);
	}

	@Override
	public ArrayList<PurchaseHistory> getShoppingRecord(t_crm_activity_c activity_c) {
		//购物记录
		return this.getSqlSession().getMapper(MissionMapper.class).getShoppingRecord(activity_c);
	}

	@Override
	public int getFeedBack(t_crm_activity_c activity_c) {
		//反馈信息
		return this.getSqlSession().getMapper(MissionMapper.class).getFeedBack(activity_c);
	}

	@Override
	public String getDoneCount(t_crm_activity_c activity_c) {
		//获取本月完成记录数
		return this.getSqlSession().getMapper(MissionMapper.class).getDoneCount(activity_c);
	}

	@Override
	public String getMonthCount(t_crm_activity_c activity_c) {
		//获取本月任务数
		return this.getSqlSession().getMapper(MissionMapper.class).getMonthCount(activity_c);
	}

	@Override
	public String getUltimoFinish(t_crm_activity_c activity_c) {
		//获取上月完成
		return this.getSqlSession().getMapper(MissionMapper.class).getUltimoFinish(activity_c);
	}

	@Override
	public String getUltimo(t_crm_activity_c activity_c) {
		//获取上月任务数
		return this.getSqlSession().getMapper(MissionMapper.class).getUltimo(activity_c);
	}

	@Override
	public String getDate() {
		//获取本月时间
		return this.getSqlSession().getMapper(MissionMapper.class).getDate();
	}

	@Override
	public String getUltimoDate() {
		//获取上月年月
		return this.getSqlSession().getMapper(MissionMapper.class).getUltimoDate();
	}

	

}
