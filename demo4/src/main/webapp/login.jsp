<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	
    	if(username != null && password != null){
    		if(username.equals("admin") && password.equals("1234")){
    			// 로그인 성공
    			// 세션에 사용자 이름 저장
    			session.setAttribute("username", username);
    			// 로그인 성공 후 인덱스.jsp페이지로 리다이렉트 처리 - 새로운 요청을 만들어 낸다.
    			response.sendRedirect("admin.jsp");
    		} else {
    			// 로그인 실패
    			out.print("<p> 로그인에 실패하였어여 </p>");
    		}
    	}
    %>