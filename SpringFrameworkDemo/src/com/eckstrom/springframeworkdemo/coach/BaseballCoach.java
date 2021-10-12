package com.eckstrom.springframeworkdemo.coach;

import com.eckstrom.springframeworkdemo.fortune.FortuneService;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		
		//Use fortune service to give daily fortune 
		return fortuneService.getFortune();
	}

	@Override
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		
	}

}
