package com.ustglobal.stringclass;

import java.io.UnsupportedEncodingException;

public class TestA {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
	
	
	String s1 = "  My Name Is Pooja  ";
	String s2 = " Studying in Qspiders ";
	String str = "apple is good to health";
	String u = "";
	
	char s3 = s1.charAt(2);
	System.out.println("char = "+s3);
	
	String s4 = s1.concat(s2);
	System.out.println(s4);
	
	boolean s5 = s1.contains("Name");
	System.out.println(s5);
	
	boolean s6 = s2.endsWith("s ");
	System.out.println(s6);
	
	boolean s7 = s1.equals(s2);
	System.out.println(s7);
	
	boolean s8 = s1.equalsIgnoreCase("  MY Name Is PoOJA  ");
	System.out.println(s8);
	
	int s9 = s2.indexOf('Q');
	System.out.println(s9);
	
	int s10 = s1.lastIndexOf(str);
	System.out.println(s10);

	boolean s11 = s2.isEmpty();
	System.out.println(s11);
	
	 int s12 = s1.length();
	 System.out.println(s12);
	 
	 String s13 = s1.replace('N', 'n');
	 System.out.println(s13);
	 
	 String s14 = str.replaceAll(str, "mango");
	 System.out.println(s14);
	 
	 String[] s15 = s1.split("o",5);
	 for(String a : s15 ) {
		 System.out.println(a);
	 }
	 
	 String s16 = s1.substring(2, 10);
	 System.out.println(s16);
	 
	 String s17 = s2.trim();
	 System.out.println(s17);
	 
	 char[] s18 = s2.toCharArray();
	 for(char b : s18) {
		 System.out.println(b);
	 }
	 
	 String s19 = s2.toLowerCase();
	 System.out.println(s19);
	 
	 String s20 = s2.toUpperCase();
	 System.out.println(s20);
	 
	 String s21 = str.valueOf(1);
	 System.out.println(s21);
	
	 
}
}
