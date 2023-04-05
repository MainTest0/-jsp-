<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="userController.UserController"%>
<%
// 세션 확인
String username = (String) session.getAttribute("id");
if (username == null) {
	response.sendRedirect("/login.jsp");
}
%>
<link rel="stylesheet" href="/css/header.css">
<link rel="stylesheet" href="/css/footer.css">
<link rel="stylesheet" href="/css/nav.css">
<style>
#sectionBox {
	display: flex;
}

#postion {
	display: flex;
	flex-direction: column;
	display: 2;
	justify-content: center;
	align-items: center;
}

a:hover {
	text-decoration: underline;
}

article {
	float: left;
	margin-left: 10px;
	margin-bottom: 10px;
}

h1 {
	display: flex;
	align-items: center;
	justify-content: center;
}
</style>
<jsp:include page="/commonjsp/header.jsp" />
<div id="sectionBox">
	<jsp:include page="/commonjsp/nav.jsp" />
	<div id=postion>
		<h1>입양 정보</h1>
		<section id=sectionBox>
			<article>
				<img src="images/cat1.jpg" height="300" width="300">
				<p>
					이름 : 호두 <br>나이 : 8살<br> 지역 : 김해
				</p>
			</article>
			<article>
				<img src="images/cat2.jpg" height="300" width="300">
				<p>
					이름 : 자두<br> 나이 : 10살<br> 지역 : 부산
				</p>
			</article>
			<article>
				<img src="images/cat3.jpg" height="300" width="300">
				<p>
					이름 : 나비 <br>나이 : 5살 <br>지역 : 창원
				</p>
			</article>
			<article>
				<img src="images/cat4.jpg" height="300" width="300">
				<p>
					이름 : 봉식<br> 나이 : 2살 <br>지역 : 마산
				</p>
			</article>
			<article>
				<img src="images/cat5.jpg" height="300" width="300">
				<p>
					이름 : 춘자 <br>나이 : 2살 <br>지역 : 진주
				</p>
			</article>
		</section>
	</div>
</div>
<jsp:include page="/commonjsp/footer.jsp" />