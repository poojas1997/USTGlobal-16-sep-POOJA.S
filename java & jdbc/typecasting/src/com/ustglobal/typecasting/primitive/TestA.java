package com.ustglobal.typecasting.primitive;

public class TestA {
	public static void main(String[] args) {
		byte a = 10;
		int b = a;		//implicit casting
		System.out.println("b = " +b);
		
		int p = 20;
		double q = p;
		System.out.println("q = "+q);
		
		System.out.println("=========");
		
		double x = 67.61;
		int y = (int) x;	//explicit casting
		System.out.println("y = " +y);

		byte z = (byte) y;
		System.out.println("z = " +z);

		char u = (char) x;
		System.out.println("u = " +u);


	}

}
