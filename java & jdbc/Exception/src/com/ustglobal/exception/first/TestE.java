package com.ustglobal.exception.first;

public class TestE {
public static void main(String[] args) {
	
	System.out.println("Main Started...");
	
	String s = "Hello";
	int[] a = {10 , 20 , 30};
	int b = 10;
	
	try {
		String s1= s.toUpperCase();
		System.out.println(s1);
		System.out.println(a[2]);
		System.out.println(b/0);
		throw new NullPointerException();
	}
	
	catch(NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e ) {
		e.printStackTrace();	
	}
	
	System.out.println("Main Ended...");
}
}
