package com.ustglobal.lambdaexpressions;

public class TestFact {

	public static void main(String[] args) {
		
		Factorial fi = (x) -> {
			int fact = 1;
			for(int i = 2 ; i<=x; i++) {
				fact = fact*i;
			}
			return fact;
		};
		
		int factorial = fi.fact(5);
		System.out.println(factorial);
	}

	
}
