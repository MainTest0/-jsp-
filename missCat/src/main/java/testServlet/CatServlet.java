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
	CatInfoDAO dao;

	public CatServlet() {
		super();
		dao = new CatInfoDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		if ("select".equals(action)) {
			ArrayList<CatInfoDTO> resultList = dao.select();
			request.setAttribute("list", resultList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("cat/selectTest.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		String correctionName = request.getParameter("correctionName");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String favorite = request.getParameter("favorite");
		String hate = request.getParameter("hate");
		String action = request.getParameter("action");
		PrintWriter out = response.getWriter();

		if (action.equals("update")) {
			dao.update(correctionName, name, gender, age, favorite, hate);
			out.print("<script>alert('수정 완료');location.href='mainScreen.jsp'; </script>");
		} else if (action.equals("insert")) {
			dao.insert(name, gender, age, favorite, hate);
			out.print("<script>alert('등록 완료');location.href='mainScreen.jsp'; </script>");
		} else if (action.equals("delete")) {
			dao.delete(name);
			out.print("<script>alert('삭제 완료');location.href='mainScreen.jsp'; </script>");
		}
	}
}