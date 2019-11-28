package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args) {

		Employee e1 = new Employee(020, "pooja", 5000);

		Employee e2 = new Employee(50, "puneeth", 10000);

		Employee e3 = new Employee(020, "pooja", 5000);

		Employee e4 = e3;
		
		int h1 = e1.hashCode();
		System.out.println(h1);
		
		int h2 = e2.hashCode();
		System.out.println(h2);
		
		int h3 = e3.hashCode();
		System.out.println(h3);
		
		int h4 = e4.hashCode();
		System.out.println(h4);

		boolean isEqual = e1.equals(e2);
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(isEqual);

	}
}
