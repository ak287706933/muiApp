package com.hydee.hcrm.pojo;

import java.io.IOException;

import javax.servlet.ServletException;

public class TestURL {

	public static void main(String[] args) throws ServletException, IOException{
		 String source="http://ydjcs.hydee.cn/crm/login.html";
	     System.out.println(CommonUtil.urlEncodeUTF8(source));
	}
}
