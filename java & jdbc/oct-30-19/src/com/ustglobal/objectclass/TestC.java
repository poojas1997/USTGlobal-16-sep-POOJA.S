package com.ustglobal.objectclass;

public class TestC {
	
	public static void main(String[] args) {
		
		Student s = new Student(10, "Pooja", 55.55);
		int h = s.hashCode();
		System.out.println(h);
		System.out.println(s);
	}

}
