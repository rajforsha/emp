package com.nineleaps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCheck {

	private static Connection conn;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		if (conn != null) {
			return conn;
		} else {
			try {
				conn = DriverManager.getConnection(JdbcConstants.URL, JdbcConstants.USERNAME, JdbcConstants.PASSWORD);
				if (conn != null) {
					System.out.println("connected to mysql!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
