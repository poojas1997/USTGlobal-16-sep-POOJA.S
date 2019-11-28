package com.ustglobal.jdbcapp;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class DeleteProperty {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null; 
		
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			
			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count + "Row(s) are deleted");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			 
			try {
				
				if(conn !=null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
