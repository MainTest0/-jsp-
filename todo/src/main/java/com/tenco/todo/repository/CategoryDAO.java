package com.tenco.todo.repository;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.utils.DbHelper;

public class CategoryDAO implements ICategoryRepo {

	private DbHelper dbHelper;
	private Connection conn;

	public CategoryDAO() {
		dbHelper = new DbHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<CategoryDTO> select() {

		ArrayList<CategoryDTO> list = new ArrayList<>();

		String strQuery = " SELECT * FROM category ";
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {
			pStmt = conn.prepareStatement(strQuery);
			rs = pStmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				CategoryDTO dto = new CategoryDTO(id, name);
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
	public int insert(String name) {
		int resultCount = 0;
		String queryStr = " INSERT INTO category(name) VALUES( ? ) ";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(queryStr);
			pStmt.setString(1, name);
			resultCount = pStmt.executeUpdate();
		} catch (SQLException e) {
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
	public int update(int id, String name) {
		
		int resultRowCount = 0;
		String queryStr = " UPDATE category SET name = ? WHERE id = ? ";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(queryStr);
			pStmt.setString(1, name);
			pStmt.setInt(2, id);
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
	public int delete(int id) {
		
		int resultRowCount = 0; 
		String queryStr = " DELETE FROM category WHERE id = ?  ";
		PreparedStatement pStmt = null; 
		try {
			pStmt = conn.prepareStatement(queryStr);
			pStmt.setInt(1, id);
			pStmt.executeUpdate();
			
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