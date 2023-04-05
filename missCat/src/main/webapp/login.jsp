<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="userDTO.UserDTO"%>
<%@page import="userController.UserController"%>
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
	margin-left: 600px;
}

input {
	display: flex;
	flex-direction: column;
	margin-bottom: 10px;
	flex-wrap: wrap;
}

.join {
	display: inline-block;
}
</style>
<jsp:include page="/commonjsp/header.jsp" />
<div id="sectionBox">
	<jsp:include page="/commonjsp/nav.jsp" />
	<div id=postion>
		<h1>로그인 페이지</h1>
		<section>
			<form action="/UserController" method="post">
				ID <input type="text" name="id" id="id"> PW <input
					type="password" name="pw" id="pw"> <input type="submit"
					value="로그인" class="join">
				<button type="button" onclick="location.href = '/user/join.jsp';">회원가입</button>
			</form>
		</section>
	</div>
</div>
<jsp:include page="/commonjsp/footer.jsp" />
