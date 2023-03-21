package com.tenco;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet
 @WebServlet 이게 어노테이션
 클래스가 100개 있다고 가정
 이 클래스를 URL 매핑시키기 위해서 welcome list에 list를 다적어야함
 요즘엔 객체를 생성할 때 어노테이션 확인해서 좀더 간편한 기법으로 작성가능
 웹 브라우저로 요청할 수 있는 방법 중
 get 방식으로 요청
 get 방식 : 자원 해당하는 서버에 자원요청할 때는 요청방식을 get방식이라 쓴다.
 post방식 : 자원을 추가해달라 니 서버에 내정보를 추가해달라
 (회원가입) 회원가입하게되면 내 정보들을 묶어서 서버에 보내면 애는 그걸 연산해서 db에 넣음
 이런거할때는 post방식으로 보낸다하고
 단순히 자원을 요청할 때는 get 방식으로 한다.
 */
@WebServlet("/ms")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public myServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 메서드가 동작했을 때 request와 response가 떨어짐
		// ms는 정적인파일이아니라 동적인 자원을 리턴할 때 쓴다 연산을 하기 때문에
		// 웹서버는 WAS 또는 아파치톰캣에서는 웹 컨테이너라고 부르는 애들 안에 URL 매핑을 통해서 어떤녀석을 선택할지 결정
		// 다시 던질 때 request객체와 response객체가 생성되서 던져진다.
		// request객체에는 http메시지를 포함하는 어떤 사이트에서 출발했는지에대한 정보가 담겨짐
		// response는 응답할 때 쓰이는 녀석 
		// 되었나요?
		// getWriter 어디서 봤음
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		request.getContentType();
//		System.out.println("ContentType : " + request.getContentType());
		
		//리스판스 객체안에다 문자열 기반인 데이터를 밀어넣을수있다.
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html; charset=utf-8;");
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<section>");
		out.print("<p style = \"color:red\">");
		out.print(" Hello Frist Servlet ");
		out.print("</p>");
		out.print("</section>");
		out.print("</body>");
		out.print("</html>");
		
		// 응답할 때는 response객체를 사용
		// 문자열 보낼 때 뭘썼나요? 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(response.getOutputStream()));
		// 리스판스 객체에다가 1byte씩 연결할수있는스트림 들고오고 확장스트림 바이트단위로 0101 쓰는거는 인코딩 단위로 처리해야하기때문에 불편
		// 문자열기반 확장 writer로 확장한거
		bw.write("가나다라마바사");
		// 버퍼드라이터 쓸 때 조심해야하는거 문자열 끝을 반드시 알려줘야함
		bw.newLine();
		// 버퍼드가 그안에 메모리를 비워줘야 확실히 전달됨
		bw.flush();
		
		// http://localhost:8080/myWeb1/ms(url매핑) 이렇게 URL 체계가 만들어짐
		// get방식은 주소창에서 요청가능 주소창에 http://localhost:8080/myWeb1/ms 엔터
//		System.out.println("안녕 MyServlet 객체가 동작했어!!!");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doGet(request, response);
	}

}
