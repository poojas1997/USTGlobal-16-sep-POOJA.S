package com.ustglobal.thread.pausing;

public class CounterTest {

	public static void main(String[] args) {
		
		System.out.println("Main starts..........");
		Counter c = new Counter();
		
		Runnable r1 = () -> {
			
			
			c.increment();
			c.showvalue();
		};
		
		Runnable r2 = () -> {
			c.decrement();
			c.showvalue();
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		System.out.println("Main Ends.......");
	}
}
