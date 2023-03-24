<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Login Example </title>
</head>
<body>
	<form action = "login.jsp" method ="POST">
		<label> 사용자이름 : </label>
		<input type = "text" id = "username" name = "username">
		<label> 비밀번호 : </label>
		<input type = "password" id = "password" name = "password">
		<input type = "submit" value = "로그인">
	</form>
	<%--Session 클래스에 사용자 이름이 저장되어있으며 Login 상태를 유지합니다.--%>
	<%// 로그인된 상태
		if(session.getAttribute("username") != null){
	%>
			<p> 
			현재 로그인 상태입니다. 사용자 이름 : <%=session.getAttribute("username") %>
			</p>
			<%} %>
</body>
</html>