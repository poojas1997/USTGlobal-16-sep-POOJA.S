package com.ustglobal.accessspecifier.pkg1;

import com.ustglobal.accessspecifier.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		
	
	
Demo d = new Demo();
	
//	System.out.println(d.a);
//	d.add();       private method cannot be accessed
	
//	System.out.println(d.b); //default
//	d.sub();	
	
	Sample s = new Sample();
	
	System.out.println(s.c); // protected
	s.mul();
	
	System.out.println(d.name); //public
	d.div();

}
}