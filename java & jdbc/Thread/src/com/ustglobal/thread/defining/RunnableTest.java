package com.ustglobal.thread.defining;

public class RunnableTest {
	
	public static void main(String[] args) {		//class MyRunnable
		
		System.out.println("Main Starts.........");
		
		MyRunnable mr = new MyRunnable();
//		mr.start(); start() is undefined in MyRunnable
		Thread t = new Thread(mr);
		t.start();
		
		for(int i = 0 ; i<3; i++) {
			System.out.println("Main thread");
		}
		
		System.out.println("main ends...............");
	}

}
