package com.eckstrom.springframeworkdemo.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eckstrom.springframeworkdemo.coach.Coach;

//This class is meant to demonstrate the application lifecycle usage of the init-method and destroy-method
//Notice the beanLifecycle-applicationContext.xml file contains these two method specifications
//There are also changes to the TrackCoach.java class to reflect these method usages
public class BeanLifecycleDemoApp {

	public static void main(String[] args) {

		//Open the application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		//Get the bean
		Coach coach = context.getBean("myCoach", Coach.class);
		
		//Do stuff on the bean
		System.out.println(coach.getDailyWorkout());
		
		//Close the application context
		context.close();
	}

}
