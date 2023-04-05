package userDAO;

import userDTO.UserDTO;

public interface IUserDAO {

	int saveUser(UserDTO user);

	UserDTO userLogin(String username, String password);

	int deleteUser(String username);

	int updateUser(String nowId, String username, String password);

}
