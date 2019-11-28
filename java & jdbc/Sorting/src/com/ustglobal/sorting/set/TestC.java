package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		
		ls.add(34);
		ls.add("nikitha");
		ls.add(89.9);
		ls.add(34);
		ls.add("bhavya");
		ls.add(null);
		ls.add(null);
		
		System.out.println("====Using for each loop============");
		
		for(Object o : ls) {
			System.out.println(o);
		}
		
		System.out.println("=========Using Iterator=========");
		
		Iterator i = ls.iterator();
		while(i.hasNext()) {
			Object o1 = i.next();
			System.out.println(o1);
		}
	}
}
