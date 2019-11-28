package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class TestJ {

	public static void main(String[] args) {
		
		ArrayList<Student> s = new ArrayList<Student>();
		
		Student s1 = new Student(101, "anu", 82.63);
		Student s2 = new Student(102, "thanu",85.83);
		Student s3 = new Student(103, "manu", 56.25);
		Student s4 = new Student(104, "anushree", 75.36);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);

		System.out.println("====Using for loop======");
		
		for(int i=0; i<s.size(); i++) {
			Student stu = s.get(i);
			System.out.println("Id is = "+stu.id);
			System.out.println("Name is = "+stu.name);
			System.out.println("percentage is = "+stu.percentage);
			System.out.println("_________________________________");
		}
		
		System.out.println("====Using for each loop======");
		
		for(Student stu1 : s) {
			System.out.println(stu1);
			
		}
		
		System.out.println("====Using Iteration======");
		
		Iterator<Student> i1 = s.iterator();
		while(i1.hasNext()) {
			Student s5  = i1.next();
			System.out.println(s5);
		}
		
		System.out.println("====Using List Iteration======");
		
		ListIterator<Student> li = s.listIterator();
		while(li.hasNext()) {
			Student s6 = li.next();
			System.out.println(s6);
		}

	}
}
