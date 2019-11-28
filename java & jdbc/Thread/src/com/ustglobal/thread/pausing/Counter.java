package com.ustglobal.thread.pausing;

public class Counter {
		//ex for race condition
	int v;
	
	synchronized public void increment() {
		v++;
}
	
	synchronized public void decrement() {
		v--;
	}
	
	synchronized public void showvalue() {
		System.out.println("v value is "+v);
	}
}
