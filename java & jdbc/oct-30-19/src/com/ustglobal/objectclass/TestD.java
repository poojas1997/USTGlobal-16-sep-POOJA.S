package com.ustglobal.objectclass;

public class TestD {
	
	public static void main(String[] args) {
		
		Car c = new Car(1000000 , " Benz" , "black");
		int h = c.hashCode();
		System.out.println("cost of benz = " +h);
		System.out.println(c);
		
		System.out.println("===========================");
		
		Car c1 = new Car(500000 , " Innova" , "Grey");
		int h1 = c1.hashCode();
		System.out.println("cost of Innova = " +h1);
		System.out.println(c1);
		
		
	System.out.println("===========================");
		
		Car c2 = new Car(700000 , " Honda WR V" , "Blue");
		int h2 = c2.hashCode();
		System.out.println("cost of Honda WR V = " +h2);
		System.out.println(c2);
	}

}
