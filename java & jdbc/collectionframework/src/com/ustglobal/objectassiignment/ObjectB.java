package com.ustglobal.objectassiignment;

public class ObjectB {

	public static void main(String[] args) {
		int id = 15;
		String name = "Pooja S";
		char section  = 'A';
		double percentage = 92.65;
		byte classes = 10;

		Object obj[] = {id , name , section , percentage , classes}; 
		
		System.out.println("========Using for loop========");
		
		for(int i = 0 ; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("=========Using for each loop========");
		
		for(Object obj1 : obj) {
			System.out.println(obj1);
		}
	}
}
