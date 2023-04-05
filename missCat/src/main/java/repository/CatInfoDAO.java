package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import catDTO.CatInfoDTO;
import utils.DBHelper;

public class CatInfoDAO implements IMisscatRepo {

	private DBHelper dbHelper;
	private Connection conn;

	public CatInfoDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<CatInfoDTO> select() {

		ArrayList<CatInfoDTO> list = new ArrayList<>();

		String strQuery = " SELECT * FROM cat ";
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {
			pStmt = conn.prepareStatement(strQuery);
			rs = pStmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String age = rs.getString("age");
				String favorite = rs.getString("favorite");
				String hate = rs.getString("hate");
				CatInfoDTO dto = new CatInfoDTO(name, gender, age, favorite, hate);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pStmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public int insert(String name, String gender, String age, String favorite, String hate) {
		int resultCount = 0;
		String queryStr = " INSERT INTO cat(name, gender, age, favorite, hate) " + " VALUES (?, ?, ?, ?, ?) ";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(queryStr);
			pStmt.setString(1, name);
			pStmt.setString(2, gender);
			pStmt.setString(3, age);
			pStmt.setString(4, favorite);
			pStmt.setString(5, hate);
			resultCount = pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pStmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCount;
	}

	@Override
	public int update(String correctionName, String name, String gender, String age, String favorite, String hate) {
		int resultRowCount = 0;
		String queryStr = " UPDATE cat " + " SET name = ?, " + " gender = ?, " + " age = ?, " + " favorite = ?, "
				+ " hate = ? " + " WHERE name = ? ";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(queryStr);
			pStmt.setString(1, name);
			pStmt.setString(2, gender);
			pStmt.setString(3, age);
			pStmt.setString(4, favorite);
			pStmt.setString(5, hate);
			pStmt.setString(6, correctionName);
			resultRowCount = pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pStmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultRowCount;
	}

	@Override
	public int delete(String name) {
		int resultRowCount = 0;
		String queryStr = " DELETE FROM cat WHERE name = ? ";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(queryStr);
			pStmt.setString(1, name);
			resultRowCount = pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pStmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return resultRowCount;
	}

}
