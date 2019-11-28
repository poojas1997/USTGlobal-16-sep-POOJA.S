package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Padma");
		al.add(85.63);
		al.add(false);
		al.add('H');
		al.add(86);
		
		Object o = al.get(0);
		String name = (String)o;	//Downcasted to obtain the child property bcz in collections 
//										everything will be upcasted to object class.
		
		System.out.println(name.toUpperCase());
		
	}
}
