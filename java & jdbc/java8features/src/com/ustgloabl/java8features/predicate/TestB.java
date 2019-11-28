package com.ustgloabl.java8features.predicate;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		
		Predicate<Integer> p = a -> {
			if(a % 11 == 0) {
				return true;
			} else {
				return false;
			}
		};
		
		boolean b = p.test(23);
		
		if(b==true) {
			System.out.println("Divisible by 11");
		} else {
			System.out.println("Not Divisible by 11");
		}
	}
}
