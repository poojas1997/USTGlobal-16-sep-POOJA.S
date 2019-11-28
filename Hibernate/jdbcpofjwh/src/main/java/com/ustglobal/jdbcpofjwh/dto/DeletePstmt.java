package com.ustglobal.jdbcpofjwh.dto;

import java.sql.*;

public class DeletePstmt {

		public static void main(String[] args) {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
				conn = DriverManager.getConnection(url);
				
				String sql = "delete from Employee_info where id = ?";
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
