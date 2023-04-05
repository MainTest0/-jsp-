package userController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import userDAO.UserDAO;
import userDTO.UserDTO;
import userService.UserService;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService userService = new UserService();
		UserDTO dto = new UserDTO();

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		UserDTO user = userService.checkUser(id, pw);

		UserDAO dao = new UserDAO();

		if (user != null) {
			// 성공한 로직
			user = userService.checkUser(id, pw);
			if (request.getParameter("id") != null || request.getParameter("pw") != null) {
				HttpSession session = request.getSession();
				if (user.getUserName() != null && user.getPassword() != null) {
					session.setAttribute("id", user.getUserName());
					session.setAttribute("pw", user.getPassword());
					RequestDispatcher dispatcher = request.getRequestDispatcher("/user/checkLogin.jsp");
					dispatcher.forward(request, response);
				} else {
					response.sendRedirect("/user/checkLogin.jsp");
				}
			} else {
				response.sendRedirect("/user/checkLogin.jsp");
			}
		} else {
			// 실패한 로직
			response.sendRedirect("/user/checkLogin.jsp");
		}
	}
}