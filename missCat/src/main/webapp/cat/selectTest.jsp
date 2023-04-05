<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String username = (String) session.getAttribute("id");
if (username == null) {
	response.sendRedirect("login.jsp");
}
%>
<link rel="stylesheet" href="/css/header.css">
<link rel="stylesheet" href="/css/footer.css">
<link rel="stylesheet" href="/css/nav.css">
<style>
h1 {
	color: red;
	text-align: center;
	font-size: 40px;
	align-items: center;
	justify-content: center;
	padding-bottom: 30px;
}

table {
	color: black;
	align-items: center;
	justify-content: center;
}

#underline:hover {
	text-decoration: underline;
}

#body_div {
	display: flex;
}

#postion {
	flex-direction: row;
	display: flex;
}

.myInfoUpdatePage {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	margin-left: 500px;
}
</style>

<jsp:include page="/commonjsp/header.jsp" />
<div id=postion>
	<jsp:include page="/commonjsp/nav.jsp" />
	<div class=myInfoUpdatePage>
		<h1>
			긴급알림 <br>(이런 고양이 보셨나요?)
		</h1>
		<a href="#">
			<table>
				<c:forEach var="cat" items="${list}">
					<tr>
						<th>Name</th>
						<th>Gender</th>
						<th>Age</th>
						<th>Favorite</th>
						<th>Hate</th>
					</tr>
					<%-- request.getAttribute("list"); --%>
					<tr id=underline>
						<td>${cat.name}</td>
						<td>${cat.gender}</td>
						<td>${cat.age}</td>
						<td>${cat.favorite}</td>
						<td>${cat.hate}</td>
					</tr>
				</c:forEach>
			</table>
		</a>
	</div>
</div>
<jsp:include page="/commonjsp/footer.jsp" />
