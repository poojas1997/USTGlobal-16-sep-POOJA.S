package com.ustglobal.lambdaexpressions;

public class TestMultiply {

	public static void main(String[] args) {
		
		MultiplyInterface multi = (a , b) -> a*b;
		int Product = multi.multiply(20 , 10);
		System.out.println("Product = " +Product);
	}
}
