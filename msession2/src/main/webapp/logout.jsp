<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 로그 아웃 코드 작성 
// 센드리다이렉트 

session.invalidate();
response.sendRedirect("login.jsp");
%>