package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestI {
public static void main(String[] args) {
	
	Stack s = new Stack();
	
	s.add("Haseeb");
	s.add(14);
	s.add(53.61);
	s.add(true);
	s.add(null);
	

	System.out.println("========Using Iterator========");
	
	Iterator i1 = s.iterator();
	while(i1.hasNext()) {
		Object o = i1.next();
		System.out.println(o);
	}
	
	System.out.println("========Using List Iterator========");
	
	ListIterator li = s.listIterator();
	while(li.hasNext()) {
		Object o = li.next();
		System.out.println(o);
	}
	
	System.out.println("========Using for loop========");
	
	for(int i = 0; i<s.size(); i++) {
		System.out.println(s.get(i));
	}
	
	System.out.println("========Using for each loop========");

	for(Object obj : s) {
		System.out.println(obj);
	}
	
	System.out.println("<<<<<<<<<<Using List Iterator<<<<<<<<<");
	
	while(li.hasPrevious()) {
		Object o = li.previous();
		System.out.println(o);
	}


}

			
}



