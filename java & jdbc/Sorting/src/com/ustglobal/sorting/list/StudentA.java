package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentA {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();

		Student s1 = new Student(25, "Puneeth", 85.69);
		Student s2 = new Student(12, "halima", 75.68);
		Student s3 = new Student(55, "suma", 45.36);
		Student s4 = new Student(15, "Haseeb", 98.56);

		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);

		System.out.println("Before sorting........." );

		displayStudentDetails(a);

		Collections.sort(a);
		

		System.out.println("After sorting.........");
		displayStudentDetails(a);

	}

	static void displayStudentDetails(ArrayList<Student> a) {
		Iterator<Student> i =a.iterator();
		while(i.hasNext()) {

			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
			System.out.println("------------------------");
		}


	}
}
