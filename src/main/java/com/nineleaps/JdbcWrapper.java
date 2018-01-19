package com.nineleaps;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcWrapper {

	private Connection conn;
	private Statement stmt;

	public JdbcWrapper() {
		conn = new ConnectionCheck().getConnection();
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Statement getStmt() {
		return stmt;
	}

	public Connection getConn() {
		return conn;
	}

	public Boolean insertIntoDb(String name, String designation, String manager) {
		try {
			getStmt().execute("Insert into Employee values('" + name + "','" + designation + "','" + manager + "');");
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Employee getEmployeeByName(String name) {
		try {
			String query = "select * from Employee where name=" + "'" + name + "'";
			System.out.println("query passed is " + query);
			return mapper(getStmt().executeQuery(query));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public Employee mapper(ResultSet result) {

		Employee emp = new Employee();
		try {

			while (result.next()) {
				String name = result.getString("name");
				String designation = result.getString("designation");
				String manager = result.getString("manager");
				emp.setDesignation(designation);
				emp.setManager(manager);
				emp.setName(name);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
}
