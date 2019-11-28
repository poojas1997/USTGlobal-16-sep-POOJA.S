package com.ustgloabl.java8features;

import java.util.function.Function;

public class TestD {

	public static void main(String[] args) {
		
		Function<Integer, Student> f = i -> {
			
			Student s = new Student(2, "Pooja", 85.63);
			s.id = i;
			return s;
		};
		
		Student s = f.apply(10);
		System.out.println("Id of " +s.name+ " is " +s.id);
		System.out.println("Percentage of " +s.name+ " is " +s.percentage);
	}
}
