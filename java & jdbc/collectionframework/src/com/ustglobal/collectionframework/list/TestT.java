package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestT {
	
	
		public static void main(String[] args) {
			
			LinkedList<Teacher> a = new LinkedList<Teacher>();
			
			Teacher t1 = new Teacher("Indira", 45000, "Social");
			Teacher t2 = new Teacher("Prathima", 40000, "Maths");
			Teacher t3 = new Teacher("Komala", 60000, "Kannada");
			
			a.add(t1);
			a.add(t2);
			a.add(t3);
			
			System.out.println("=========Using for loop============");
			
			for(int i =0; i<a.size(); i++) {
				Teacher t = a.get(i);
				System.out.println(t.name);
				System.out.println(t.salary);
				System.out.println(t.subject);
				System.out.println("___________");
			}
			
			System.out.println("==========Using for each loop========");
			
			for(Teacher tc : a) {
				System.out.println(tc);
			}
			
			System.out.println("========Using Iterator==========");
			
			Iterator<Teacher> i = a.iterator();
			while(i.hasNext()) {
				Teacher tch = i.next();
				System.out.println(tch);
			}
			
			System.out.println("=========Using List Iterator============");
			
			ListIterator<Teacher> li = a.listIterator();
			while(li.hasNext()) {
				Teacher tch1 = li.next();
				System.out.println(tch1);
			}
		}

	}



