package com.tenco.todo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.utils.DBHelper;

public class TodoDAO implements ITodoRepo {
	private DBHelper dbHelper;
	private Connection conn;

	public TodoDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();

	}

	@Override
	public ArrayList<TodoDTO> select() {

		ArrayList<TodoDTO> list = new ArrayList<>();

		String strQuery = " SELECT * FROM TodoList ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(strQuery);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				int priority = rs.getInt("priority");
				int completed = rs.getInt("completed");
				String createdAt = rs.getString("createdAt");
				
				TodoDTO dto = new TodoDTO(id, title, description, priority, completed, createdAt);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public int insert(int id, String title, String description) {
		int resultCount = 0;
		String queryStr = " INSERT INTO TodoList(id, title, description) "
				+ "VALUES ?, ?, ? ";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, id);
			pstmt.setString(2, title);
			pstmt.setString(3, description);
			resultCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCount;
	}

	@Override
	public int update(int id, String name) {
		int resultRowCount = 0;
		String queryStr = " UPDATE TodoList SET name = ? WHERE id = ? ";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			resultRowCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return resultRowCount;
	}

	@Override
	public int delete(int id) {
		int resultRowCount = 0;
		String queryStr = " DELETE FROM TodoList WHERE id = ? ";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, id);
			resultRowCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultRowCount;
	}

}