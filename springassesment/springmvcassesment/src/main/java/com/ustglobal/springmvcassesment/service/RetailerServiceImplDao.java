package com.ustglobal.springmvcassesment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springmvcassesment.dao.RetailerDAO;
import com.ustglobal.springmvcassesment.dto.Product;
import com.ustglobal.springmvcassesment.dto.Retailer;
@Service
public class RetailerServiceImplDao implements RetailerService
{
	@Autowired
	private RetailerDAO dao;

	@Override
	public Retailer login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(Retailer rt) {
		return dao.register(rt);
	}

	@Override
	public Product searchProduct(int pid) {
		return dao.searchProduct(pid);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		return dao.updatePassword(id, password);
	}

	@Override
	public double amountPaid(double price) {
		return dao.amountPaid(price);
	}

	@Override
	public boolean retriveOrder(int id) {
		return dao.retriveOrder(id);
	}

	
	
	
}
