package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmpA {
	public static void main(String[] args) {
		
		Comparator<Emp> comp = (e1,e2) ->{
			
			if(e1.height > e2.height) {
				return 1;
			} else if(e1.height < e2.height) {
				return -1;
			} else {
				return 0;
			}
		};
		
		TreeSet<Emp> ts = new TreeSet<Emp>(comp);
		
		Emp e1 = new Emp(101, "Pooja", 4.8);
		Emp e2 = new Emp(105, "Sathya", 5.1);
		Emp e3 = new Emp(75, "Indira", 5);
		Emp e4 = new Emp(103, "Punee", 5.5);
		Emp e5 = new Emp(105, "Sathya", 5.1);

		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		System.out.println("====Using Iterator=====");
		
		Iterator<Emp> i= ts.iterator();
		
		while(i.hasNext()) {
			Emp e = i.next();
			System.out.println("Emp Id is " +e.id);
			System.out.println("Emp name is " +e.name);
			System.out.println("Emp height is " +e.height);
			System.out.println("=============");
		}
	}

}