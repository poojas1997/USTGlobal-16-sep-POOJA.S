package com.ustglobal.springmvcassesment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springmvcassesment.dto.Product;
@Repository
public class ProductImplDAO implements ProductDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean insertProduct(Product product) {
		String jpql = "from Retailer ";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Product> query = manager.createQuery(jpql, Product.class);

		try {
			List<Product> product1 = query.getResultList();
			for(Product pro: product1) {
				System.out.println(pro);
			}
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}

	}
}



