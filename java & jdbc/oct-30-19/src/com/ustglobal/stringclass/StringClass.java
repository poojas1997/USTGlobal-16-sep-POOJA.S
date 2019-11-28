package com.ustglobal.stringclass;

public class StringClass {
	public static void main(String[] args) {
		
		String s1 = "aishu";
		String s2 = "deepika";
		
		String s3 = new String("aishu");
		String s4 = new String("aishu");
		String s5 = "aishu";
		
		System.out.println("================StringClass==================");

		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s5);  //'=' operator is used to compare the hashCode of strings.
		
		String s6 = s1.toLowerCase();
		System.out.println("lowercase = " +s6);
		
		String s7 = s1.toUpperCase();
		System.out.println("uppercase = " +s7);
		System.out.println();
		
		char c = s1.charAt(2);
		System.out.println("charat = " +c);
		
		boolean s8 = s1.equalsIgnoreCase("AiSHu");
		System.out.println("ignoringcase = " +s8);
		
		
		System.out.println("================StringBuffer==================");
		
		StringBuffer sb1 = new StringBuffer("Kavya");
		sb1.append("xyz");
		System.out.println(sb1);
		System.out.println(s1.length());
		
	}
}
