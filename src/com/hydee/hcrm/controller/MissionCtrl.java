package com.hydee.hcrm.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.google.gson.Gson;
import com.hydee.hcrm.pojo.BuyBack;
import com.hydee.hcrm.pojo.Page;
import com.hydee.hcrm.pojo.PurchaseHistory;
import com.hydee.hcrm.pojo.TaskList;
import com.hydee.hcrm.pojo.t_crm_activity_c;
import com.hydee.hcrm.pojo.t_crm_memcard_reg;
import com.hydee.hcrm.service.MissionService;
import com.hydee.hcrm.util.TaskTool;
//我的任务
@Controller
public class MissionCtrl {
	@Resource
	private MissionService missionservice;
	private Gson gson = new Gson();
	//获取任务的记录数
	@RequestMapping("count")
	public void getMissionCount(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			String id = cookie[i].getValue();
			int uid=Integer.parseInt(id);
			String count=missionservice.getMissionCount(uid);
			String jsonStr="";
			if(count==null){
				jsonStr = gson.toJson(0);	
			}else{
				jsonStr = gson.toJson(count);
			}
			rep.getWriter().print(jsonStr);
			break;
			}
		}
	}
	//获取任务客户名单
	@RequestMapping("list")
	public void getMissionList(@RequestParam String begin,@RequestParam String end,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		Page page=new Page();
		ArrayList<TaskList> list=null;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			int uid=Integer.parseInt(userid);
			int index=Integer.parseInt(begin);
			int ShowSize=Integer.parseInt(end);
			page.setUserid(uid);
			page.setIndex(index);
			page.setShowSize(ShowSize);
			list=missionservice.getMissionList(page);
			
			rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			String jsonStr=gson.toJson(list);
			rep.getWriter().print(jsonStr);
			break;
			}
		}
	}
	//回购记录
	@RequestMapping("buyback")
	public void getBuyBack(@RequestParam String rowno,@RequestParam String activeid,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		int row=Integer.parseInt(rowno);
		t_crm_activity_c activity_c=new t_crm_activity_c();
		activity_c.setROWNO(row);
		activity_c.setACTIVEID(activeid);
		ArrayList<BuyBack> Messagelist=missionservice.getBuyBack(activity_c);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8");
		String jsonStr=gson.toJson(Messagelist);
		rep.getWriter().print(jsonStr);
	}
	//获取会员信息
	@RequestMapping("member")
	public void getMember(@RequestParam String memcardno,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_activity_c activity_c=new t_crm_activity_c();
		activity_c.setMEMCARDNO(memcardno);
		ArrayList<t_crm_memcard_reg> mr=missionservice.getMember(activity_c);
		
		for(int i = 0 ; i< mr.size() ; i++) {
			if(mr.get(i).getMOBILE()!=null){
				mr.get(i).setMOBILE(mr.get(i).getMOBILE().substring(0, 3) + "****" + mr.get(i).getMOBILE().substring(7));
			}
		}
		
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8");
		String jsonStr=gson.toJson(mr);
		rep.getWriter().print(jsonStr);
	}
	
	//获取购物记录
	@RequestMapping("ShoppingRecord")
	public void getShoppingRecord(@RequestParam String memcardno,HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_activity_c activity_c=new t_crm_activity_c();
		activity_c.setMEMCARDNO(memcardno);
		ArrayList<PurchaseHistory> ph=missionservice.getShoppingRecord(activity_c);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8");
		String jsonStr=gson.toJson(ph);
		rep.getWriter().print(jsonStr);
	}
	
	//反馈信息
	@RequestMapping("feedback")
	public void getFeedBack(@RequestParam String memcardno,
			                @RequestParam String checkbox,
			                @RequestParam String checkbox1,
			                @RequestParam String remark,
			                @RequestParam String activeid,
			                HttpServletRequest req,HttpServletResponse rep) throws IOException{
		t_crm_activity_c activity_c=new t_crm_activity_c();
		String cb=new String(checkbox.getBytes("ISO-8859-1"),"utf-8");
		String rk=new String(remark.getBytes("ISO-8859-1"),"utf-8");
		String cb1=new String(checkbox1.getBytes("ISO-8859-1"),"utf-8");
		String mc=new String(memcardno.getBytes("ISO-8859-1"),"utf-8");
		String aid=new String(activeid.getBytes("ISO-8859-1"),"utf-8");
		Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date=df.format(d);
		activity_c.setFEEDBACKTIME(date);
		activity_c.setTASK_STATUS(1);
		activity_c.setTASK_REMARK(rk);
		activity_c.setTASK_RESON(cb);
		activity_c.setMEMCARDNO(mc);
		activity_c.setACTIVEID(aid);
		if(TaskTool.isNumeric(cb1)){
			int day=Integer.parseInt(cb1);
			activity_c.setREMINDAYS(day);
		}else{
			activity_c.setFOLLOWUPWORK(cb1);
		}
		int mun=missionservice.getFeedBack(activity_c);
		rep.setCharacterEncoding("UTF-8");
		rep.setContentType("text/html;charset=UTF-8");
		rep.getWriter().print(mun);
	}
	
	//获取用户信息
	@RequestMapping("getuser")
	public void getUser(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			int uid=Integer.parseInt(userid);
			rep.setCharacterEncoding("UTF-8");  
			rep.setContentType("text/html;charset=UTF-8"); 
			rep.getWriter().print(uid);
			break;
			}
		}
	}
	
	//获取本月完成任务条数
	@RequestMapping("donecount")
	public void getDoneCount(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		t_crm_activity_c activity_c=new t_crm_activity_c();
		activity_c.setHEALTHER(uid);
		String num=missionservice.getDoneCount(activity_c);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		rep.getWriter().print(num);
	}
	
	//获取本月总任务数
	@RequestMapping("monthcount")
	public void getMonthCount(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		t_crm_activity_c activity_c=new t_crm_activity_c();
		activity_c.setHEALTHER(uid);
		String num=missionservice.getMonthCount(activity_c);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		rep.getWriter().print(num);
	}
	//获取上月完成任务数
	@RequestMapping("ultimofinish")
	public void getUltimoFinish(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		t_crm_activity_c activity_c=new t_crm_activity_c();
		activity_c.setHEALTHER(uid);
		String num=missionservice.getUltimoFinish(activity_c);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		rep.getWriter().print(num);
	}
	//获取上月任务数
	@RequestMapping("ultimo")
	public void getUltimo(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		String userid=(String) req.getSession().getAttribute("userid");
		Cookie[] cookie=req.getCookies();
		int uid=0;
		for(int i=0;i<cookie.length;i++){
			if(cookie[i].getName().equals(userid)){
			uid=Integer.parseInt(userid);
			break;
			}
		}
		t_crm_activity_c activity_c=new t_crm_activity_c();
		activity_c.setHEALTHER(uid);
		String num=missionservice.getUltimo(activity_c);
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		rep.getWriter().print(num);
	}
	
	//获取本月日期
	@RequestMapping("nowdate")
	public void getDate(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		String date=missionservice.getDate();
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		rep.getWriter().print(date);
	}
	
	//获取上月日期
	@RequestMapping("ultimodate")
	public void getUltimoDate(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		String ultimodate=missionservice.getUltimoDate();
		rep.setCharacterEncoding("UTF-8");  
		rep.setContentType("text/html;charset=UTF-8"); 
		rep.getWriter().print(ultimodate);
	}
	
}
