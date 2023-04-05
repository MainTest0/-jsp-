<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	margin-left: 600px;
	justify-content: center;
	align-items: center;
}

input {
	display: flex;
	flex-direction: column;
	margin-bottom: 10px;
	flex-wrap: wrap;
}
</style>
<jsp:include page="/commonjsp/header.jsp" />
<div id="sectionBox">
	<jsp:include page="/commonjsp/nav.jsp" />
	<div id=postion>
		<h1>회원가입 페이지</h1>
		<section>
			<form action="../UserJoinController?action=saveUser" method="post">
				<label for="id">ID : </label><input type="text" name="id" id="id">
				<label for="pw">PW : </label><input type="password" name="pw"
					id="pw"> <input type="submit" value="회원가입">
			</form>
		</section>
	</div>
</div>
<jsp:include page="/commonjsp/footer.jsp" />