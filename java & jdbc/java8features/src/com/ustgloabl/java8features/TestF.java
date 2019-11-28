package com.ustgloabl.java8features;

import java.util.function.Consumer;

public class TestF {
	
	public static void main(String[] args) {
		
		Consumer<Student> c = s -> {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		};
		
		Student s2 = new Student(10, "bhargav", 85.63);
		
		 c.accept(s2);
		
	}

}
