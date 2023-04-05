package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inc")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 주소설계 http://localhost:8080/demo10/inc?name=홍길동&pw=123
		String username = request.getParameter("name");
		String pw = request.getParameter("pw");
		
		System.out.println("username : " + username);
		System.out.println("pw : " + pw);
		
		
		// GET 방식에 대한 이해
		//1.  콘솔에 한글 안깨짐 username : 홍길동 pw : 123
		
		// index.jsp 응답
		// path경로 : 우리가 알고있는 uri개념(url)
		// requestDispatcher 폴더경로
		// root경로는 webapp -> WEB-INF -> index.jsp
		
		// 2. 여기서 jsp 안타고 바로 응답하고싶다
		// 응답시 한글 깨짐 -> 해결방법 setContentType
//		response.setContentType("text/html; charset=UTF-8");
//
//		PrintWriter out =  response.getWriter();
//		out.print("username : " + username);
//		out.print("<br>");
//		out.print("pw : " + pw);
		
		// 보안상으로 바로 접근 할 수 없어서 forward 방식으로 처리를 한다.
		// path 방식인지 docbase 방식인지 구분하기
		//sendredirect는 다시 사용자에게 갔다가 오는 즉 url 요청으로 갔다오는거라서 path 방식으로 적어줘야한다.
		
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 방식일 때
		// 1번 콘솔창에 요청으로 들어온 한글 깨짐
		// request.setCharacterEncoding UTF-8
//		request.setCharacterEncoding("UTF-8");
		
		String username = request.getParameter("username");
		String pw = request.getParameter("pw");
		
		System.out.println("username : " + username);
		System.out.println("pw : " + pw);
		
		// 응답처리
		// 요청으로 들어온 값이 콘솔창에서 한글 깨짐
		// 2. 응답시 한글 깨짐 해결방안 setContentType 설정
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("사용자 이름:  " + username);
		out.print("<br>");
		out.print("사용자 비밀번호:  " + pw);
		
	}

}
