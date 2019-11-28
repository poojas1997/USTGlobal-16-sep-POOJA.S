package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class CustomerA {
	public static void main(String[] args) {
		SortByIdCustomer si = new SortByIdCustomer();
		SortBySalaryCustomer sl = new SortBySalaryCustomer();
		TreeSet<Customer> ts = new TreeSet<Customer>(sl);
		
		Customer c1 = new Customer("Pooja", 105, 10000);
		Customer c2 = new Customer("Puneeth", 108, 15000);
		Customer c3 = new Customer("Halima", 100, 8000);
		Customer c4 = new Customer("Nadeem", 103, 10000);
		Customer c5 = new Customer("Pooja", 105, 10000);

		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		
		System.out.println("==========Iterator=============");
		Iterator<Customer> i = ts.iterator();
		while(i.hasNext()) {
			Customer c = i.next();
			System.out.println("Customer id " +c.id);
			System.out.println("Customer name " +c.name);
			System.out.println("Customer salary " +c.salary);
			System.out.println("____________");
		}
	}
}
