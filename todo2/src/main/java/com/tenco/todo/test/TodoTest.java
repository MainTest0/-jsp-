package com.tenco.todo.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.repository.CategoryDAO;
import com.tenco.todo.repository.TodoDAO;

@WebServlet("/TodoTest")
public class TodoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TodoTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		TodoDAO dao = new TodoDAO();
		String action = request.getParameter("action");

		if ("delete".equals(action)) {
			String cId = request.getParameter("cId");
			dao.delete(Integer.parseInt(cId));
			response.sendRedirect("/todo2/TodoTest");
		} else {
			ArrayList<TodoDTO> list = dao.select();
			request.setAttribute("list", list);
			RequestDispatcher dispatcher = request.getRequestDispatcher("test/categoryList.jsp");

			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		TodoDAO dao = new TodoDAO();
		int responseCount = 0;
		// 쿼리 파라미터 방식 데이터 받아보기
		String action = request.getParameter("action");
		if (action.equals("update")) {
			String id = request.getParameter("id");

			responseCount = dao.update(Integer.parseInt(id), name);
		} // else if(action.equals("insert")) {
//	         responseCount = dao.insert(id, title, );
//	      }
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("저장된 개수 확인 : " + responseCount);

	}

}
