package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestK {
	public static void main(String[] args) {
		
		LinkedList<Student> l = new LinkedList<Student>();
		
		Student s1 = new Student(55, "Pooja", 87.25);
		Student s2 = new Student(65, "Sahana",82.63);
		Student s3 = new Student(60, "Rachana", 85.55);
		Student s4 = new Student(56, "Pooja Shetty", 84.85);
		Student s5 = new Student(63, "Roja", 87.25);


		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
		System.out.println("========Using for loop=========== ");
		
		for(int i = 0; i<l.size(); i++) {
			Student s = l.get(i);
			System.out.println("id = " +s.id);
			System.out.println("name = "+s.name);
			System.out.println("percentage = "+s.percentage);
			System.out.println("______________________________");
		}
		
		System.out.println("========Using for each loop =============");
		
		for(Student st : l) {
			System.out.println(st);
		}
		
		System.out.println("========Using Iterator=========");
		
		Iterator<Student> i = l.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println(s);
		}
		
		System.out.println("=====Using  List Iterator=======");
		
		ListIterator<Student> li = l.listIterator();
		while(li.hasNext()) {
			Student s = li.next();
			System.out.println(s);
		}
	}

}
