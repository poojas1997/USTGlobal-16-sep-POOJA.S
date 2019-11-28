package com.ustglobal.jdbcapp;
import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "delete from Employee_info where id = 7";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count + "Row(s) are deleted");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
