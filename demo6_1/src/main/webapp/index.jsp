<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String imgDir = application.getInitParameter("imgDir");
		String ServerIp = application.getInitParameter("ServerIp");
		String realServerIp = application.getInitParameter("realServerIp");
	%>
	
	<p>imgDir : <%=imgDir %></p>
	<p>ServerIp : <%=ServerIp %></p>
	<p>realServerIp : <%=realServerIp %></p>
	<div>
		<img src = "/demo6_1<%=imgDir %>/b.png">
	</div>
</body>
</html>