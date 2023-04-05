package userDAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import userDTO.UserDTO;
import utils.DBHelper;

public class UserDAO implements IUserDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public int saveUser(UserDTO user) {
		String query = " INSERT INTO user(user_id, user_pw) " + " VALUES (?,?) ";

		int resultRow = 0;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			resultRow = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("saveUser 함수에서 오류 발생");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public UserDTO userLogin(String username, String password) {
		UserDTO resultUser = null;
		resultUser = new UserDTO();
		String query = "  SELECT * FROM user WHERE user_id = ? AND user_pw = ?  ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				resultUser.setUserName(rs.getString("user_id"));
				resultUser.setPassword(rs.getString("user_pw"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultUser;
	}

	@Override
	public int deleteUser(String username) {
		int resultRow = 0;
		String query = "  DELETE FROM user WHERE user_id = ?  ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			resultRow = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultRow;
	}

	@Override
	public int updateUser(String nowId, String username, String password) {
		int resultRow = 0;
		String query = "  UPDATE user  SET user_id = ?, user_pw = ?  WHERE user_id = ?  ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setString(3, nowId);
			resultRow = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultRow;
	}

} // end of class
