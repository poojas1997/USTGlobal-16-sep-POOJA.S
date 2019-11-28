package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Pooja");
		l.add(11);
		l.add(52.36);
		l.add(true);
		l.add(null);
		
		System.out.println("========Using Iterator========");
		
		Iterator i1 = l.iterator();
		while(i1.hasNext()) {
			Object o = i1.next();
			System.out.println(o);
		}
		
		System.out.println("========Using List Iterator========");
		
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
		}
		
		System.out.println("========Using for loop========");
		
		for(int i = 0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("========Using for each loop========");

		for(Object obj : l) {
			System.out.println(obj);
		}
		
		System.out.println("<<<<<<<<<<Using List Iterator<<<<<<<<<");
		
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}


	}

}
