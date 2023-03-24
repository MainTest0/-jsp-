<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="loginProc.jsp" method="POST">
		<h1>로그인 폼 양식을 만들어서 제출하는 코드를 작성하시오</h1>
		<label>ID : </label> 
		<input type="text" value="admin" name="username"
			id="username"> 
			<label>PW : </label> 
			<input type="password" value="1234" name="password" id="password">
			<input type="submit" value="로그인">
	</form>


</body>
</html>