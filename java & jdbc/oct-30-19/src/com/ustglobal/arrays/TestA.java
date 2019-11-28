package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {

		int[] nums = new int [5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;

		int[] num = {100,200,300,400,500};

		int[] num1 = {1000,2000,3000,4000,5000};	//Different ways of assigning array.

		for(int i = 0; i <nums.length; i++) {
			System.out.println("nums = " +nums[i]);
		}

		System.out.println("============");

		for(int i = 0; i <num.length; i++) {
			System.out.println("num = " +num[i]);
		}

		System.out.println("============");

		for(int i : num1) {
			System.out.println("num1 = " +i);
		}

		System.out.println("============");
		char[] ch = {'a' , 'b', 'c' , 'd'};
		for(int i = 0; i <ch.length; i++) {
			System.out.println("char = " +ch[i]);
		}

		System.out.println("============");
		for(char c : ch) {
			System.out.println("char = " +c);
		}

		System.out.println("============");
		double[] d = {2.55 , 5.33 , 9.66, 5.69};
		for(int i = 0; i <d.length; i++) {
			System.out.println("double = " +d[i]);
		}

		System.out.println("============");
		for(double d1 : d) {
			System.out.println("double = " +d1);
		}

		System.out.println("============");
		boolean[] b = {true,false,true,false};
		for(int i = 0; i <b.length; i++) {
			System.out.println("boolean = " +b[i]);
		}

		System.out.println("============");
		for(boolean b1 : b) {
			System.out.println("boolean = " +b1);
		}

		System.out.println("============");
		byte[] by = {0,5,6,8};
		for(int i = 0; i <by.length; i++) {
			System.out.println("byte = " +by[i]);
		}

		System.out.println("============");
		for(byte by1 : by) {
			System.out.println("byte = " +by1);
		}
 

		System.out.println("============");
		String[] str= {"aishu" ,"kavya" ,"divya" ,"priya"};
		for(int i = 0; i <str.length; i++) {
			System.out.println("string = " +str[i]);
		}

		System.out.println("============");
		for(String str1 :str) {
			System.out.println("str = " +str1);
		}

	}
}
