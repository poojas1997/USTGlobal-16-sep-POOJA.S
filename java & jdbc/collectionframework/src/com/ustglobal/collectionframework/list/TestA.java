package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(12);
		al.add(22.5);
		al.add("Pooja");
		al.add(true);
		al.add(null);
		al.add(true);
		al.add('N');
		al.add(12);

		for(int i = 0 ; i<al.size(); i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}
	}
}
