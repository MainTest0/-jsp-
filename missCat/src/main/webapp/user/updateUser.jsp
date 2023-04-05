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

input {
	display: flex;
	flex-direction: column;
	margin-bottom: 10px;
	flex-wrap: wrap;
}
</style>
<jsp:include page="/commonjsp/header.jsp" />
<div id=postion>
	<jsp:include page="/commonjsp/nav.jsp" />
	<div class="myInfoUpdatePage">
		<h1>회원 정보 수정 페이지</h1>
		<form action="../UserJoinController?action=update" method="post">
			<label for="nowId">내 ID 입력 </label><input type="text" name="nowId"
				id="nowId"> <label for="id">ID 수정</label><input type="text"
				name="id" id="id"> <label for="pw">PW 수정</label><input
				type="text" name="pw" id="pw"> <input type="submit"
				value="정보 수정">
		</form>
	</div>
</div>
<jsp:include page="/commonjsp/footer.jsp" />
