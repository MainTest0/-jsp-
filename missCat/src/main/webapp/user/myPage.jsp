<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<h1>내 정보 수정 페이지</h1>
		<ul>
			<li><a href="/user/updateUser.jsp"><p>회원정보 수정</p></a></li>
			<li><a href="/user/deleteUser.jsp"><p>회원 탈퇴</p></a></li>
		</ul>
	</div>
</div>
<jsp:include page="/commonjsp/footer.jsp" />
