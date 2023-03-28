<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카테고리 정보 저장하기</title>
</head>
<body>
	<h2> category insert form</h2>
	<form action = "/todo2/TodoTest?action=insert" method = "post">
		<input type = "text" name = "name" required="required">
		<input type = "submit" value = "카테고리 저장">
				
	</form>
	
</body>
</html>