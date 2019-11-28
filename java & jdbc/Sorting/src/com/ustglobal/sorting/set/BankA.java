package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class BankA {
	public static void main(String[] args) {
		
		SortByNameBank sb = new SortByNameBank(); // compared using comparator
		SortByPinBank sp = new SortByPinBank();
		SortBymicrBank sm = new SortBymicrBank();
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		
		
		
		Bank b1 = new Bank("SBI", 560068, 6768689);
		Bank b2 = new Bank("CANARA", 571401, 8963457);
		Bank b3 = new Bank("HDFC", 560071, 125860);
		Bank b4 = new Bank("VIJAY", 526001, 6596969);
		Bank b5 = new Bank("HDFC", 560071, 125860);

		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("=====Using Iterator=========");
		
		Iterator<Bank> i = ts.iterator();
		while(i.hasNext()) {
			Bank b = i.next();
			System.out.println(b.name);
			System.out.println(b.pincode);
			System.out.println(b.micr);
			System.out.println("_________________");
		}
	}

}
