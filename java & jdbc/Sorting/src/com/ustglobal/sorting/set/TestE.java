package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
//		ts.add("Poo"); only generics are allowed. // ClassCast exception.
//		ts.add(null); doesn't allow null. // NullPointerException.
		
		System.out.println("==========using for each loop===========");
		
		for(Object o : ts) {
			System.out.println(o);
		}
		
		System.out.println("============Using Iterator==============");
		
		Iterator i = ts.iterator();
		while(i.hasNext()) {
			Object o1 = i.next();
			System.out.println(o1);
		}
	}

}
