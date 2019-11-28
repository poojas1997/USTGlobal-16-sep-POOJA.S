package com.ustglobal.typecasting.reference;

public class TestA {

	public static void main(String[] args) {
		Pen p = new Marker();				//upcasting method
		System.out.println(p.cost);
		p.write();
//		System.out.println(p.size); cannot call this method  bcz upcasted method has only parent property 
//		p.color():
		
		Marker m = (Marker)p;				//Downcasting
		System.out.println(m.size);
		m.color();
		m.write();
		System.out.println(m.cost);
	}
}
