package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Book;

@Configuration
public class BookConfig {
	
	public Book getBook() {
		Book book = new Book();
		book.setName("Sheldon");
		book.setPrice(500);
//		book.setAuthor("kuvempu");
		return book;
	}

}
