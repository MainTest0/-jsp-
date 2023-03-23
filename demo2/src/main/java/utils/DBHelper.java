package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	private static final String HOST = "localhost";
	private static final String PORT = "3306";
	private static final String DATABASE_NAME = "root";
	private static final String CHARSET = "UTF-8";
	private static final String USERNAME = "user";
	private static final String PASSWORD = "1234";

	private Connection conn;

	public Connection getConnection() {
		if (conn == null) {
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, HOST, PORT, DATABASE_NAME, CHARSET);

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
				System.out.println(">> DB 연결 완료 <<");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public void CloseConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn = null;
	}

}
