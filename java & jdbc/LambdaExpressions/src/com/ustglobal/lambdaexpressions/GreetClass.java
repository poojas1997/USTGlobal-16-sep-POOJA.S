package com.ustglobal.lambdaexpressions;

public class GreetClass {

	public static void main(String[] args) {
		
		GreetMessage greets = (message) -> {
			System.out.println("Hello");
			System.out.println( "msg = " +message);
			return message;
		};
		
		String msg = greets.greet("Welcome");
	}
}
