package com.eckstrom.springframeworkdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		//Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();
		
		//Retrieve bean from spring container
		
		//Call methods on the bean
		
		//Close the application context

	}

}
