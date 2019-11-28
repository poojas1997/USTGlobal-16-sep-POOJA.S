package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MarkerA {
	
	public static void main(String[] args) {
		
		LinkedList<Marker> l = new LinkedList<Marker>();
		
		Marker m1 = new Marker(50, "Blue");
		Marker m2 = new Marker(70, "Black");
		Marker m3 = new Marker(80, "Red");
		Marker m4 = new Marker(40, "green");
		
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		
		System.out.println("before sorting............");
		display(l);
		
		SortByPrice sb = new SortByPrice();
		Collections.sort(l, sb);
		
		SortByColorMarker sc = new SortByColorMarker();
		Collections.sort(l, sc);
		
		System.out.println("After sorting.......");
		display(l);
		
		
	}
	
	static void display(LinkedList<Marker> l) {
		Iterator<Marker> i = l.iterator();
		
		while(i.hasNext()) {
			Marker m = i.next();
			System.out.println(m.color);
			System.out.println(m.price);
			System.out.println("=============");
		}
		
	}

}
