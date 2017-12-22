package com.hydee.hcrm.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hydee.hcrm.service.OAuthService;

@Controller
public class WXCtrl {
	@Resource
	private OAuthService oAuthService;
	
	@RequestMapping("test")
	public String test(HttpServletRequest req,HttpServletResponse rep) throws IOException{
		try {
			oAuthService.WXinfo(req, rep);
			
		} catch (ServletException e) {
			e.printStackTrace();
		}
		return "redirect:/healthlist.html";
	}
	
}
