package com.bw.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestForm {
		
		public static void main(String[] args) {
			String sql = "运航晚上躺着回去 干死你\\r\\n略略略\\nxxxxx 你远航**************";
			
			String replaceAll = sql.replaceAll("r|n", " ");
			String[] split2 = replaceAll.split(" ");
			
			
			String s = "";
			for (String string : split2) {
				s+=" "+string;
			}
			
			
			Pattern compile = Pattern.compile("(\\)");
			
			Matcher matcher = compile.matcher(s);
			
			
			
		}
		
}
