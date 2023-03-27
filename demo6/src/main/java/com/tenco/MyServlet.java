package com.tenco;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 서블릿은 라이프 사이클이있다.
// 이닛 메서드가 먼저 호출되고 그다음 서비스 메서드 호출되고
// 생성부터 종료시점까지 라이브 사이클이 있다.
//요청에따라서 두겟이 자동으로 호출되던가 포스트가 호출된다.
//@WebServlet("/MyServlet")

import org.apache.catalina.core.ApplicationContext;
import org.apache.tomcat.util.net.ApplicationBufferHandler;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyServlet() {
    	super();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//내장 객체 config 활용해서 초기 파라미터 값 확인하기
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPw = getServletConfig().getInitParameter("adminPw");
		System.out.println("admin ID : " + adminId + "\n"+ "adminPw : " + adminPw);
		
		String imgDir =	getServletContext().getInitParameter("imgDir");
		String testServerIp = getServletContext().getInitParameter("testServerIp");
		String realServerIp = getServletContext().getInitParameter("realServerIp");
		
		System.out.println(imgDir);
		System.out.println(testServerIp);
		System.out.println(realServerIp);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
