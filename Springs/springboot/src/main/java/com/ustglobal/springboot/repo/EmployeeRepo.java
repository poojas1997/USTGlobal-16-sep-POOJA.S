package com.ustglobal.springboot.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeRepo extends JpaRepository<EmployeeBean, Integer>{

	public EmployeeBean findByName(String name);//it automatically create jpql query & search for that.
	
	public void deleteByName(String name);
	
	@Transactional
	@Modifying
	@Query("update EmployeeBean set name=:name , password=:password ,gender=:gender,doj=:doj where id=:id")
	public void update(String name,String password, Date doj, String gender,int id);

}
