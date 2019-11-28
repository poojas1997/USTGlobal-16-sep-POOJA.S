package com.ustglobal.jdbcpofjwh.dto;

import java.sql.*;

public class SelectStatement {

		public static void main(String[] args) {

			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;

			try {
	
				
				Class.forName("com.mysql.jdbc.Driver");
				
				
				String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
				
				 conn = DriverManager.getConnection(url);	

				String sql = "select * from Employee_Info";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {

					int id = rs.getInt("id"); 
					String name = rs.getString("name");	
					int sal = rs.getInt("salary");	
					String gender = rs.getString("gender"); 

					System.out.println("Id : " +id);
					System.out.println("Name : " +name);
					System.out.println("Salary : " +sal);
					System.out.println("Gender : " +gender);
					System.out.println("******************");
				}
				
			} catch(Exception e) {

				e.printStackTrace();

			} finally{
				
				try {
					if(conn != null) {
						conn.close();
					}
					if(stmt != null) {
						stmt.close();
					}
					if(rs != null) {
						rs.close();
					}
				} catch(SQLException e) {

					e.printStackTrace();

				}//end of try-catch block
			}//end of finally block


		}//end of main()

}
