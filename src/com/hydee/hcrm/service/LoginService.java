package com.hydee.hcrm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hydee.hcrm.mapper.LoginMapper;
import com.hydee.hcrm.pojo.s_crm_busi;
import com.hydee.hcrm.pojo.s_role;
import com.hydee.hcrm.pojo.s_user_base;
@Service
public class LoginService {
	@Resource
	private LoginMapper loginmapper;
	//用户登录
	public s_user_base getLoginService(s_user_base user){
		
		return loginmapper.getLoginUser(user);
	}
	//修改密码
	public int updatepwd(s_user_base user){
		
		return loginmapper.updatepwd(user);
	}
	//获取用户登录信息
	public s_user_base getuser(s_user_base user){
		
		return loginmapper.getuser(user);
	}
	//获取门店
	public s_crm_busi getorgname(s_user_base user){
		
		return loginmapper.getorgname(user);
	}
	//获取权限
	public s_role getrolename(s_user_base user){
		
		return loginmapper.getrolename(user);
	}
	//登录
	public s_user_base getusermessage(s_user_base user){
		
		return loginmapper.getusermessage(user);
	}

}
