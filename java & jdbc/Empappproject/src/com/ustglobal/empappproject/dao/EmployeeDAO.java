package com.ustglobal.empappproject.dao;

import java.util.ArrayList;
import java.util.List;

import com.ustglobal.empappproject.dto.EmployeeBean;

public interface EmployeeDAO {
	
	public List<EmployeeBean> getAllEmployeeData();
	public EmployeeBean searchEmployeeData(int id);
//	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);

}
