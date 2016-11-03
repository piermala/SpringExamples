package com.pierangelo.iniezioneOggetti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangolo t = (Triangolo) context.getBean("triangolo");
	
		System.out.println("PUNTO A " + t.getPuntoA());
		System.out.println("PUNTO B " + t.getPuntoB());
		System.out.println("PUNTO C " + t.getPuntoC());
		
	}
}
