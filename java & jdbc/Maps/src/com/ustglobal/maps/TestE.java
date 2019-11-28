package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {
	TreeMap<String, Integer> ts = new TreeMap<String, Integer>();
		
		ts.put("Patna", 880000);
		ts.put("Bangalore", 560068);
		ts.put("Hariyana", 134203);
//		ts.put(null, 571040); NullPointerException
		
		for(Map.Entry<String, Integer> m : ts.entrySet()) {
			
			Integer value = m.getValue();
			String key = m.getKey();
			System.out.println("key is " +key+ " and value is " +value);
			System.out.println("========================================");
		
		}
		
	}
}
