package com.ustgloabl.java8features;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {

		Predicate<Integer> p = i ->{
			if(i % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		boolean a = p.test(10);		//test() is present in predicate open declaration.
		System.out.println("Result = " +a);
		
		boolean b = p.test(11);
		System.out.println("Result = " +b);
	}
}
