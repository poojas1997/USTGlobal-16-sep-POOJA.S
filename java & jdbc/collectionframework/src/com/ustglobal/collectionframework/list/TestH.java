package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
public static void main(String[] args) {
	
	Vector v = new Vector();
	
	v.add("Haseeb");
	v.add(14);
	v.add(53.61);
	v.add(true);
	v.add(null);
	

	System.out.println("========Using Iterator========");
	
	Iterator i1 = v.iterator();
	while(i1.hasNext()) {
		Object o = i1.next();
		System.out.println(o);
	}
	
	System.out.println("========Using List Iterator========");
	
	ListIterator li = v.listIterator();
	while(li.hasNext()) {
		Object o = li.next();
		System.out.println(o);
	}
	
	System.out.println("========Using for loop========");
	
	for(int i = 0; i<v.size(); i++) {
		System.out.println(v.get(i));
	}
	
	System.out.println("========Using for each loop========");

	for(Object obj : v) {
		System.out.println(obj);
	}
	
	System.out.println("<<<<<<<<<<Using List Iterator<<<<<<<<<");
	
	while(li.hasPrevious()) {
		Object o = li.previous();
		System.out.println(o);
	}


}

			
}

