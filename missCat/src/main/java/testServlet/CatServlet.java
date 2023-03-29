package testServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import catDTO.CatInfoDTO;
import repository.CatInfoDAO;

@WebServlet("/CatServlet")
public class CatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CatServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CatInfoDAO dao = new CatInfoDAO();
		// 주소 설계
		// http://localhost:8080/todo/cTest?action=delete&cid=1
		String action = request.getParameter("action");
		if ("delete".equals(action)) {
//			String cid = request.getParameter("cid");
//			dao.delete(Integer.parseInt(cid));
//			response.sendRedirect("/todo/cTest");
		} else {
			ArrayList<CatInfoDTO> resultList = dao.select();
			request.setAttribute("list", resultList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("selectTest.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String correctionName = request.getParameter("correctionName");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String favorite = request.getParameter("favorite");
		String hate = request.getParameter("hate");
		CatInfoDAO catInfoDAO  = new CatInfoDAO();
		String action = request.getParameter("action"); 
		int responseCount = 0; 
		if(action.equals("update")) {
			name = request.getParameter("correctionName");
			name = request.getParameter("name");
			name = request.getParameter("gender");
			name = request.getParameter("age");
			name = request.getParameter("favorite");
			name = request.getParameter("hate");
			responseCount  = catInfoDAO.update(correctionName, name, gender, age, favorite, hate);
		} else if(action.equals("insert")) {
			responseCount = catInfoDAO.insert(name, gender, age, favorite, hate);
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("적용된 갯수 확인 : " + responseCount);
	}
}