package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class AddMethod {

	public static void main(String[] args) {
		
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(34.5);
		a.add(23.5);
		a.add(52.6);
		a.add(85.6);
		a.add(34.5);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		
		a.add(2, 96.35);
		System.out.println("After add in 2nd index = " +a);
		
		a.remove(0);
		System.out.println("After remove from 0th index = " +a);
		
		a.remove(null);
		System.out.println("After removing null = " +a);
		
		Double val = a.get(4);
		System.out.println("Object at 4th index = " +val);
		
		a.set(2, 77.69);
		System.out.println("After set in 2nd index =" +a);
		
		boolean b = a.contains(85.6);
		System.out.println("After contain method= " +b);
		
		a.clear();
		System.out.println("After clear method = " +a);
		
		System.out.println("========================");
		
		List<Double> al = new ArrayList<Double>();
		
		al.add(12.3);
		al.add(23.4);
		al.add(34.5);
		
		a.addAll(al);
		System.out.println("After add all " +a);
		
		boolean b1 = a.containsAll(al);
		System.out.println("After containsall " +b1);
		
		boolean res = a.removeAll(al);
		System.out.println("After removingall " +res);
		System.out.println("After removingall " +a);
		
	}
}
