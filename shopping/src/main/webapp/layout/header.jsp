<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
	*{
		box-sizing: border-box;
		padding: 0px;
		margin: 0px;
	}
	
	body{
		height: 100vh;
	}
	
	ul{
		display:flex;
		justify-content: right;
		align-items: right;
	}
	li{
		width: 100vh;
		background-color: #F9D509;
		list-style: none;
		display:flex;
		justify-content: right;
		align-items: right;
	}
	
	a{
		color:#fff;
		text-decoration: none;
		
	}
	
</style>
<meta charset="UTF-8">
<title> JSP 스크립트 연습 </title>

</head>
<body>
	<nav>
		<ul>
			<li><a href="login.jsp">로그인</a></li>
			<li><a href="join.jsp">회원가입</a></li>
			<li><a href="shoppingList.jsp">장바구니</a></li>
		</ul>
	</nav>
	
</body>
</html>