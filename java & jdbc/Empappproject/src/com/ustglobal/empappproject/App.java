package com.ustglobal.empappproject;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empappproject.dao.EmployeeDAO;
import com.ustglobal.empappproject.dao.EmployeeDAOImpl;
import com.ustglobal.empappproject.dto.EmployeeBean;
import com.ustglobal.empappproject.util.EmployeeManager;


public class App {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		
		switch(ch) {
		
		case 1:
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			
			for(EmployeeBean bean : result) {
				System.out.println("Id: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("Gender: "+bean.getGender());
				System.out.println("Salary: "+bean.getSalary());
				System.out.println("*****************************");
			}
			
			break;
			
		case 2:
//			EmployeeDAO dao1 = EmployeeManager.getEmployeeDAO();
//			List<EmployeeBean> result1 = dao1.insertEmployeeData();
//			
			break;
			
		case 3:
			
			int id = scn.nextInt();
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			
			break;
			
		case 4:
			
			int id1 = scn.nextInt();
			EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
			dao3.deleteEmployeeData(id1);
			break;
			
		case 5:
			
			int id11 = scn.nextInt();
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			dao5.searchEmployeeData(id11);
			EmployeeBean bean = dao5.searchEmployeeData(id11);
			if(bean!=null) {
				
				System.out.println("Id: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("Gender: "+bean.getGender());
				System.out.println("Salary: "+bean.getSalary());
				System.out.println("******************");
				
			} else {
				System.out.println("No data found");
			}
			break;
		}//end of switch
	}//end of main()
}//end of APp
