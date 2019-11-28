package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{

	double price;
	int ram;
	String name;
	
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	
	@Override
	public int compareTo(Laptop L) {
//		Integer r = this.ram;
//		Integer s = L.ram;
//		return r.compareTo(s);
		
//		Double p = this.price;
//		Double q = L.price;
//		return p.compareTo(q);
		
		String a = this.name;
		String b = L.name;
		return a.compareToIgnoreCase(b);
		
	}
	
}
