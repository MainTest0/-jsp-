package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyTestDemo6")
public class MyTestDemo6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyTestDemo6() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = getServletConfig().getInitParameter("id");
		String pw = getServletConfig().getInitParameter("pw");
		
		System.out.println(id);
		System.out.println(pw);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
