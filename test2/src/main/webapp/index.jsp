<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<form action="/test2/loginProc" method="POST">
		<div>
			<label>EamilAddress : </label> <input type="text" value="a@naver.com"
				id="email" name="email">
		</div>
		<div>
			<label>Password : </label> <input type="password" value="1234"
				id="password" name="password">
		</div>
		<div>
			<label for="RememberMe">Remember ME : </label> <input type="checkbox"
				id="isRemember" name="isRemember">
		</div>
		<div>
			<label for="hobby">취미</label> <select name="hobby">
				<option value="코딩">코딩
				<option value="공부">공부
				<option value="프로젝트" selected="selected">프로젝트
				<option value="산책">산책
				<option value="드라이브">드라이브
			</select>
		</div>
		<div>
			<p>좋아하는 동물</p>
			<input type="checkbox" name="like" value="cat" id="cat"><label
				for="cat">고양이</label> <input type="checkbox" name="like" value="dog"
				id="dog"><label for="dog">강아지</label> <input type="checkbox"
				name="like" value="lion" id="lion"><label for="lion">사자</label>
		</div>
		<button type="submit" class="btn btn-success">submit</button>
	</form>
</body>
</html>