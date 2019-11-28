package com.ustglobal.thread.defining;

public class MyThread extends Thread {			//class Threadtest
	
	public void run() {
		
		for(int i = 0; i<5; i++) {
			System.out.println("Child Thread");
		}
		
	}
	
//	public void run(int i) {
//		System.out.println("run() overloaded");		//doesn't display bcz start() always calls 
//													zero parametarized method.
//	}

}
