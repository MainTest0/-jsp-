<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>유기묘 수정 update</h1>
	<form action="/missCat/CatServlet?action=update" method="post">
        수정할 이름 : <input type="text" name="correctionName" id= "correctionName" required="required"><br>
        이름 : <input type="text" name="name" id="name" required="required"><br>
        성별 : <input type="text" name="gender" id = "gender"><br>
        나이 : <input type="text" name="age" id = "age"><br>
        좋아하는 것 : <input type="text" name="favorite" id = "favorite"><br>
        싫어하는 것 : <input type="text" name="hate" id = "hate"><br>
        <input type="submit" value="등록">
    </form>
</body>
</html>