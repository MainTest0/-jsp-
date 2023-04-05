<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav id=body_section>
	<ul>
		<%
			String username = (String) session.getAttribute("id");
			if (username != null) {
			%>
		<li><a href="/logout.jsp"><p>로그아웃</p></a></li>
		<li><a href="/user/myPage.jsp"><p>마이페이지</p></a></li>
		<%
			}
			%>
		<li><a href="/CatServlet?action=select"><p>유기묘 조회하기</p></a></li>
		<li><a href="/cat/insertForm.jsp"><p>유기묘 등록하기</p></a></li>
		<li><a href="/cat/update.jsp"><p>유기묘 수정하기</p></a></li>
		<li><a href="/cat/delete.jsp"><p>유기묘 삭제하기</p></a></li>
	</ul>
</nav>
