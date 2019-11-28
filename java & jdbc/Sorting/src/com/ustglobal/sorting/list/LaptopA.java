package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LaptopA {
	public static void main(String[] args) {

		LinkedList<Laptop> l = new LinkedList<Laptop>();

		Laptop l1 = new Laptop(25000, 4, "HP");
		Laptop l2 = new Laptop(100000, 12, "Mac");
		Laptop l3 = new Laptop(50000, 8, "Asus");
		Laptop l4 = new Laptop(35000, 6, "Dell");

		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(new Laptop(20000, 2, "acer"));

		System.out.println("before sorting.....");
		displayLaptopDetails(l);

		Collections.sort(l);
		
		System.out.println("After sorting");
		displayLaptopDetails(l);
	}

	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> i = l.iterator();
		while(i.hasNext()) {
			Laptop l1 = i.next();
			System.out.println("Brand name is " +l1.name);
			System.out.println("ram is " +l1.ram);
			System.out.println("price is "+l1.price);
			System.out.println("===============");
		}
	}
}
