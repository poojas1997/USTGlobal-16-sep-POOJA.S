package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{

	public static void main(String[] args) {
		
		System.out.println("Main Starts......");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("myId Thread "+mi.getId());
		
//		mi.setId();  cannot chane id for thread
		System.out.println("priority " +Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(11); IllegalArgumentException if priority is >10 & <0;
		
		
		System.out.println("Main Ends......");
	}
}
