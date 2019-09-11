package com.bw.controller;

public class StringUtils {
	
	public static boolean isEmpty(String str){
		if(str == null || "null".equals(str) || "".equals(str.trim())){
			return true;
		}
		return false;
	}
	
	public static String replace(String context){
		
		if(!isEmpty(context)){
			context = context.replaceAll("\\\\r\\\\n", "<p></p>");
			context = context.replaceAll("\\\\n", "<br/>");
			return context;
		}
		return "";
	} 
	
	
	
	public static boolean isPhone(String phone){
		return phone.matches("^1[3|5|7|8]\\d{9}$");
	}
	
	
	public static boolean isEmail(String email){
		return email.matches("^\\w+@\\w+(.com|.cn)$");
	}
	
	
}
