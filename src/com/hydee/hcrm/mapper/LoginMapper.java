package com.hydee.hcrm.mapper;

import com.hydee.hcrm.pojo.s_crm_busi;
import com.hydee.hcrm.pojo.s_role;
import com.hydee.hcrm.pojo.s_user_base;

public interface LoginMapper {
	//用户登录
	public s_user_base getLoginUser(s_user_base user);
	//修改密码
	public int updatepwd(s_user_base user);
	//获取用户信息
	public s_user_base getuser(s_user_base user);
	//获取名店
	public s_crm_busi getorgname(s_user_base user);
	//获取权限
	public s_role getrolename(s_user_base user);
	//登录
	public s_user_base getusermessage(s_user_base user);
}
