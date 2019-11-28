package com.ustglobal.springcore;
//refer Hello,Pet,Cat,Spring.xml
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class XMLComponentClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("Hello.....");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("sweety");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}