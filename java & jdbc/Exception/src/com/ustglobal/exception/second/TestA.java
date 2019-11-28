package com.ustglobal.exception.second;

public class TestA {

	public static void main(String[] args)  {
		
		System.out.println("Main started....");
		
		try {
			Thread.sleep(3000);
			System.out.println("inside try");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Exception caught");
		}
		
		System.out.println("Main Ended....");
	}
}
