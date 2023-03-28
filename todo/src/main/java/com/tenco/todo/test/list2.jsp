<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
	<th>ID</th>
	<th>NAME</th>
	</tr>
	<c:forEach var = "test" items = "${list2}">
		<tr>
			<td>${test.id}</td>
			<td>${test.name }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>