package com.ustglobal.accessspecifier.pkg2;

public class Demo {
	private int a = 10;
	protected long b = 700;
	protected double c = 6.89;
	public String name = "Nadeem";
	
	private void add() {
		System.out.println("Demo add() method");
	}
	
	void sub() {
		System.out.println("Demo sub() method");
	}
	
	protected void mul() {
		System.out.println("Demo mul() method");
	}
	
	public void div() {
		System.out.println("Demo div() method");
	}
}
