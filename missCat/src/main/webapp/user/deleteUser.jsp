<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/css/header.css">
<link rel="stylesheet" href="/css/footer.css">
<link rel="stylesheet" href="/css/nav.css">
<style>
#position {
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

input {
	display: flex;
	flex-direction: column;
	margin-bottom: 10px;
	flex-wrap: wrap;
}
</style>
<jsp:include page="/commonjsp/header.jsp" />
<div id="position">
	<jsp:include page="/commonjsp/nav.jsp" />
	<div class="myInfoUpdatePage">
		<h1>회원 정보 삭제 페이지</h1>
		<form action="../UserJoinController?action=delete" method="post">
			<label for="id">탈퇴할 ID 입력 </label><input type="text" name="id"
				id="id"> <input type="submit" value="회원 탈퇴">
		</form>
	</div>
</div>
<jsp:include page="/commonjsp/footer.jsp" />
