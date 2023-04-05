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

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.repository.CategoryDAO;


@WebServlet("/cTest")
public class CategoryTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		// todo - DB 연결 확인 후 삭제 예정 
		// DbHelper dbHelper = new DbHelper();
		// dbHelper.getConnection(); // DB 연결 완료 
	}
	
    public CategoryTest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryDAO dao = new CategoryDAO();
		// 주소 설계 
		// http://localhost:8080/todo/cTest?action=delete&cid=1
		String action = request.getParameter("action");
		if("delete".equals(action)) {
			String cid = request.getParameter("cid");
			dao.delete(Integer.parseInt(cid));
			response.sendRedirect("/todo/cTest");
		} else {
			ArrayList<CategoryDTO> resultList = dao.select();
			request.setAttribute("list", resultList);  // request 객체에 값 셋팅
			RequestDispatcher dispatcher = request.getRequestDispatcher("categoryList.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		CategoryDAO categoryDAO = new CategoryDAO();
		String action = request.getParameter("action"); 
		int responseCount = 0; 
		if(action.equals("update")) {
			String id = request.getParameter("id");
			responseCount  = categoryDAO.update(Integer.parseInt(id), name);
		} else if(action.equals("insert")) {
			responseCount = categoryDAO.insert(name);
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("적용된 갯수 확인 : " + responseCount);
	}

}