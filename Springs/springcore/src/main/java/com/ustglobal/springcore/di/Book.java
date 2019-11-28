package com.ustglobal.springcore.di;

public class Book extends Author {
	private String Name;
	private Author author;
	private int price;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String getPenName() {
		
		return super.getPenName();
	}
	@Override
	public void setPenName(String penName) {
		Author author = new Author();
		author.setPenName("cello");
		return;
	}
	
	
}
