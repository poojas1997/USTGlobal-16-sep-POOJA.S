package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestP {

public static void main(String[] args) {
			
			LinkedList<Employee> a = new LinkedList<Employee>();
			
			Employee e1 = new Employee(102, "pooja",50000);
			Employee e2 = new Employee(105, "Sara", 36000);
			Employee e3 = new Employee(502, "Monika", 40202);
			
			a.add(e1);
			a.add(e2);
			a.add(e3);
			
			System.out.println("======Using for loop==========");
			
			for(int i =0; i<a.size();i++) {
				Employee e = a.get(i);
				System.out.println(e.id);
				System.out.println(e.name);
				System.out.println(e.salary);
				System.out.println("____________");

			}
			
			System.out.println("=======Using for each loop=======");
			
			for(Employee emp : a) {
				System.out.println(emp);
			}
			
			System.out.println("==========Using Iterator==========");
			
			Iterator<Employee> i = a.iterator();
			while(i.hasNext()) {
				Employee emp1 = i.next();
				System.out.println(emp1);
			}
			
			System.out.println("======Using List Iterator=======");
			
			ListIterator<Employee> li = a.listIterator();
			while(li.hasNext()){
				Employee emp2 = li.next();
				System.out.println(emp2);
			}
		}
	}


