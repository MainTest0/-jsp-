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
<!-- 변수 선언 1 2 3 4 5 6 7 -->
	<c:set var = "count" value = "0" />
	<%-- 반복문 사용 예시
	<p>Number${count }</p> --%>
	<c:forEach var = "category" items = "${list }">
		<c:set var = "count" value = "${count+1 }"></c:set>
		<c:out value="${count +2}"/>	
	</c:forEach>
	
</body>
</html>