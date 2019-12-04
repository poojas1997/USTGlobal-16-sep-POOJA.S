package com.ustglobal.springboot.dao;//we won't use dao package

import java.util.List;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeDAO {

	public boolean addEmployee(EmployeeBean bean);
	public boolean modifyEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	public List<EmployeeBean> getAllEmployee();
		
}
