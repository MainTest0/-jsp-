<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 사용자가 요청하면 렌더링 되기전에 더빠르게 자바코드 돌릴거임
    	// session은 내장객체라서 선언없이 바로 쓸 수 있다.
    	// session을 꺼내는 방법 확인	
    	// session.getAttribute는 Object 데이터 타입이라 다운캐스팅 해줌
    	String username = (String)session.getAttribute("username");
    
    	if(username == null){
    		// session에 username이 없네 다시돌아가
    		response.sendRedirect("login.jsp");
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
		height:100vh;
		background-color: #13B8F9;
		display: flex;
		justify-content: center;
		align-items: center;
	}
	
	form{
		display: flex;
	}
	
	h1{
		color: #fff;
	}
	
	input{
		background-color: #FF6135;
		border: 1px solid #FF6135;
		color: #fff;
		border-radius: 8px;
		cursor: pointer;
		font-size: 15px;
		padding: 5px;
		margin-left: 8px;
		font-weight: bold;
	}
	
</style>
<body>
	<h1>Welcome, <%=username %>!</h1>
	
	<form action = "logout.jsp">
		<input type = "submit" value = "logout">
	</form>
</body>
</html>