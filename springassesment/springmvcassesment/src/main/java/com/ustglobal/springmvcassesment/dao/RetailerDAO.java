package com.ustglobal.springmvcassesment.dao;

import com.ustglobal.springmvcassesment.dto.Product;
import com.ustglobal.springmvcassesment.dto.Retailer;

public interface RetailerDAO {

	
	public Retailer login(int id, String password);
	public int register(Retailer rt);
	public Product searchProduct(int pid);
	public boolean updatePassword(int id, String password);
	public double amountPaid(double price);
	public boolean retriveOrder(int id);
}//end of RetailerDAO
