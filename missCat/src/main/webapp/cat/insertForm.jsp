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

h1 {
	display: flex;
	align-items: center;
	justify-content: center;
}
</style>
<jsp:include page="/commonjsp/header.jsp" />
<div id=postion>
	<jsp:include page="/commonjsp/nav.jsp" />
	<div class="myInfoUpdatePage">
		<h1>신고 등록하기</h1>
		<form action="/CatServlet?action=insert" method="post">
			이름 : <input type="text" name="name" id="name" required="required"><br>
			성별 : <input type="text" name="gender" id="gender"><br>
			나이 : <input type="text" name="age" id="age"><br> 좋아하는 것
			: <input type="text" name="favorite" id="favorite"><br>
			싫어하는 것 : <input type="text" name="hate" id="hate"><br> <input
				type="submit" value="등록하기">
		</form>
	</div>
</div>
<jsp:include page="/commonjsp/footer.jsp" />
