package com.ustglobal.thread.defining;

public class ThreadTest {
	
	public static void main(String[] args) {				//class MyThread
		
		System.out.println("Main Starts.........");
		
		MyThread t1 = new MyThread();
		
//		t1.run();
		/*		
		 * Don't call run().it behves as normal program
		 * All code will be executed inside main thread only
		*/	
		
		
		t1.start();		
		/*		
		 * To make class as thread use start()
		*/		
//		t1.start();	IllegalThreadStateException	

		
		for(int i = 0; i<5; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main ended..........");
	}
									
}
