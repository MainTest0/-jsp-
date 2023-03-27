<%@page import="org.apache.tomcat.util.net.ApplicationBufferHandler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- index2.jsp에서 에러 발생하면 여기로 옴
    여기 jsp파일을 에러 전용 페이지로 사용하려면
    반드시 isErrorPage= true를 선언해줘야 한다. -->
    <%@ page isErrorPage="true" %>
    
<!DOCTYPE html>
<html>
<head>
<style>
    	*{
    		box-sizing: border-box;
    		padding:0;
    		margin: 0;
    	}
    	body{
    		height: 100vh;
    		display: flex;
    		justify-content: center;
    		align-items: center;
    	}
    	
    	div{
    	text-align: center;
    	}
    	
    	a{
    		margin-top: 8px;
    	}
    	
    </style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String error404 = application.getInitParameter("error404");
	String home = application.getInitParameter("imgDir");
%>
	<div>
		<img src = "/demo6<%= error404%>/error404.png">
		<h2> 찾으시는 페이지가 없습니다. </h2>
		<h4>잘못된 접근이거나 요청하신 페이지를 찾을 수 없습니다.</h4>
		<h4>입력하신 페이지의 주소가 정확한지 다시 한번 확인해 주시기 바랍니다.</h4>
		<a href = "index2.jsp"><img src = "/demo6<%= home %>/home.png"></a>
	</div>
	
</body>
</html>