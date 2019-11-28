package com.ustglobal.maps;

import java.util.Hashtable;

public class TestF {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(401, "vijay");
		ht.put(105, "srujan");
		ht.put(319, "moni");
		ht.put(100, "deepak");
		ht.put(501, "sriram");
//		ht.put(null, "john");	//NullPointerException
//		ht.put(103, null);		//NullPointerException

		
		System.out.println("Data : " +ht);
		
	} 
}
