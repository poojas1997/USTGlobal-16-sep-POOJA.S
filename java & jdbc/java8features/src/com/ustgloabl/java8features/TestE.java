package com.ustgloabl.java8features;

import java.util.function.Supplier;

public class TestE {
	public static void main(String[] args) {
		
		Supplier<Student> s = () -> new Student(2, "Ajay", 65.6);
		
		Student s1 = s.get();
		System.out.println("id of " +s1.name+ " is " +s1.id+ " and percentage is "+s1.percentage);
		
		Supplier<Integer> i = () -> 20;
		int val = i.get();
		System.out.println("value is " +val);
		
		Supplier<String> ss = () -> "Good Evening";
		String str = ss.get();
		System.out.println(str);
	}
}
