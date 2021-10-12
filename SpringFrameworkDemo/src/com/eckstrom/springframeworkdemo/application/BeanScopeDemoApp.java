package com.eckstrom.springframeworkdemo.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eckstrom.springframeworkdemo.coach.Coach;

//This class is meant to test the bean scope, specifically Singleton and Prototype.
//To see the results of the tests, change the scope attribute within "beanScope-applicationContext.xml"
//for the "myCoach" bean.
public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Open the application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		//Get our beans
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Set up a boolean that we can use to check to see the singleton status of the beans
		boolean result = (coach == alphaCoach);
		
		//Check to see if they're the same
		System.out.println("These two beans are the same object?: " + result);
		System.out.println("Regular object reference: " + coach);
		System.out.println("Alpha object reference: " + alphaCoach);
		
		//Close the application context
		context.close();
	}

}
