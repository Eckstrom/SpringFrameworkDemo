package com.eckstrom.springframeworkdemo.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eckstrom.springframeworkdemo.coach.Coach2;

//This class is meant to demonstrate how Spring scans and defines beans internally with annotations
//Notice how the TennisCoach class contains @Component at the class header, and there is no bean definition
public class AnnotationsDemoApp {

	public static void main(String[] args) {

		//Open application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		//Get the TennisCoach bean (The one with @Component)
		Coach2 tennisCoach = context.getBean("tennisCoach", Coach2.class);
		
		//Do something with it
		System.out.println(tennisCoach.getDailyWorkout());
		
		//Close the context
		context.close();
	}

}
