<%@page import="userDTO.UserDTO"%>
<%@page import="userController.UserController"%>
<%@page import="userDAO.UserDAO"%>
<%@page import="javax.websocket.SendResult"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
UserController con = new UserController();
String id = request.getParameter("id");
String pw = request.getParameter("pw");

if (id == null || pw == null) {
	out.println("<script>alert('로그인 실패');location.href='../login.jsp'; </script>");
} else {
	out.println("<script>alert('로그인 성공');location.href='mainScreen.jsp'; </script>");
}
%>