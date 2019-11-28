package com.ustgloabl.java8features.predicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
		Predicate<Student> p = s ->{
			if(s.percentage > 35) {
				return true;
			} else {
				return false;
			}
			
		};
		
		Student s = new Student(105, "Halima", 86.3);
		
		boolean b = p.test(s);
		if(b==true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
