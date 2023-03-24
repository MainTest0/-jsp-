<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// session을 날려버리는 메서드
	// session 메모리에서 해제한다.
	session.invalidate();
	//이 페이지에 머물고있으면 안되니까 다시 로그인 해
	response.sendRedirect("login.jsp");
%>