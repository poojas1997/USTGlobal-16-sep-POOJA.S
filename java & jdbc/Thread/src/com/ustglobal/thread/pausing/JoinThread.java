package com.ustglobal.thread.pausing;

public class JoinThread {

	public static void main(String[] args) {
		
		System.out.println("Main starts.......");
		
		
		MyJoinThread t = new MyJoinThread();
		t.start();
		
		try {
			
			t.join(10000);		//waits to join the MyJoinThread class		
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		}
		
		for(int i = 0; i<10; i++) {
			System.out.println("Main thread");
		}
		
		System.out.println("Main ends.........");
	}
}
