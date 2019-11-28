package com.ustglobal.collectionframework.list;

public class Teacher {
	
	String name;
	double salary;
	String subject ;
	
	public Teacher(String name, double salary, String subject) {
		super();
		this.name = name;
		this.salary = salary;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", salary=" + salary + ", subject=" + subject + "]";
	}
	
	

	
}
