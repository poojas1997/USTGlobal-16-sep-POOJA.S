package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(15);
		al.add("pooja");
		al.add(55.23);
		al.add(false);
		
		for(Object o : al) {
			System.out.println(o);
		}
	}
}
