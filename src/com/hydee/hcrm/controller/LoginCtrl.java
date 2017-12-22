package com.hydee.hcrm.controller;


import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.hydee.framework.common.H2EncryptUtil;
import com.hydee.hcrm.pojo.s_user_base;
import com.hydee.hcrm.service.LoginService;

@Controller
public class LoginCtrl {
	@Resource
	private LoginService loginservice;
	private Gson gson = new Gson();	
	
	//用户登录
	@RequestMapping(value="login",method=RequestMethod.POST)
	public void UserLogin2(@RequestParam String parameter,
			               @RequestParam String userpwd,
			HttpServletRequest req,HttpServletResponse rep) throws NoSuchAlgorithmException, IOException{
			s_user_base user=new s_user_base();
			String pwd;
			pwd=H2EncryptUtil.hydee_md5(userpwd);
			user.setUSERPASS(pwd);
			if(parameter.length()==11){
				user.setTEL(parameter);
				user=loginservice.getLoginService(user);
				try {
				   // System.out.println(parameter+"---"+user.getTEL()+"---"+pwd+"----"+user.getUSERPASS()) ;
				   // String ss=user.getTEL();
				  //  String bb=user.getUSERPASS();
					if(parameter.equals(user.getTEL())&&pwd.equals(user.getUSERPASS())){
				    	rep.setCharacterEncoding("UTF-8");
						rep.setContentType("text/html;charset=UTF-8");
				   		String jsonStr = gson.toJson(user);
				   		rep.getWriter().print(jsonStr);
				   		//保存用户登录的userid
				   		HttpSession session=req.getSession();
				   		String userid=user.getUSERID()+"";
						session.setAttribute("userid", userid);
				   		Cookie cookie=new Cookie(userid,userid);
				   		rep.addCookie(cookie);
				       }else{
					  	   String jsonStr = gson.toJson("no");
					  	   rep.getWriter().print(jsonStr);
				       }
				    } catch (Exception e) {
				  	   String jsonStr = gson.toJson("no");
				  	   rep.getWriter().print(jsonStr);
				    }
			}else{
				Integer id=Integer.parseInt(parameter);
				user.setUSERID(id);
				user=loginservice.getLoginService(user);
				try {
				       if(id.equals(user.getUSERID())&&pwd.equals(user.getUSERPASS())){
				    	rep.setCharacterEncoding("UTF-8");  
						rep.setContentType("text/html;charset=UTF-8"); 
				   		String jsonStr = gson.toJson(user);
				   		rep.getWriter().print(jsonStr);
				   		//保存用户登录的userid
				   		HttpSession session=req.getSession();
				   		String userid=user.getUSERID()+"";
						session.setAttribute("userid", userid);
				   		Cookie cookie=new Cookie(userid,userid);
				   		rep.addCookie(cookie);
				       }
				    } catch (Exception e) {
				  	   String jsonStr = gson.toJson("no");
				  	   rep.getWriter().print(jsonStr);
				    }
			}
	 }
	
	//修改密码
	@RequestMapping(value="updatepwd",method=RequestMethod.POST)
	public void updatepwd(@RequestParam String userpwd,HttpServletRequest req,HttpServletResponse rep) throws NoSuchAlgorithmException, IOException{
		s_user_base user=new s_user_base();
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		user.setUSERID(uid);
		user.setUSERPASS(H2EncryptUtil.hydee_md5(userpwd));
		try {
			if(loginservice.updatepwd(user)>0){
			rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			String jsonStr=gson.toJson(loginservice.updatepwd(user));
			rep.getWriter().print(jsonStr);
			}else{
				rep.setCharacterEncoding("UTF-8");  
				rep.setContentType("text/html;charset=UTF-8"); 
				String jsonStr=gson.toJson("no");
				rep.getWriter().print(jsonStr);
			}
			
	    } catch (Exception e) {
	    	rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			String jsonStr=gson.toJson("no");
			rep.getWriter().print(jsonStr);
	    }
	}
	//获取用户信息
	@RequestMapping(value="getuser",method=RequestMethod.POST)
	public void getuser(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		s_user_base user=new s_user_base();
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		user.setUSERID(uid);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		String jsonStr=gson.toJson(loginservice.getuser(user));
		rep.getWriter().print(jsonStr);
	}
	
	//获取用户门店
	@RequestMapping(value="torgname",method=RequestMethod.POST)
	public void getorgname(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		try {
			s_user_base user=new s_user_base();
			String userid=(String) req.getSession().getAttribute("userid");
			Cookie[] cookie=req.getCookies();
			int uid=0;
			for(int i=0;i<cookie.length;i++){
				if(cookie[i].getName().equals(userid)){
				uid=Integer.parseInt(userid);
				break;
				}
			}
			user.setUSERID(uid);
			rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			String jsonStr=gson.toJson(loginservice.getorgname(user));
			rep.getWriter().print(jsonStr);
			
	    } catch (Exception e) {
	    	rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			String jsonStr=gson.toJson("no");
			rep.getWriter().print(jsonStr);
	    }
	}
	//获取用户权限
	@RequestMapping(value="rolename",method=RequestMethod.POST)
	public void getrolename(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		try {
			s_user_base user=new s_user_base();
			String userid=(String) req.getSession().getAttribute("userid");
			Cookie[] cookie=req.getCookies();
			int uid=0;
			for(int i=0;i<cookie.length;i++){
				if(cookie[i].getName().equals(userid)){
				uid=Integer.parseInt(userid);
				break;
				}
			}
			user.setUSERID(uid);
			rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			String jsonStr=gson.toJson(loginservice.getrolename(user));
			rep.getWriter().print(jsonStr);
			
	    } catch (Exception e) {
	    	rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			String jsonStr=gson.toJson("no");
			rep.getWriter().print(jsonStr);
	    }
	}
	
	
}
