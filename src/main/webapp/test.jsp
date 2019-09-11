<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	function testform(){
		
		$.post("testform.do",$("form").serialize(),function(data){
			if(data == 0){
				alert("简介不能为空！");
			}else{
				alert("验证通过！");
			}
		},"json");
		
	}
</script>
</head>
<body>
	<form action="#">
		内容:<textarea rows="10" cols="10" name="context">
		</textarea><br><br>
		手机号:<input type="text" name="phone"><br><br>
		邮箱:<input type="text" name="email"><br><br>
		<input type="button" value="验证" onclick="testform()">
	</form>

</body>
</html>