package com.ustgloabl.java8features;

import java.util.ArrayList;

public class StudentA {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(101, "Pooja", 39.63));
		al.add(new Student(95, "Nadeem", 96.38));
		al.add(new Student(62, "Halima", 90.69));
		al.add(new Student(65, "Haseeb", 88.63));
		al.add(new Student(98, "Padma", 35.12));
		
		//Helper class is used
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//		h.displayFailedStudents(al);
//		h.displayPassedStudents(al);
		h.topper(al);
	}
}
