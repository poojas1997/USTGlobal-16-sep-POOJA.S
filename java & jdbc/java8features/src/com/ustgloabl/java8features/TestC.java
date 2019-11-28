package com.ustgloabl.java8features;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i * i;
		
		int a = f.apply(5);
		System.out.println("Square of 5 = " +a);
	}
}
