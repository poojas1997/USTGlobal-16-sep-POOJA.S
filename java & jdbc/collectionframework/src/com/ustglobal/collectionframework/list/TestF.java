package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Lallu");
		al.add("Padma");
		al.add("Neha");
		al.add("Halima");
		al.add("Rachu");
		
		String s = al.get(0);
		System.out.println(s.toUpperCase());
		
		System.out.println("=======Using Iterator=======");
		
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			String s1 = i.next();
			System.out.println(s1);
		}
		
		System.out.println("====Using List Iterator====");
		
		ListIterator<String> li = al.listIterator();
		while(li.hasNext()) {
			String s2 = li.next();
			System.out.println(s2);
		}
		
		System.out.println("======Using for each=======");
		
		for(String s3 : al) {
			System.out.println(s3);
		}
	}
}
