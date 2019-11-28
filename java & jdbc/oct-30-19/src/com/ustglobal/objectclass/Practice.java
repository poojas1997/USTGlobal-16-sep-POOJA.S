package com.ustglobal.objectclass;

public class Practice {
public static void main(String[] args) {
		
		Pen p = new Pen();
		int pHashCode = p.hashCode();
		System.out.println(" HashCode of p Pen = " +pHashCode);
		
		Pen p1 = new Pen();
		String s = p1.toString();
		System.out.println("toString of Pen = " +s);
		
	}
}
