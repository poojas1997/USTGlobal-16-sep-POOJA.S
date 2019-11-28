package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(23);
		al.add(98.7);
		al.add(true);
		al.add("Good Evening");

		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println("obj1 = " +o1);

		Object o2 = it.next();
		System.out.println("obj2 = " +o2);

		Object o3 = it.next();
		System.out.println("obj3 = " +o3);

		Object o4 = it.next();
		System.out.println("obj4 = " +o4);

		boolean b = it.hasNext();
		System.out.println("Has Next = " +b);

		//		Object o5 = it.next();
		//		System.out.println("obj4 = " +o5);
		//		NoSuchElementException
		System.out.println("-*-*-*-*-*-*-*-*-*-*-Using for loop-*-*-*-*-*-*-*-*-*-*-");

		for(int i = 0; i < al.size(); i++) {
			Object o = al.get(i);
			System.out.println(o);
		}
		System.out.println(al.size());


		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add("Kavya");
		a1.add(true);
		a1.add(5.36);

		System.out.println("-*-*-*-*-*-*-*-*-*-*-Using Iterator-*-*-*-*-*-*-*-*-*-*-");

		Iterator it1 = a1.iterator();

		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}

	}
}