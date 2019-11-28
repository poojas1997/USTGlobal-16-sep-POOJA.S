package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pet")			//==refer spring.xml
public class Pet {
	
	public Pet() {}
	
	public Pet(String name, Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}
	
	private String name;
	@Autowired				//used for autowire using annotation in Annotation.java
	@Qualifier("cat")				//used to qualify particular name which has 2 class in 1 interface 
	private Animal animal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
}
