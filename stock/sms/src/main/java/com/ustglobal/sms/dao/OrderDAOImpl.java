package com.ustglobal.sms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.sms.dto.Order;
import com.ustglobal.sms.dto.Products;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public double totalPrice(Order order) {
		String jpql = "from Products where name=:name";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Products> query = manager.createQuery(jpql,Products.class);
		EntityTransaction transaction = manager.getTransaction();
		try {
		Products product1 = query.getSingleResult();
		
		transaction.begin();
		double price = product1.getPrice() * product1.getQuantity() ;
		order.setTotal_price(price);
		transaction.commit();
		return price;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;

		}

	}

	

	

}
