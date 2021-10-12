package com.eckstrom.springframeworkdemo.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eckstrom.springframeworkdemo.coach.Coach;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}

}
