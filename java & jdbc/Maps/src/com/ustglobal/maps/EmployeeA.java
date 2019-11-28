package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EmployeeA {
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(120, "Haseeb", 50000);
		Employee e2 = new Employee(115, "Halima", 40000);
		Employee e3 = new Employee(130, "Puneeth",60000);
		Employee e4 = new Employee(125, "Nadeem", 55000);
		Employee e5 = new Employee(145, "Sathya", 70000);
		Employee e6 = new Employee(128, "Pooja", 45000);
		Employee e7 = new Employee(110, "Amulya", 25000);
		Employee e8 = new Employee(148, "Sunaina", 30000);
		Employee e9 = new Employee(168, "Vinay", 42000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
		
		hm.put("Manager1", al);
		hm.put("Manager2", al1);
		hm.put("Manager3", al2);
		
		ArrayList<Employee> m1 = hm.get("Manager1");
		System.out.println("Manager1----------->");
		
		Iterator<Employee> i = m1.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println("id = " +e.id);
			System.out.println("name = " +e.name);
			System.out.println("salary = " +e.salary);
			System.out.println("===================================");
			
		}
		
		ArrayList<Employee> m2 = hm.get("Manager2");
		System.out.println("Manager2----------->");
		
		Iterator<Employee> i1 = m2.iterator();
		while(i1.hasNext()) {
			Employee E = i1.next();
			System.out.println("id = " +E.id);
			System.out.println("name = " +E.name);
			System.out.println("salary = " +E.salary);
			System.out.println("===================================");
			
		}
		
		ArrayList<Employee> m3 = hm.get("Manager3");
		System.out.println("Manager3----------->");
		
		Iterator<Employee> i2 = m3.iterator();
		while(i2.hasNext()) {
			Employee E1 = i2.next();
			System.out.println("id = " +E1.id);
			System.out.println("name = " +E1.name);
			System.out.println("salary = " +E1.salary);
			System.out.println("===================================");
			
		}
	}

}
