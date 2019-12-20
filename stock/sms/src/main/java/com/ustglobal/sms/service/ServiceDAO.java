package com.ustglobal.sms.service;

import java.util.List;

import com.ustglobal.sms.dto.Order;
import com.ustglobal.sms.dto.Products;

public interface ServiceDAO {

	public boolean addProduct(Products product);
	public boolean updateProduct(Products product);
	public Products searchProductByName(String name);
	public Products searchProductById(int product_id);
	public List<Products> searchProductByCategory(String category);
	public boolean searchProductByCompany(String company);
	public List<Products> getAll();
	double totalPrice(Order order);
}
