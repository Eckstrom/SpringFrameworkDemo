package com.eckstrom.springframeworkdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		//Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		//Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		//Close the application context
		context.close();
	}

}
