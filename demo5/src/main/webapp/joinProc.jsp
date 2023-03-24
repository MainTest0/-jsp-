<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import ="java.sql.*" %>
    
<%
	request.setCharacterEncoding("UTF-8");

	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String email = request.getParameter("email");
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/demo5?serverTimezone = Asia/Seoul";
		String dbUser = "root";
		String dbPw = "1234";
		Connection conn = DriverManager.getConnection(url, dbUser,   dbPw);
		String sql =" INSERT INTO user(username, password, email) VALUES(?,?,?); ";
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, username);
		stmt.setString(2, password);
		stmt.setString(3, email);
		stmt.executeUpdate();
		
		conn.close();
		
		response.sendRedirect("joinOk.jsp");
		
	} catch(Exception e){
		e.printStackTrace();
	}

%>