package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		
		ls.add(85.63);
		ls.add(43.63);
		ls.add(96.46);
		ls.add(75.26);
		ls.add(115.36);
		
		System.out.println("======Using for each loop======");
		
		for(double d : ls) {
			System.out.println(d);
		}
		
		System.out.println("===========using Iterator===========");
		Iterator<Double> i = ls.iterator();
		
		while(i.hasNext()) {
			Double d1 = i.next();
			System.out.println(d1);
		}
	}
}
