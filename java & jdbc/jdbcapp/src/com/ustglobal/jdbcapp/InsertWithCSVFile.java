package com.ustglobal.jdbcapp;

import java.io.*;
import java.sql.*;

public class InsertWithCSVFile {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into Employee_info values(?,?,?,?)";
		
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in); 
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			while(reader.ready()) {
				
				String line = reader.readLine();
				String[] data = line.split(",");
				
				String empid = data[0];
				int id = Integer.parseInt(empid);
				pstmt.setInt(1, id);
				
				String name = data[1];
				pstmt.setString(2, name);
				
				String empsal = data[2];
				int sal = Integer.parseInt(empsal);
				pstmt.setInt(3, sal);
				
				String gender = data[3];
				pstmt.setString(4, gender);
				
				pstmt.addBatch();		//hit the db once & reads the data once
			}
			
			int[] counts =  pstmt.executeBatch();
			System.out.println(counts.length + "Rows inserted");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
