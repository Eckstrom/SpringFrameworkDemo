package com.eckstrom.springframeworkdemo.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eckstrom.springframeworkdemo.coach.Coach2;
import com.eckstrom.springframeworkdemo.coach.SwimCoach;
import com.eckstrom.springframeworkdemo.configuration.SportConfiguration;

//This class is meant to demonstrate how Spring scans and defines beans internally with annotations
//Notice how the TennisCoach class contains @Component at the class header, and there is no bean definition
public class SwimJavaConfigurationDemoApp {

	public static void main(String[] args) {

		//Open application context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);
				
		//Get the TennisCoach bean (The one with @Component)
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//Do something with it
		System.out.println(swimCoach.getTeam());
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		//Close the context
		context.close();
	}

}
