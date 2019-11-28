package com.ustglobal.thread.properties;

public class MyThread extends Thread{

		public static void main(String[] args) {
			
			System.out.println("Main Starts.......");
			
			String tname = Thread.currentThread().getName();		//to get the name of current thread
			System.out.println("Current thread is " +tname);
			
			MyThread t1 = new MyThread();
			String mname = t1.getName();
			System.out.println("MyThread Name is " +mname);
			
//			MyThread t2 = new MyThread();
//			String mname1 = t2.getName();
//			System.out.println("MyThread Name is " +mname1);
//			
			t1.setName("Java");
			System.out.println("MyThread Name is " +t1.getName());
			
			Thread.currentThread().setName("Bala");  			//to change the name of thread
			System.out.println(10/0);
			
			
			System.out.println("Main ends.........");
		}
}
