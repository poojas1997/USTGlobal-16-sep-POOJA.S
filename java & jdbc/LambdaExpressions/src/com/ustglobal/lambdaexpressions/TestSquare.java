package com.ustglobal.lambdaexpressions;

public class TestSquare {
public static void main(String[] args) {
	
	Square sq = x -> x * x;
	int value = sq.square(5);
	System.out.println("square = "+ value);
}
}
