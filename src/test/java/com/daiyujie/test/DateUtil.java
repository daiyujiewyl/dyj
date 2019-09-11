package com.daiyujie.test;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static int getAge(Date birthDay) throws Exception { 
        //获取当前系统时间
        Calendar cal = Calendar.getInstance(); 
        //如果出生日期大于当前时间，则抛出异常
        if (cal.before(birthDay)) { 
            throw new IllegalArgumentException( 
                "The birthDay is before Now.It's unbelievable!"); 
        } 
        //取出系统当前时间的年、月、日部分
        int yearNow = cal.get(Calendar.YEAR); 
        int monthNow = cal.get(Calendar.MONTH); 
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); 


        //将日期设置为出生日期
        cal.setTime(birthDay); 
        //取出出生日期的年、月、日部分  
        int yearBirth = cal.get(Calendar.YEAR); 
        int monthBirth = cal.get(Calendar.MONTH); 
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH); 
        //当前年份与出生年份相减，初步计算年龄
        int age = yearNow - yearBirth; 
        //当前月份与出生日期的月份相比，如果月份小于出生月份，则年龄上减1，表示不满多少周岁
        if (monthNow <= monthBirth) { 
            //如果月份相等，在比较日期，如果当前日，小于出生日，也减1，表示不满多少周岁
            if (monthNow == monthBirth) { 
                if (dayOfMonthNow < dayOfMonthBirth) age--; 
            }else{ 
                age--; 
            } 
        } 
        System.out.println("age:"+age); 
        return age; 
    }
	
	//根据传入的参数获取该日期的月初日期
	public static Date getDateByMonthInit(Date src){
		return src;
		
	}
	
	//根据传入的参数获取该日器的月末日期
	public static Date getDateByMonthLast(Date src){
		return src;
		
	}
	
	//求未来日期离今天还剩的天数
	public static int getDaysByFuture(Date future){
		return 0;	
	}
	
	//求过去日期离今天过去的天数
	public static int getDaysByDeparted(Date departed){
		return 0;
	}
	
	//65行写字
	
}
