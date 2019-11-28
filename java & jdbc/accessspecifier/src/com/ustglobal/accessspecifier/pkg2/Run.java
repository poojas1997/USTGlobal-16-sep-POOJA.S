package com.ustglobal.accessspecifier.pkg2;

public class Run {
public static void main(String[] args) {
	
	Demo d = new Demo();
	
//	System.out.println(d.a);
//	d.add();       private method cannot be accessed
	
	System.out.println(d.b); //default
	d.sub();
	
	System.out.println(d.c); // protected
	d.mul();
	
	System.out.println(d.name); //public
	d.div();
}
}
