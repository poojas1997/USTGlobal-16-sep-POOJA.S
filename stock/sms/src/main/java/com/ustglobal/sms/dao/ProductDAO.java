package com.ustglobal.sms.dao;

import java.util.List;

import com.ustglobal.sms.dto.Products;

public interface ProductDAO {

	public boolean addProduct(Products product);
	public boolean updateProduct(Products product);
	public Products searchProductByName(String name);
	public Products searchById(int product_id);
	public List<Products> searchProductByCategory(String category);
	public boolean searchProductByCompany(String company);
	public List<Products> getAll();
	Products searchProductByName(int product_id);
}
