package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Halima");
		ts.add("Haseeb");
		ts.add("Sathya");
		ts.add("Indira");
		ts.add("Lallu");
		ts.add("Anu");
		ts.add("Punee");

		System.out.println("==========for each loop========");

		for(String s : ts) {
			System.out.println(s);
		}

		System.out.println("========Iterator==========");

		Iterator<String> i =ts.iterator();
		while(i.hasNext()) {
			String s1 = i.next();
			System.out.println(s1);
		}
	}
}
