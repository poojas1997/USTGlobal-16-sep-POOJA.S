package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class Stringlist {
public static void main(String[] args) {
	
	ArrayList<String> a = new ArrayList<String>();
	
	a.add("Pooja");
	a.add("Nadeem");
	a.add("Haseeb");
	a.add("Halima");
	
	System.out.println("Before Sort....." +a);
	Collections.sort(a);
	System.out.println("After Sort....." +a);
	
	Collections.reverse(a);
	System.out.println("After reverse...."+a);
	
	
}
}
