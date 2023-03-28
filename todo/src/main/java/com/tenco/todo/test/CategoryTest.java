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
import com.tenco.todo.utils.DBHelper;

@WebServlet("/cTest")
public class CategoryTest extends HttpServlet {
   private static final long serialVersionUID = 1L;
    
//   @Override
//   public void init() throws ServletException {
      // todo - DB 연결 확인 후 삭제 예정
//      DBHelper dbHelper = new DBHelper();
//      dbHelper.getConnection(); // DB 연결 완료
//   }
   
    public CategoryTest() {
        super();
    }
    
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      CategoryDAO dao = new CategoryDAO();
      String action = request.getParameter("action");
      // 주소 설계
      // http://localhost:8080/todo/cTest?action=delete&cId=1
      if("delete".equals(action)) {
         String cId = request.getParameter("cId");
         dao.delete(Integer.parseInt(cId));
         response.sendRedirect("/todo/cTest");
      } else {
    	  ArrayList<CategoryDTO> list = dao.select();
    	  request.setAttribute("list", list);
          RequestDispatcher dispatcher = request.getRequestDispatcher("test/categoryList.jsp");
          
          dispatcher.forward(request, response);
      }
      // a 링크 <--- get 메서드 호출
//      response.setContentType("text/plain");
//      response.setCharacterEncoding("UTF-8");
//      PrintWriter writer = response.getWriter();
//      writer.print(list.toString());
      // 목적지 list2.jsp -> jstl 사용해서 출력해보기
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      // method - post로 요청시에 동작하는 메서드
      request.setCharacterEncoding("UTF-8");
      String name = request.getParameter("name");
      CategoryDAO categoryDAO = new CategoryDAO();
      int responseCount = 0;
      // 쿼리 파라미터 방식 데이터 받아보기
      String action = request.getParameter("action");
      if(action.equals("update")) {
         String id = request.getParameter("id");
         // id --> String --> int
         responseCount = categoryDAO.update(Integer.parseInt(id), name);
      } else if(action.equals("insert")) {
         responseCount = categoryDAO.insert(name);
      }
      response.setCharacterEncoding("UTF-8");
      response.setContentType("text/plain");
      PrintWriter out = response.getWriter();
      out.print("저장된 개수 확인 : " + responseCount);
   }
   
}