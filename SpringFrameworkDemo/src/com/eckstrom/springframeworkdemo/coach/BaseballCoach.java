package com.eckstrom.springframeworkdemo.coach;

import com.eckstrom.springframeworkdemo.fortune.FortuneService;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService thisFortuneService) {
		fortuneService = thisFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		
		//Use fortuneservice to give daily fortune 
		return fortuneService.getFortune();
	}

}
