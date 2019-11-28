package com.ustglobal.arrays;

public class TestD {
	public static void main(String[] args) {
		
	
	int[] nums = {10,20,30,40};
	
	double[] val = {10.2,20.27,30.25};
	
	receive(nums);
	receive(val);
	
	
}

static void receive(int[] numbers) {
	for(int num : numbers) {
		System.out.println(num);
	}
	System.out.println("============");

}

static void receive (double[] value) {
	for(double val : value ) {
		System.out.println(val);
	}
}
}
