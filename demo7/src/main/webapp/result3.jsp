<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 result3.jsp파일입니다.</h1>
<%
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/plain");
	String msg3 = (String)request.getAttribute("msg3");
	out.println(msg3);
%>

	<p>테스트 dispatcher : <%= msg3%></p>
</body>
</html>