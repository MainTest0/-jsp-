package com.tenco.controller;

import java.io.IOException;
import java.text.CollationKey;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL : 서버의 정확한 자원의 위치 Locate
// 주소설계할 때 http://localhost:8080/blog/index.html
// 정확히 어떤 폴더의 어떤 파일인지 지정하는 것
// 실제로 존재하는 녀석
// URI : http://localhost8080/blog/boardcontroller
// 식별자 같은 녀석

// web.xml 파일의 환경설정 같은건데
// web.xml 파일은 web 서버가 동작 시 한번만 로딩되기 때문에
// 서버를 재시작 해야한다.
@WebServlet("/boardcontroller")		
public class borderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public borderController() {
        super();
    }

    // 메서드는 get방식
    // 주소는 http://localhost:8080/blog/boardcontroller
    // http://localhost:8080/blog/boardcontroller?name=Lee
    // get방식으로는 데이터를 못보내나요?
    // 시작줄에 담아서 보낼 수 있음
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("boardController 동작");
		System.out.println(" contextPath : " + request.getContextPath());
		System.out.println("cookies : "+request.getCookies());
		System.out.println("session : " +request.getSession());
		// Jsession ID 란 같은 사용자가 웹 서버에 최초 요청하고 응답시에 값을 담아서 보낸다.
		System.out.println("ParameterNames : " +request.getParameterNames());
		System.out.println("test : " + request.getParameter("name"));
		
		// response 객체
		response.addCookie(new Cookie("mycookie", "asd1234"));
		response.getWriter();
		response.getStatus();
		response.sendRedirect("/userController");
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
