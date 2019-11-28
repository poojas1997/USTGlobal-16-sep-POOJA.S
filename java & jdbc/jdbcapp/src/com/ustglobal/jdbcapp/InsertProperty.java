package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class InsertProperty {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		FileReader reader = null;
		
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			
			String sql = prop.getProperty("insert-query");
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//Step 4 Read the Result
			
			System.out.println(count + "Row(s) inserted");

			
		}catch(Exception e) {
			e.printStackTrace();
		}  finally {
			
			try {
				
				if (conn != null){
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}