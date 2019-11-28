package com.ustglobal.objectassiignment;

public class ObjectA {
	public static void main(String[] args) {


		Object[] obj = {2, 10 , 500 , 956368 , 85.36f , 9563.25 , true , 'L' };

		System.out.println("==========Using for loop=========");

		for(int i =0; i<obj.length; i++) {

			System.out.println(obj[i]);
		}
		
		System.out.println("==========Using for each loop=========");
		
		for(Object obj1 : obj) {
			System.out.println(obj1);
		}

	}	
}
