package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class BookAuthor {

	public static void main(String[] args) {
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
    	Book book = context.getBean(Book.class);
    	
    	System.out.println(book.getName());
    	System.out.println(book.getPrice());
    	System.out.println(book.getPenName());
    	
    	Author author = (Author) context.getBean("author") ;
    	System.out.println(author.getName());
    	System.out.println(author.getPenName());
    	
	}
}
