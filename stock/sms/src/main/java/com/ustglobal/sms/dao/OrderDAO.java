package com.ustglobal.sms.dao;

import com.ustglobal.sms.dto.Order;
import com.ustglobal.sms.dto.Products;

public interface OrderDAO {

	public double totalPrice(Order order);
}
