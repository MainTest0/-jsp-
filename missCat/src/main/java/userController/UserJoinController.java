package userController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userDAO.UserDAO;
import userDTO.UserDTO;
import userService.UserService;

@WebServlet("/UserJoinController")
public class UserJoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserJoinController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType(" text/html; charset=UTF-8 ");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nowId = request.getParameter("nowId");
		String action = request.getParameter("action");
		PrintWriter out = response.getWriter();
		UserDAO dao = new UserDAO();

		if (action.equals("saveUser")) {
			dao.saveUser(new UserDTO(id, pw));
			out.print("<script>alert('회원 가입 완료');location.href='mainScreen.jsp'; </script>");
		} else if (action.equals("delete")) {
			dao.deleteUser(id);
			out.print("<script>alert('회원 탈퇴 완료');location.href='logout.jsp'; </script>");
		} else if (action.equals("update")) {
			dao.updateUser(nowId, id, pw);
			out.print("<script>alert('정보 수정 완료');location.href='mainScreen.jsp'; </script>");
		}

	}

}
