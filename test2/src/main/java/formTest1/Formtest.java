package formTest1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formtest")
public class Formtest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Formtest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pw"));
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("확인");
//		response.setCharacterEncoding("UTF-8");
//		System.out.println("id : " + request.getParameter("id"));
//		System.out.println("pw : " + request.getParameter("pw"));
		

		System.out.println("2id : " + request.getParameter("id"));
		System.out.println("2pw : " + request.getParameter("pw"));
		
	}

}
