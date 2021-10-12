package com.eckstrom.springframeworkdemo.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eckstrom.springframeworkdemo.coach.CricketCoach;

public class SetterDemoApplication {

	public static void main(String[] args) {
		
		//Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve the bean
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		//Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getTeam());
		System.out.println(coach.getEmailAddress());
		
		//Close the context
		context.close();
	}

}
