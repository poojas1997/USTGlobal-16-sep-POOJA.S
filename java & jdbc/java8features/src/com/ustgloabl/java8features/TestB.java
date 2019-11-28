package com.ustgloabl.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		
		Predicate<Student> p = s -> {
			if(s.percentage >= 35) {
				return true;
			} else {
				return false;
			}
		};
		
		Student s = new Student(101, "Pooja", 91.68);
		
		boolean b = p.test(s);
		
		if(b==true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	}
}
