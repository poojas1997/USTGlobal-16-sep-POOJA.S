package com.ustglobal.exception.customizeduncheckexception;

public class TestAge {

	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		
		Validator v = new Validator();
//		try {
		v.verify(12);
//		}
//		catch(InvalidAgeException ie) {
//			System.out.println("Exception occured");
//		}
		System.out.println("Main Ended");
	}
}
