package com.eckstrom.springframeworkdemo.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.eckstrom.springframeworkdemo.fortune.FortuneService;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach2 {
	
	
	//Can be uncommented for field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Default constructor called.");
	}
	
//	@Autowired
//	Can be uncommented for constructor injection
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley for 30m.";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//@Autowired
	//Can be uncommented for setter/method injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setting fortune service.");
		this.fortuneService = fortuneService;
	}

}
