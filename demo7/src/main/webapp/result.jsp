<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 result.jsp파일입니다.</h1>
	<div>
		<%
		// request가 그대로 전달되서 데이터 긁어낼 수 있다.
		// 받을 때 getAttribute
		String message = (String) request.getAttribute("msg");
		out.println(message);
		%>

		<p>
			넘겨받은 데이터 :
			<%=message%></p>

	</div>
</body>
</html>