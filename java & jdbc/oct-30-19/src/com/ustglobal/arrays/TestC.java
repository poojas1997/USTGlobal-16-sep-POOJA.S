package com.ustglobal.arrays;

public class TestC {
public static void main(String[] args) {
	
	Student s1 = new Student(1, "kavya", 56.32);
	Student s2 = new Student(2, "ramya", 75.66);
	Student s3 = new Student(3, "chinmay", 80.23);
	
	Student[] students = new Student[3];
	
	students[0] = s1;
	students[1] = s2;
	students[2] = s3;

	for(Student s : students) {
		System.out.println(s);
	}
}

static void receive(Student[] stu) {
	for(Student s: stu) {
		System.out.println(s);
	}

}
}
