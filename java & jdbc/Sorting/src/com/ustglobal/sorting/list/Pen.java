package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>{

	double price;
	String brand;
	String color;
	
	public Pen(double price, String brand, String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
	}

	@Override
	public int compareTo(Pen p) {
//		Double q = this.price;
//		Double r = p.price;
//		return q.compareTo(r);
		
		String s = this.brand;
		String a = p.brand;
		return s.compareToIgnoreCase(a);
	}
	
	
	
	
}
