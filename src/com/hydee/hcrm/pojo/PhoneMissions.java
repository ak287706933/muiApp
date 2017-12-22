package com.hydee.hcrm.pojo;

import java.util.List;

//电话任务对应的信息
public class PhoneMissions {
	private t_crm_activity_c activity_c;//电话任务明细表
	private t_crm_activity activity;//电话任务主表
	private t_crm_memcard_reg memcard_reg;//会员资料表
	private List<t_crm_memcard_reg> MemberList;//会员资料集合
	/**
	 * @return the activity_c
	 */
	public t_crm_activity_c getActivity_c() {
		return activity_c;
	}
	/**
	 * @param activity_c the activity_c to set
	 */
	public void setActivity_c(t_crm_activity_c activity_c) {
		this.activity_c = activity_c;
	}
	/**
	 * @return the activity
	 */
	public t_crm_activity getActivity() {
		return activity;
	}
	/**
	 * @param activity the activity to set
	 */
	public void setActivity(t_crm_activity activity) {
		this.activity = activity;
	}
	/**
	 * @return the memcard_reg
	 */
	public t_crm_memcard_reg getMemcard_reg() {
		return memcard_reg;
	}
	/**
	 * @param memcard_reg the memcard_reg to set
	 */
	public void setMemcard_reg(t_crm_memcard_reg memcard_reg) {
		this.memcard_reg = memcard_reg;
	}
	/**
	 * @return the memberList
	 */
	public List<t_crm_memcard_reg> getMemberList() {
		return MemberList;
	}
	/**
	 * @param memberList the memberList to set
	 */
	public void setMemberList(List<t_crm_memcard_reg> memberList) {
		MemberList = memberList;
	}

}
