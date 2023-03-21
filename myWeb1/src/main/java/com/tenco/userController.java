package com.tenco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/uc")
public class userController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public userController() {
        super();
        // 자바 클래스이지만 javaEE 표준기술인 http 통신할수있게해주는기술인 httpservlet 상속을 받았고
        System.out.println("UserController 생성자 호출");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("UserController do Get 메서드 호출~");
		// http://localhost:8080/myWeb1/index.jsp 주소창에 입력하면 sysout 호출됨
		// 새로고침 할때마다 새로 요청함 생성자는 처음 호출될때만 호출됨
		// 응답을 처리하려면 request랑 response중 response 건드려야함
		PrintWriter out = response.getWriter();
		// 컨텐트타입은 (http에서 문자열 메시지가 만들어짐)http 헤더에 정의가 된다.
		// setContentType 이란거는 text/html기반 하나 배웠고 저번시간 연습했던
		// application/JSon이란거를 봤음
		// 즉 contentType이란거는 간단히 설명하면
		// 응답 보낼 데이터 타입의 형식이다
		// 그래서 웹표준기술인 MINE TYPE 이란 것이 정해져있다.
		// 우리가 마음대로 규칙을 정해서 보낼수있는게아니라
		// http 기반으로 통신을 주고받는거기때문에 정해져있다.
		// 어떤 데이터타입을 보낼지 미리 정해져있다.
		// MINE TYPE을 보기위해서 구글에 MDN, MINETYPE 검색
		response.setContentType("test/plain; charset=utf-8");
	}
	
	// 주소창에서 요청하는건 get 방식으로만 할수있음 POST 방식으로 하기위한 방법?
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("METHOD 방식 중 POST 요청 방식을 확인하고 응답 처리해보자");
		// 얘를 동작시키기 위해서 
		// http://localhost:8080/myWeb1/uc <- 주소창에 그냥 던지면 get방식으로 동작함
		// post방식으로 쓰기위해서는 주소 경로는 똑같지만 method 선정에 따라 구분할 수 있다 (누가? 서버가)

		// doPost 동작을 시키기 위해서는 http 통신할 때 메서드 방식중에 post 방식을 이해해야한다.
		// 주소와 메서드 방식으로 요청하면 문제가없는데 응답처리 해달라고 했기때문에
		// -> printwriter를 통해서 응답할 수 있다.
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain; charset=utf-8;");
		
		// writer 뽑기전에 response 세팅하고 컨텐트 지정해서 던지면 변경가능
		// 한글 안깨지고 됨
		PrintWriter writer = response.getWriter();
		writer.print("홍길동 ");
		// MINETYPE : text/plain 으로 처리
//		response.setContentType("test/plain; charset=utf-8");
		// Mike 문자열을 응답처리 해주세요
		
		
	}

}
