<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%
		// form 태그보낼 떄 name 값, password 값 다시 받아낼 수 있다.
		String username = request.getParameter("username");
		String	password = request.getParameter("password");
		
		// 데이터 베이스 결합 전에 로직짜기
		if(username != null && password != null){
			
			if(username.equals("admin") && password.equals("1234")){
				// 세션에 값 세팅하기
				session.setAttribute("username", username);
				
				// 이 상황은 사용자가 로그인에 성공한상황
				// 로그인했으면 다른곳으로 보내고싶다.
				response.sendRedirect("index.jsp");
			} else {
				// 로그인에 실패한 상황
				out.println("<script>alert('로그인에 실패했습니다'); location.href = 'login.jsp'; </script>");
			}
		}
		
	%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type = "text/css">
	body{
		display : flex;
		justify-content: center;
		align-items: center;
		flex-direction: column;
		height: 100vh;
	}
	
	form{
		display: flex;
		flex-direction: column;
		margin-bottom: 5px;
	}
	
	/* 속성 선택자
	태그 선택 [속성값 = 값] */
	input[type = "text"], 
	input[type = "password"], 
	input[type = "submit"]{
		padding: 8px;
		border-radius: 5px;
		border: 1px solid #CCC;
	}
	
	input[type = "submit"]{
		background-color: #13B8F9;
		color: #fff;
		border: none;
		cursor: pointer;
	}
	/* 속성선택자 + 가상선택자 */
	
	input[type="submit"]:hover{
		background-color: #FF6135;
	}
	
	label{
		font-weight: bold;
	}
	
</style>
<body>

	<h1>Login Page</h1>
	
	<form action = "login.jsp" method = "POST">
		<label for = "username"> Username : </label>
		<input type = "text" name = "username" id = "username" required="required"> 
		<label for = "password"> Password : </label>
		<input type = "password" name = "password" id = "password" required="required">
		<input type = "submit" value = "Login"> 
	</form>
	
</body>
</html>