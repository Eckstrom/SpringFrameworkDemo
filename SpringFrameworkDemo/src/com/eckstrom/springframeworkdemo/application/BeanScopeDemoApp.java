package com.eckstrom.springframeworkdemo.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eckstrom.springframeworkdemo.coach.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach coach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Need to check if these are the same bean
		
		boolean result = (coach == alphaCoach);
		
		System.out.println("These two beans are the same object?: " + result);
		
		System.out.println("Regular object reference: " + coach);
		
		System.out.println("Alpha object reference: " + alphaCoach);
		
		context.close();
	}

}
