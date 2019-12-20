package com.ustglobal.sms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.sms.dto.Products;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addProduct(Products product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}// end of addProduct
	
	@Override
	public boolean updateProduct(Products product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Products product1 = manager.find(Products.class, product.getProduct_id());
		product1.setName(product.getName());
		product1.setCategory(product.getCategory());
		product1.setCompany(product.getCompany());
		product1.setPrice(product.getPrice());
		product1.setQuantity(product.getQuantity());
		transaction.commit();
		return true;
	}// end of updateProduct
	
	@Override
	public Products searchProductByName(int product_id) {
			
			return null;
		
	}// end of searchProductByName
	
	@Override
	public List<Products> searchProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where category=:category";
		TypedQuery<Products> query = manager.createQuery(jpql, Products.class);
		query.setParameter("category", category);
		try {
		Products product = (Products) query.getResultList();
		return (List<Products>) product;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}// end of searchProductByCategory
	
	@Override
	public boolean searchProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		manager.find(Products.class, company);
		return true;		
	}// end of searchProductByCompany

	@Override
	public Products searchProductByName(String name) {
		String jpql = "from Products where name=:name";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Products> query = manager.createQuery(jpql, Products.class);
		query.setParameter("name", name);
		try {
			Products product = query.getSingleResult();
			return product;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Products> getAll() {
		String jpql = "from Products";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Products> query = manager.createQuery(jpql, Products.class);
		List<Products> product = query.getResultList();
		return product;	
	}

	@Override
	public Products searchById(int product_id) {
		EntityManager manager = factory.createEntityManager();
		Products product = manager.find(Products.class, product_id);
		return product;
	}

}
