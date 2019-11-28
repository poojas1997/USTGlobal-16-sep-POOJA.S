package com.ustglobal.singleton;

public class TestMySingleton {

	public static void main(String[] args) {
		MySingleton ms = MySingleton.getDbconnection();
		ms.s = "HELLO";
		System.out.println("HashCode of ms = " +ms.hashCode());
		System.out.println("ms = " +ms.s);
		
		MySingleton mx = MySingleton.getDbconnection();
		mx.s = "HI";
		System.out.println("HashCode of mx = " +mx.hashCode());
		System.out.println("mx = " +mx.s);
		
		System.out.println(ms.s); // reference variable is pointing to same object.
		System.out.println(mx.s);
	}
}
