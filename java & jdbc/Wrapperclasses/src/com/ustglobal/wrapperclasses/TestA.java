package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is "+a);
		Integer i  = a;					//Boxing or AutoBoxing.
		System.out.println("i is "+i);
	
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is "+x);
		int y = x; 						//unboxing or Auto unboxing.
		System.out.println("y is "+y);
		
		int value = Integer.parseInt("123");
		System.out.println("value = "+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("result = "+result);
		
		double val = Double.parseDouble("69.36");
		System.out.println("val = "+val);
	}
}