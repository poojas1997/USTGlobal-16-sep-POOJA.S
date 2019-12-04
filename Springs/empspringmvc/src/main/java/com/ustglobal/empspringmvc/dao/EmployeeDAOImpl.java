package com.ustglobal.empspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ustglobal.empspringmvc.dto.EmployeeBean;

//@Component  since it is dao layer use @Repository
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

//	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee-unit");
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public EmployeeBean login(int id, String password) {
		String jpql = "from EmployeeBean where id = :id and password = :pass";
		EntityManager manager = factory.createEntityManager();
//		Query query = manager.createQuery(jpql);
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql, EmployeeBean.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
//		EmployeeBean bean= (EmployeeBean) query.getSingleResult();   [if u use line 20 downcast it]
		EmployeeBean bean = query.getSingleResult();	
		return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}//end of login

	@Override
	public int register(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		manager.persist(bean);
		transaction.commit();
		return bean.getId();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return -1;
		}
	}//end of register

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		manager.remove(bean);
		transaction.commit();
		return true;
	}//end of deleteEmployee

	@Override
	public EmployeeBean searchEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(EmployeeBean.class, id);
	}//end of searchEmployee

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean employeeBean = manager.find(EmployeeBean.class, bean.getId());
		employeeBean.setName(bean.getName());
		employeeBean.setGender(bean.getGender());
		employeeBean.setPassword(bean.getPassword());
		employeeBean.setDoj(bean.getDoj());
		transaction.commit();
		return true;
		
	}//end of updateEmployee

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}//end of changePassword

	
	
}//end of EmployeeDAOImpl
