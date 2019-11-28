package com.ustglobal.phonesimulator.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.phonesimulator.dto.PhoneSimulator;

public class PhoneImplDAO implements PhoneDAO {

	public List<PhoneSimulator> getAllContact(){
		
		String url = "jdbc:mysql://localhost:3306/ContactFile?user=root&password=root";
		String sql = "select * from Contact";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			ArrayList<PhoneSimulator> list = new ArrayList<PhoneSimulator>();
			while(rs.next()) {
				PhoneSimulator phone = new PhoneSimulator();
				
				String name = rs.getString("Name");
				phone.setName(name);
				
				int num = rs.getInt("Number");
				phone.setNumber(num);
				
				String grp = rs.getString("Groups");
				phone.setGroups(grp);
				
				list.add(phone);
			}
			return list;
			
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
			} catch(Exception e) {
				e.printStackTrace();
			}
		}//end of try-catch-finally
	}//end of getAllContact()
	
	
	public PhoneSimulator searchContact(String Name) {
		
		String url = "jdbc:mysql://localhost:3306/ContactFile?user=root&password=root";
		String sql = "select * from Contact where Name = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, Name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
			PhoneSimulator phone =  new PhoneSimulator();
			phone.setName(rs.getString("Name"));
			phone.setNumber(rs.getInt("Number"));
			phone.setGroups(rs.getString("Groups"));
			
			return phone;
			} else {
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
		}//end of try-catch-finally
	}//end of searchContact()
	
	
	public int insertContact(PhoneSimulator p) {
		
		String url = "jdbc:mysql://localhost:3306/ContactFile?user=root&password=root";
		String sql = "insert into Contact values(?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
					String name =p.getName();
					long num =p.getNumber();
					String group=p.getGroups();
							
					Class.forName("com.mysql.jdbc.Driver");
					conn=DriverManager.getConnection(url);
					 pstmt=conn.prepareStatement(sql);
			         
					pstmt.setString(1, name);
					pstmt.setLong(2, num);
					pstmt.setString(3, group);
					int count = pstmt.executeUpdate();
					return count;
					
					
				}catch(Exception e) {
					e.printStackTrace();
					return 0;
				}finally {
					try {
					if(conn!=null) conn.close();
					if(pstmt!=null)  pstmt.close();
					
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
						
	}//end of addContact

	public int deleteContact(String Name) {
		String url = "jdbc:mysql://localhost:3306/ContactFile?user=root&password=root";
		String sql = "delete from Contact where Name = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, Name);
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count+ " Contact deleted");

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
		}//end of try-catch-finally
	}//end of deleteContact()
	
	public int editContact( String Name, int Number, String Groups) {
		
		String url = "jdbc:mysql://localhost:3306/ContactFile?user=root&password=root";
		String sql = "update Contact set Number = ?, Groups=? where Name = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(3, Name);
			pstmt.setInt(1,Number);
			pstmt.setString(2, Groups);
			int count = pstmt.executeUpdate();
			
			System.out.println(count + " contact edited");
			return count;
			
		}catch(Exception e) {
			e.printStackTrace();
			return (Integer) null;
		}finally {
			
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
		}//enf of try-catch-finally
	}//end of editContact
}//end of PhoneImplDAO
