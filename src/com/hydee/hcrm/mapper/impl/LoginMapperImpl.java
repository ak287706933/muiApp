package com.hydee.hcrm.mapper.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hydee.hcrm.mapper.LoginMapper;
import com.hydee.hcrm.pojo.s_crm_busi;
import com.hydee.hcrm.pojo.s_role;
import com.hydee.hcrm.pojo.s_user_base;

public class LoginMapperImpl extends SqlSessionDaoSupport implements LoginMapper {

	@Override
	public s_user_base getLoginUser(s_user_base user) {
		
		return this.getSqlSession().getMapper(LoginMapper.class).getLoginUser(user);
	}

	@Override
	public int updatepwd(s_user_base user) {
		
		return this.getSqlSession().getMapper(LoginMapper.class).updatepwd(user);
	}

	@Override
	public s_user_base getuser(s_user_base user) {
		
		return this.getSqlSession().getMapper(LoginMapper.class).getuser(user);
		
	}

	@Override
	public s_crm_busi getorgname(s_user_base user) {
		
		return this.getSqlSession().getMapper(LoginMapper.class).getorgname(user);
	}

	@Override
	public s_role getrolename(s_user_base user) {
		
		return this.getSqlSession().getMapper(LoginMapper.class).getrolename(user);
	}

	@Override
	public s_user_base getusermessage(s_user_base user) {
		
		return this.getSqlSession().getMapper(LoginMapper.class).getusermessage(user);
	}
	

}
