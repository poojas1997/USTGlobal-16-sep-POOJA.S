package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put("kuku", 998014);
		hm.put("mala", 885694);
		hm.put("sheela", 7859682);
		hm.put("mala", 885694);
		hm.put(null, 452636);
		hm.put(null, 5623696);

		System.out.println("Data : " +hm);

		hm.put("mala", 7850240);		//duplicate keys are not allowed
		System.out.println("After Modification....." +hm);

		hm.put("dimple", 7850240);
		System.out.println("After value modification....." +hm); 		//duplicate values are allowed

		hm.put("sheela", 7859682);
		System.out.println("After duplicate Entry......" +hm);		//Entry doesn'y allow duplicates

		System.out.println("After null "+hm);
		System.out.println("_______________________________________________");
		System.out.println("After 2nd null "+hm); 		//Only one null key is allowed but replaced by new value

		System.out.println("=====================================");

		Object phoneno = hm.get("sheela");
		System.out.println("value = "+phoneno);

		System.out.println("=====================================");

		Object phoneno1 = hm.get("Pooja");
		System.out.println("value = " +phoneno1);

		System.out.println("=====================================");

		Object value = hm.remove("kuku");
		System.out.println("value = " +value);
		System.out.println("After remove---------->" +hm);

	}
}
