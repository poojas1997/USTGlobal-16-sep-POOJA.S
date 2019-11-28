package com.ustglobal.jdbcpofjwh.dto;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class InsertStmt {

		public static void main(String[] args) {		//Refer ExecuteInsertPSQuery1
			
			Connection conn = null;
			Statement stmt = null;
					
			try {
				
				//Step 1 Load the Driver
				Driver driver = new Driver();
				DriverManager.registerDriver(driver);
				
				//Step 2 get the connection
				
				String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
				conn = DriverManager.getConnection(url);
				
				//Step 3 Issue SQL Query
				
				String sql = "insert into Employee_Info values(1,'Vaibhav',10000,'Male')";
				stmt = conn.createStatement();
				int count = stmt.executeUpdate(sql);
				
				//Step 4 Read the Result
				
				System.out.println(count + "Row(s) inserted");
				
			} catch(SQLException e) {
				
				e.printStackTrace();
				
			} finally {
				
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
		}//end of main()
}
