package com.ustglobal.lambdaexpressions;

public class TestSayHi {

	public static void main(String[] args) {
		
		SayHiInterface message = () -> "Hi";
		String val =message.say();
		System.out.println(val);
	}
}
