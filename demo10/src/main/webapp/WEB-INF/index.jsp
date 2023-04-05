<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 여기는 index.jsp 파일입니다.</h1>
	<!-- 
	spring으로 하게되면 mvc패턴 기반으로 만듬 
	WEB-INF 파일에다 만들고
	서블릿 만들어서 응답처리 해줘야함		
	-->
	
	<form action="inc" method = "post">
		username : <input type = "text" name = "username" value = "홍길동">
		<br>
		pw : <input type = "password" name = "pw" value = "1234">
		<input type = "submit" value ="보내기">
	</form>
	
</body>
</html>