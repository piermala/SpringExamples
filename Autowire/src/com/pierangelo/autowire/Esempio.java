package com.pierangelo.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangolo t = (Triangolo) context.getBean("triangle");
		
		System.out.println(t.getPuntoA());
		System.out.println(t.getPuntoB());
		System.out.println(t.getPuntoC());		
		
	}
}
