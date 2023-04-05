package userService;

import userDAO.UserDAO;
import userDTO.UserDTO;

public class UserService {
	private UserDAO dao;

	public UserService() {
		dao = new UserDAO();
	}

	public UserDTO checkUser(String username, String password) {
		UserDTO userDTO = null;
		if (username.equals("") || password.equals("")) {
			return null;
		} else {
			userDTO = dao.userLogin(username, password);
			return userDTO;
		}
	}
}
