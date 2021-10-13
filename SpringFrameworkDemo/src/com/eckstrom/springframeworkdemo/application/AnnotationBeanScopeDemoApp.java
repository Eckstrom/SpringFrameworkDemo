package com.eckstrom.springframeworkdemo.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eckstrom.springframeworkdemo.coach.Coach2;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		Coach2 theCoach = context.getBean("tennisCoach", Coach2.class);
		
		Coach2 alphaCoach = context.getBean("tennisCoach", Coach2.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Is this the same object?: " + result);
		System.out.println("Memory location of theCoach: " + theCoach);
		System.out.println("Memory location of alphaCoach: " + alphaCoach);
		
		context.close();

	}

}
