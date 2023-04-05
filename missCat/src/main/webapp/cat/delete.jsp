<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String username = (String) session.getAttribute("id");
if (username == null) {
	response.sendRedirect("/login.jsp");
}
%>
<link rel="stylesheet" href="/css/header.css">
<link rel="stylesheet" href="/css/footer.css">
<link rel="stylesheet" href="/css/nav.css">
<style>
#postion {
	flex-direction: row;
	display: flex;
}

.myInfoUpdatePage {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	margin-left: 600px;
}
</style>
<jsp:include page="/commonjsp/header.jsp" />
<div id=postion>
	<jsp:include page="/commonjsp/nav.jsp" />
	<div class="myInfoUpdatePage">
		<h1>유기묘 정보 삭제하기</h1>
		<form action="/CatServlet?action=delete" method="post">
			삭제할 이름 : <input type="text" name="name" id="name" required="required"><br>
			<input type="submit" value="삭제하기">
		</form>
	</div>
</div>
<jsp:include page="/commonjsp/footer.jsp" />
