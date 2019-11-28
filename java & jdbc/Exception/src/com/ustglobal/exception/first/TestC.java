package com.ustglobal.exception.first;

public class TestC {
	public static void main(String[] args) {
		
		System.out.println("Main Started...");
		
		int[] a = {10, 20 , 30};
		int b = 10;
		
		try {
			System.out.println(a[4]);
			System.out.println(b/5);
		}
		
		catch(ArithmeticException ae) {
			
			System.out.println("Number is divided by Zero");
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			
			System.out.println("Index is not present");
		}
		
		System.out.println("Main Ended...");
	}
}
