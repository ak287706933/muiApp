package com.hydee.hcrm.util;
//工具类
public class TaskTool {
	    //做数字判断
		public static boolean isNumeric(String str){
			for (int i = 0; i < str.length(); i++){
			   if (!Character.isDigit(str.charAt(i))){
			    return false;
			   }
			}
			  return true;
		}

}
