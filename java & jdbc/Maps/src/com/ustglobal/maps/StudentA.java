package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StudentA {
	public static void main(String[] args) {

		Student s1 = new Student(25, "Pooja", 88.63);
		Student s2 = new Student(29, "Punee", 96.3);
		Student s3 = new Student(05, "Komal", 71.56);
		Student s4 = new Student(23, "Halima", 86.3);
		Student s5 = new Student(20, "Haseeb", 92.6);
		Student s6 = new Student(36, "Sahana", 78.63);
		Student s7 = new Student(02, "Anu", 72.6);
		Student s8 = new Student(35, "Sameena", 64.96);
		Student s9 = new Student(41, "Thanushree", 56.96);
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Student> First = hm.get("second");
		Iterator<Student> i = First.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println("Id = " +s.id);
			System.out.println("Name = " +s.name);
			System.out.println("Percentage = "+s.percentage);
			System.out.println("===============================");
		}
		
		

	}

}
