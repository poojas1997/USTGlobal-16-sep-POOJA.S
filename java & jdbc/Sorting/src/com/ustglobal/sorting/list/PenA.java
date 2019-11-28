package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PenA {

	public static void main(String[] args) {

		ArrayList<Pen> a = new ArrayList<Pen>();

		Pen p1 = new Pen(20, "writo-meter","Black");
		Pen p2 = new Pen(150, "Parker", "Red");
		Pen p3 = new Pen(100, "Hero", "Blue");
		Pen p4 = new Pen(30, "cello","Green");
		
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		
		System.out.println("Before Sorting........");
		displayPenDetails(a);
		
		Collections.sort(a);

		System.out.println("After Sorting.........");
		displayPenDetails(a);

	}

		static void displayPenDetails(ArrayList<Pen> a) {
			Iterator<Pen> i = a.iterator();

			while(i.hasNext()) {

				Pen p = i.next();
				System.out.println(p.brand);
				System.out.println(p.price);
				System.out.println("==========");
			}
		}
	}

