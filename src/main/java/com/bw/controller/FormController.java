package com.bw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {
	
	@RequestMapping("testform.do")
	@ResponseBody
	public int testform(String context,String phone,String email){
		
		String replace = StringUtils.replace(context);
		System.out.println(replace);
		if(StringUtils.isPhone(phone)){
			System.out.println("正确手机号！");
		}else{
			System.out.println("手机号格式错误");
		}
		
		if(StringUtils.isEmail(email)){
			System.out.println("正确邮箱！");
		}else{
			System.out.println("邮箱格式错误");
		}
		
		if("".equals(replace)){
			return 0;
		}
		
		return 1;
		
	}

}
