<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.tenco.todo.dto.TodoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Todo List </h2>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
		</tr>
		<%--  <% request.getAttribute("list"); %> 아래랑 같은 코드--%>
		<c:forEach var = "todoList" items ="${list}">
		<tr>
			<td>${todoList.id}<button><a href ="/todo2/TodoTest?action=delete&cid= ${todoList.id}">delete</a></button></td>
			<td>${todoList.name}</td>
		</tr>
			
		</c:forEach>
	</table>
	
</body>
</html>