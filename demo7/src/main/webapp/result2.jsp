<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 여기는 result2.jsp 파일이야</h1>
	
	<% 
		response.setCharacterEncoding("UTF-8");
		//평문	헤더에 기술된다. JSon으로 만들고싶으면 JSonApplication
		response.setContentType("text/plain");		
		
		String msg = (String)request.getAttribute("msg2");
		msg += "< < < ";
		out.println(msg);
	%>
	
</body>
</html>