<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="secondlogin.jsp" method = "POST">
		<label>사용자 ID : </label> <input type="text" name="userId" id="userId">
		<label>사용자 PW : </label> <input type="password" name="password"
			id="password"> <input type="submit" name="login" value="로그인">
	</form>
	
</body>
</html>