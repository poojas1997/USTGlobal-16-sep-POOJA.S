package com.ustglobal.springcore.config;		//AnnotationApp.java

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration			//starts to behave as beans.xml file
public class ConfigurationClass {

	@Bean(name="hello")			//starts behaving as element in xml file i.e as shown below
//	@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I Love Python");
		return hello;
	}
	
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name = "cat")
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean(name="pet")			//wiring,for autowire refer Pet.java
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Sweety");
//		pet.setAnimal(getDog());   
		return pet;
	}
}
