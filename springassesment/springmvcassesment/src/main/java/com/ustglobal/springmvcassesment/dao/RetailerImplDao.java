package com.ustglobal.springmvcassesment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springmvcassesment.dto.Product;
import com.ustglobal.springmvcassesment.dto.Retailer;

@Repository
public class RetailerImplDao implements RetailerDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public Retailer login(int id, String password) {
		String jpql = "from Retailer where id= :id and password = :pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Retailer> query = manager.createQuery(jpql, Retailer.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
		Retailer bean = query.getSingleResult();	
		return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}//end of login

	@Override
	public int register(Retailer bean) {
		
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
	public Product searchProduct(int pid) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Product.class, pid);
		
	}//end of searchProduct

	@Override
	public boolean updatePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Retailer bean = manager.find(Retailer.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public double amountPaid(double price) {
		return 0;
	}

	@Override
	public boolean retriveOrder(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
}//end of RetailerImplDao
