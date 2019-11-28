package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Nadeem");
		hs.add("Sathya");
		hs.add("Indira");
		hs.add("Punee");
		hs.add("Pooja");
		
		System.out.println("====Using for each loop=========");
		
		for(String s : hs) {
			System.out.println(s);
		}
		
		System.out.println("=======Using Iterator==========");
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			String s1 = i.next();
			System.out.println(s1);
		}
	}
}
