package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestL {
	
	public static void main(String[] args) {
		
		Vector<Student> v = new Vector<Student>();
		
		Student s1 = new Student(15, "Sumuka", 86.23);
		Student s2 = new Student(18, "Harisha", 87.36);
		Student s3 = new Student(98, "Gowri", 57.36);
		Student s4 = new Student(69, "Tulsi", 75.63);
		
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		
		System.out.println("======Using for loop========");
		
		for(int i = 0; i<v.size(); i++) {
			Student stu = v.get(i);
			System.out.println(stu.id);
			System.out.println(stu.name);
			System.out.println(stu.percentage);
			System.out.println("______________________");
		}
		
		System.out.println("========Using for each loop========");
		
		for(Student g : v) {
			System.out.println(g);
		}
		
		System.out.println("=======Using Iterator==========");
		
		Iterator<Student> i = v.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println(s);
		}
		
		System.out.println("==========Using List Ierator========");
		
		ListIterator<Student> l = v.listIterator();
		while(l.hasNext()) {
			Student st = l.next();
			System.out.println(st);
		}
		
	}

}
