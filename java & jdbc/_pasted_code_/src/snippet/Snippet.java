package snippet;

public class Snippet {
	Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
	
			try {
	
				// Step 1 Loading Driver
	//			Driver driver = new Driver();		//class	
	//			DriverManager.registerDriver(driver);	
				
				Class.forName("com.mysql.jdbc.Driver");
				
				// Step 2 get the connection
				String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
							//protocol:sub-protocol://sub-name
				
				 conn = DriverManager.getConnection(url);	//example for abstraction
				
	//			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
	//			conn = DriverManager.getConnection(url, "root", "root");
				 
				//  Step 3 Issue SQL Query
	
				String sql = "select * from Employee_Info";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				// Step 4 Read the Result
				while(rs.next()) {
	
					int id = rs.getInt("id");  //int id = rs.getInt(1);
					String name = rs.getString("name");	//String name = rs.getString(2);
					int sal = rs.getInt("salary");	//int sal = rs.getInt(3);
					String gender = rs.getString("gender"); //String gender = rs.getString(4);
	
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
				} catch(SQLException e) {
	
					e.printStackTrace();
	
				}//end of try-catch block
			}//end of finally block
	
	
}

