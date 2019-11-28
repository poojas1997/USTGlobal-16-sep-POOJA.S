package com.ustglobal.exception.first;

public class TestB {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		int c = 0;
		
		System.out.println("Main Started....");
		
		try {
			b = a/5;
			c = 55/0;
			
			System.out.println(b);
			System.out.println(c);
			System.out.println("Hello");
			System.out.println("Happy Deepavali");
		}
		catch(ArithmeticException ae) {
			System.out.println("Number is divided by Zero..");
		}
	
		
		System.out.println("Main Ended....");
	}
}
