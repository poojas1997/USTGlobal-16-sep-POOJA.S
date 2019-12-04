package com.ustglobal.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springboot.dao.EmployeeDAO;
import com.ustglobal.springboot.dto.EmployeeBean;
//@Service
public class EmployeeServiceImpl implements EmployeeService {
	
//	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public boolean addEmployee(EmployeeBean bean) {
		if(bean.getName()==null || bean.getPassword()==null) {
			return false;
		}else if (bean.getPassword().length() < 8) {
			return false;
		}
		return dao.addEmployee(bean);
	}//end of addEmployee

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		if(bean.getName()==null || bean.getPassword()==null) {
			return false;
		}else if (bean.getPassword().length() < 8) {
			return false;
		}
		return dao.modifyEmployee(bean);
	}//end of modifyEmployee

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}//end of deleteEmployee

	@Override
	public EmployeeBean getEmployee(int id) {
		return dao.getEmployee(id);
	}//end of getEmployee

	@Override
	public List<EmployeeBean> getAllEmployee() {
		return dao.getAllEmployee();
	}//end of getAllEmployee

	
}
