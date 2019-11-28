package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(55);
		al.add(23.66);
		al.add("ayra");
		al.add(true);
		al.add('L');
		
		ListIterator li = al.listIterator();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		while(li.hasPrevious()) {
			Object o1 = li.previous();
			System.out.println(o1);
		}
		
	}
}
