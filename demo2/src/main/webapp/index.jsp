<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<style type ="text/css">
	body{
		margin : 20px;
		padding : 10px;
		height : 100vh;
		display : flex;
		justify-content: center;
		align-items: center;
	}/* 이렇게하면 정 가운데 정렬됨 */
	
	form {
		border : 1px solid black;
		width : 500px;
		height : 400px;
		padding : 15px;
		border-radius: 10px;
	}
</style>
</head>
<body>
<!-- demo2까지만 적어줘도 web.xml이 찾아줌 주소체계 URL 방식
web서버에서는 처리못해서 WAS로 넘어감(WebContainer)
서블릿파일이 xx.java파일을 URL매핑으로 먼저 찾고 xx.class 찾고 xx.obj찾고 response까지간다.
웹 컨테이너에 와서 이 URL찾고(index.jsp) 
xx_jsp.java 로 웹컨테이너가 변환시켜준다.
xx_jsp.class -> xx_jsp.obj ->response
	<h1>여기 주소는 http://localhost:8080/demo2/index.jsp입니다.</h1> 

주소는 절대 경로의 상대 경로로 설정할 수 있다.
/가 있으면 절대 경로로 시작
/가 없으면 상대 경로로 시작
-->

<form action="/demo2/loginProc" method="POST">
	<div class = "form-group">
		<label for = "email">Email Address : </label>
		<input type = "email" class = "form-control" placeholder="Enter email" id = "email" name = "email" value = "a@naver.com">
	</div>
	
	<div class = "form-group">
		<label for = "password">Password : </label>
		<input type = "password" class="form-control" placeholder="Enter password" id = "password" name = "password" value = "1234">
	</div>
	
	<div class="form-check mb-2 mr-sm-2" >
		<label for = "isRemember" class="form-check-label">Remember Me : </label>
		<input type = "checkbox"  class ="form-check-input" id = "isRemember" name = "isRemember" value = "">
	</div>
	
	<div>
		<label for = "hobby" >취미</label>
		<select name = "hobby">
			<option value = "코딩">코딩</option>
			<option value = "공부">공부</option>
			<option value = "프로젝트" selected = "selected">프로젝트</option>
			<option value = "운동">운동</option>
			<option value = "술마시기">술마시기</option>
		</select>
	</div>
	
	<div>
		<p>좋아하는 동물</p>
		<input type ="checkbox" name = "like" value = "cat" id = "cat"><label for = "cat">고양이</label>
		<input type ="checkbox" name = "like" value = "dog"id = "dog"><label for = "dog">강아지</label>
		<input type ="checkbox" name = "like" value = "lion"id = "lion"><label for = "lion">사자</label>
	</div>
	<button type = "submit" class="btn btn-success">submit</button>
</form>



</body>
</html>