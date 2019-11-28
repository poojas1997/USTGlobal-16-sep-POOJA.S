package com.ustglobal.empappproject.dao;

import java.sql.*;

import java.util.*;


import com.ustglobal.empappproject.dto.EmployeeBean;

//public class EmployeeDAOImpl implements EmployeeDAO {
public class EmployeeDAOImpl implements EmployeeDAO{

	public List<EmployeeBean> getAllEmployeeData() {

		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from Employee_info";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();

			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				
				int id = rs.getInt("id");
				bean.setId(id);

				String name = rs.getString("name");		
				bean.setName(name);

				int sal = rs.getInt("salary");
				bean.setSalary(sal);

				String gender = rs.getString("gender");
				bean.setGender(gender);

				result.add(bean);
			}
			return result;

		} catch(Exception e) {

			e.printStackTrace();
			return null;

		} finally {
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

			}
		}//end of try-catch-finally

	}//end of getAllEmployeeData
	
//	public int insertEmployeeData(EmployeeBean bean) {
//
//		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//		String sql = "insert into Employee_info values(?,?,?,?)";
//
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		
//		int count = (Integer) null;
//
//		try {
//
//			Class.forName("com.mysql.jdbc.Driver");
//			conn = DriverManager.getConnection(url);
//			pstmt = conn.prepareStatement(sql);
//
//			pstmt.setObject(1, bean);
//			
//			 count = pstmt.executeUpdate();
//			
//			 return count;
//			
//			
//		} catch(Exception e) {
//
//			e.printStackTrace();
//			
//
//		} finally {
//			try {
//
//				if(conn != null) {
//					conn.close();
//				}
//				if(pstmt != null) {
//					pstmt.close();
//				}
//				
//
//			} catch(Exception e) {
//
//				e.printStackTrace();
//			}
//		}
//		return count;
//		
//		
//	}//end of searchEmployeeData
	
		public  int updateEmployeeData(EmployeeBean bean) {
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			String sql = "update frpm Employee_info set name = ? , salary = ?, gender=? where id=?";
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url);
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setObject(1, bean);
				
				int count = pstmt.executeUpdate();
				return count;
			} catch(Exception e) {
				e.printStackTrace();
				return (Integer) null;

			} finally {
				try {

					if(conn != null) {
						conn.close();
					}
					if(pstmt != null) {
						pstmt.close();
					}
					
				} catch(Exception e) {

					e.printStackTrace();
				}
			}
			
			
		}//end of updateEmployeeData

	
	
	public int deleteEmployeeData(int id) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "delete from Employee_info where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count +"Row(s) are deleted");

			return count;
			
		} catch(Exception e) {
			e.printStackTrace();
			return (Integer) null;
		}
			
	}//end of deleteEmpoyeeData
	
	
	public EmployeeBean searchEmployeeData(int id) {

		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from Employee_info where id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if(rs.next()) {

				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("salary"));
				bean.setGender(rs.getString("gender"));

				return bean;
			}else {
				return null;
			}
		} catch(Exception e) {

			e.printStackTrace();
			return null;

		} finally {
			try {

				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(rs != null) {
					rs.close();
				}

			} catch(Exception e) {

				e.printStackTrace();
			}
		}
	}//end of searchEmployeeData
	


}
