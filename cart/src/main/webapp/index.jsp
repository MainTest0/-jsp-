<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "cartProc.jsp" method="POST">
	<input type = "checkbox" name = "fruit" id ="apple">
	<label for = "apple">사과</label>
	<input type = "checkbox" name = "fruit"id ="banana">
	<label for = "banana">바나나</label>
	<input type = "checkbox" name = "fruit"id ="pich">
	<label for = "pich">복숭아</label>
	<input type = "submit" value="담기">
	</form>
</body>
</html>



