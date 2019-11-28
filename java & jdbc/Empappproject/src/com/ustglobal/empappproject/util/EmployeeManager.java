package com.ustglobal.empappproject.util;

import com.ustglobal.empappproject.dao.EmployeeDAO;
import com.ustglobal.empappproject.dao.EmployeeDAOImpl;

public class EmployeeManager {
	
	private EmployeeManager() {}

	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}
