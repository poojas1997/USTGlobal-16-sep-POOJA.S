package com.ustglobal.sms.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.sms.dao.OrderDAO;
import com.ustglobal.sms.dao.ProductDAO;
import com.ustglobal.sms.dto.Order;
import com.ustglobal.sms.dto.Products;
@Service
public class ServiceDAOImpl implements ServiceDAO {

	@Autowired
	private ProductDAO dao;
	@Autowired
	private OrderDAO dao1;
	
	@Override
	public boolean addProduct(Products product) {
		return dao.addProduct(product);
	}
	@Override
	public boolean updateProduct(Products product) {
		return dao.updateProduct(product);
	}
	
	@Override
	public List<Products> searchProductByCategory(String category) {
		return dao.searchProductByCategory(category);
	}
	@Override
	public boolean searchProductByCompany(String company) {
		return dao.searchProductByCompany(company);
	}
	
	public double totalPrice(Order order) {
		return dao1.totalPrice( order);
	}
	@Override
	public Products searchProductByName(String name) {
		return dao.searchProductByName(name);
	}
	@Override
	public List<Products> getAll() {
		return dao.getAll();
	}
	@Override
	public Products searchProductById(int product_id) {
		return dao.searchById(product_id);
	}

}
