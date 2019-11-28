package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Hello hello = context.getBean(Hello.class);		//class
    	System.out.println(hello.getMsg());
    	
    	Hello hello2 = context.getBean(Hello.class);
    	Hello hello3 = context.getBean(Hello.class);
    	System.out.println("---------------------");
    	
    	System.out.println(hello.getMap());
    	System.out.println("---------------------");

    	System.out.println(hello);
    	System.out.println(hello2);
    	System.out.println(hello3);	
    	System.out.println("---------------------");

    	Animal animal = context.getBean(Animal.class);	//interface
    	animal.makeSound();
    
    	Animal animal2 = (Animal) context.getBean("dog");
    	//used to run any one class which implements same inteface by passing id present in xml file
    	animal2.makeSound();
    	System.out.println("------------------------");
    	
    	Pet pet = context.getBean(Pet.class);
    	System.out.println(pet.getName());
    	pet.getAnimal().makeSound();
    	
    	
    	
    }//end of main
}//end of App
