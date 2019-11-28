package com.ustgloabl.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void displayAllStudent(ArrayList<Student> al) {

		Iterator<Student> i = al.iterator();
		while(i.hasNext()) {

			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
			System.out.println("==============");

		}
	}

	void displayFailedStudents(ArrayList<Student> al) {

		List<Student> l = al.stream().filter(student -> student.percentage < 40).collect(Collectors.toList());

		//		for(Student s : l) {
		//			System.out.println(s.id);
		//			System.out.println(s.name);
		//			System.out.println(s.percentage);
		//			System.out.println("==============");
		//		}

		Iterator<Student> i = l.iterator();
		while(i.hasNext()) {

			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
			System.out.println("==============");

		}
	}

	void displayPassedStudents(ArrayList<Student> al) {

		List<Student> l = al.stream().filter(student -> student.percentage > 40).collect(Collectors.toList());

		Iterator<Student> i = l.iterator();
		while(i.hasNext()) {

			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
			System.out.println("==============");

		}
	}
	
	Comparator<Student> cmp = (c1 , c2) -> {
		if(c1.percentage > c2.percentage) {
			return 1;
		} else if(c1.percentage < c2.percentage) {
			return -1;
		} else {
			return 0;
		}
	};
	
	void topper(ArrayList<Student> al) {
		
		Student s = al.stream().max(cmp).get();
		System.out.println("*************Topper is*******************");
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.percentage);
	}
}
