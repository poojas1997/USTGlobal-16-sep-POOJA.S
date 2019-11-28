package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.Vector;

public class PriorityQueue {
	
	public static void main(String[] args) {
		
		
		
		java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<Integer>();
		
		pq.add(12);
		pq.add(24);
		pq.add(35);
		pq.add(35);
		pq.offer(1);
//		pq.add(null); NullPointException
		
		
		System.out.println("Before poll..........> "+pq);
		
		System.out.println("==========Using Iterator=========");
		Iterator<Integer> i = pq.iterator();
		while(i.hasNext()) {
			System.out.println(pq.poll());
		}
		
		System.out.println("After poll........>" +pq);
	}

}
