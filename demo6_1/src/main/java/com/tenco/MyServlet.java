package com.tenco;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminID = getServletConfig().getInitParameter("adminID");
		String adminPW = getServletConfig().getInitParameter("adminPW");
		System.out.println(adminID + adminPW);
		
		String imgDir = getServletContext().getInitParameter("imgDir");
		String testServerIp = getServletContext().getInitParameter("testServerIp");
		String realServerIp = getServletContext().getInitParameter("realServerIp");
		System.out.println(imgDir+"\n"+testServerIp+"\n"+realServerIp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
