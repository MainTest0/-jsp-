package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// web.xml 파일이 변경되면 서버를 다시 껐다켜야함
// 서버 스탑되어있어서 상관없음
@WebServlet("/usercontroller")		// 여기서 바꾸면 어노테이션으로 간편하게 설정가능
public class userController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public userController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메서드 호출");
		//json 형식으로 문자 리턴하기
		response.setCharacterEncoding("UTF-8");
		PrintWriter printWriter = response.getWriter();
		response.setContentType("application/json");
		printWriter.print("{\r\n"
				+ "	\"name\" : \"홍길동\",\r\n"
				+ "	\"age\" : 25\r\n"
				+ "}");
	}
	
	// method 방식은 post야
	// 경로주소는 http://localhost:8080/blog/usercontroller
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form 태그에서 넘어오는 값들을 받아보고 ??어떤 연산을해서 응답 처리를 해보자
		System.out.println("확인 ok");
		// 한글 깨짐방지
		request.setCharacterEncoding("UTF-8");
		// 요청시 파라미터로 넘겨온 키값을 확인해서 값을 추출하는 기술을 알아야함
		// talend.api 에서 naem 과 password 키값으로 홍길동과 1234 설정하고 그걸 받는 녀석을 여기서 설정해야함
		String name = request.getParameter("name");		// 문자열 return함
		String pwd = request.getParameter("password");
		
		System.out.println("name : " +name);
		System.out.println("pwd : " +pwd);
		
		// 응답 처리 간단하게 해주세요
		// MINETYPE은 text/html 방식이고 간단히 이름과 비번을 확인하였습니다 글자
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		String name1 = request.getParameter("name1");
		String age = request.getParameter("age");
		
		System.out.println("name1 : " + name1 + "을 확인하였습니다.");
		System.out.println("pwd1 : " + age+"을 확인하였습니다.");
		PrintWriter out = response.getWriter();
//		out.print(name1);
//		out.print(age +"\n");
				
		// Json 형식으로 name 홍길동 age 10 이라는 값을 리턴시키세요
		out.print("{");
		out.print("\"name\" : " +name1+",");
		out.print("\"age\" : " + age);
		out.print("}");
	}

}
