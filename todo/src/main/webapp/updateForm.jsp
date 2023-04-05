<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update form</title>
</head>
<body>
    <h1>category update form</h1>
    <p> 
        HTTP 메세지 시작줄에 추가적인 정보를 달아서 서버에 보낼 수 있다.
        쿼리 파라미터 방식, 패스 베리어블 방식 2가지가 있음
    </p>
    <form action="/todo/cTest?action=update" method="post">
        <input type="number" name="id" required="required">
        <input type="text" name="name" required="required">
        <input type="submit" value="카테고리저장">
    </form>
</body>
</html>