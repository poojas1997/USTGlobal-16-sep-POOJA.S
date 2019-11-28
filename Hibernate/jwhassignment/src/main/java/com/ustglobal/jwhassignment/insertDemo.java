package com.ustglobal.jwhassignment;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jwhassignment.dto.Student;

public class insertDemo {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setSid(2);
		student.setSname("Aparna");
		student.setPercentage(45.36);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			System.out.println("Record Saved");
			entityTransaction.commit();
			
			
		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		entityManager.close();
	}//end of main

}//end of insertDemo Class
