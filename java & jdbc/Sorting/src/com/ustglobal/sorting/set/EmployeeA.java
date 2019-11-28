package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeA {
	
	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<Employee>();
		
		Employee e1 = new Employee(101, "Pooja", 20000);
		Employee e2 = new Employee(105, "Sumukh", 35000);
		Employee e3 = new Employee(103, "Sahana", 25000);
		Employee e4 = new Employee(104, "Vinay", 40000);
		Employee e5 = new Employee(104, "Vinay", 40000);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("======Iterator==========");
		
		Iterator<Employee> i = hs.iterator();
		while(i.hasNext()) {
			
			Employee e = i.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
			System.out.println("________________________");
		}
	}

}
