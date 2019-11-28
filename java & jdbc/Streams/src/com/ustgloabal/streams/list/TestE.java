package com.ustgloabal.streams.list;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class TestE{
	public static void main(String[] args) {

		ArrayList<Integer> marks =new ArrayList<Integer>();

		marks.add(70);
		marks.add(25);
		marks.add(35);
		marks.add(30);
		marks.add(90);
		marks.add(45);
		
		Comparator<Integer> cmp = (m1,m2) -> {
			if(m1 > m2) {
				return 1;
			} else if(m1 <m2) {
				return -1;
			} else {
				return 0;
			}
		};

		long noOfFailedStudents = marks.stream().filter(i -> i < 40).count();

		System.out.println("number of failed students = " +noOfFailedStudents);

		System.out.println("===================");
		
		long noOfPassedStudents = marks.stream().filter(i -> i > 40).count();

		System.out.println("number of passed students = " +noOfPassedStudents);

		System.out.println("===================");
		
		Integer mrks = marks.stream().min(cmp).get();
		
		System.out.println("min value = "+mrks);
		System.out.println("===================");
		
		Integer m = marks.stream().max(cmp).get();
		
		System.out.println("Max value = " +m);


	}
}
