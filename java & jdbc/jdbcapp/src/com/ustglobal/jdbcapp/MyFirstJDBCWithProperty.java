package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;


public class MyFirstJDBCWithProperty {

	public void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;

		try {

			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			// Step 1 Loading Driver

			Class.forName(prop.getProperty("driver-class-name"));

			// Step 2 get the connection

			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);

			//  Step 3 Issue SQL Query

			String sql = prop.getProperty("select-query");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// Step 4 Read the Result
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

			//Step 5 Close all JDBC Objects

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
				if(reader != null) {
					reader.close();
				}
			} catch(Exception e) {

				e.printStackTrace();

			}//end of try-catch block
		}//end of finally block


	}//end of main()

}

