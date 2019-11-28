package com.ustglobal.jwhassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jwhassignment.dto.Student;

public class ReadDemo {
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Student student = entityManager.find(Student.class, 1);
	
	System.out.println("Student Id = " +student.getSid());
	System.out.println("Student Name = " +student.getSname());
	System.out.println("Student Percentage = " +student.getPercentage());
	entityManager.close();
		
	}//end of main
}//end of ReadDemo
