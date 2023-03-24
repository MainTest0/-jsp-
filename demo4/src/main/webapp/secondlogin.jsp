<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	String id = request.getParameter("userId");
    	String pw = request.getParameter("password");
    	
    	if(id != null && pw != null){
    		if(id.equals("user") && pw.equals("3214")){
    			session.setAttribute("userId",id);
    			response.sendRedirect("index.jsp");
    		} else{
    			out.print("<p>로그인 실패</p>");
    		}
    		
    	}
    %>
    