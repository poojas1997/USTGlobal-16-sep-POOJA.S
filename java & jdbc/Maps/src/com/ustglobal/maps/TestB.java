package com.ustglobal.maps;


import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("kuku", 998014);
		hm.put("mala", 885694);
		hm.put("sheela", 7859682);
		
		HashMap hm1 = new HashMap();
		
		hm1.put("deepu", 780551);
		hm1.put("riya", 5602393);
		hm1.put("kriti", 4688523);
		
		boolean key = hm.containsKey("mala");
		System.out.println("Has Key = " +key); 
		
		boolean val = hm.containsValue(885694);
		System.out.println("Has Value = "+val);
		
		hm.putAll(hm1);
		System.out.println("After putAll()........."+hm);
		
		System.out.println(hm.size());
		
		System.out.println("Map is empty = " +hm.isEmpty());
		
		hm.clear();
		System.out.println("After clear = " +hm);
	}

}
