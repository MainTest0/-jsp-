<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 만약 이페이지에서 오류가 발생한다면 다른 곳으로 이동시켜 -->
    <%@ page errorPage = "errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 런타임 시 오류코드 errorPage로 보내기
		String str = null;
	// 오류내기 : 코드가 나오기때문에 취약점 나타날수있어서 감춰줘야함
		out.print(str.split("1"));
	%>
</body>
</html>