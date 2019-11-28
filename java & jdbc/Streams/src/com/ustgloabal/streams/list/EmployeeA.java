package com.ustgloabal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeA {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();

		Employee e1 = new Employee(101, "Pooja");
		Employee e2 = new Employee(103, "Sahana");
		Employee e3 = new Employee(105, "Halima");
		Employee e4 = new Employee(101, "Nadeem");

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		Comparator<Employee> cmp = (E1 , E2) -> {
			return E1.name.compareTo(E2.name);
		};

		List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
		
		Iterator<Employee> i = l.iterator();
		
		while(i.hasNext()) {
			
			Employee E = i.next();
			
			System.out.println(E.id);
			System.out.println(E.name);
			
			System.out.println("===============");
		}
	}
}