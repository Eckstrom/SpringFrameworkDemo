package com.eckstrom.springframeworkdemo.coach;

import com.eckstrom.springframeworkdemo.fortune.FortuneService;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it! " + fortuneService.getFortune();
	}

	@Override
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		
	}
	
	//Init method
	public void init() {
		System.out.println("Init has been called.");
	}
	
	//Destroy method
	public void destroy() {
		System.out.println("Destroy has been called.");
	}
	
}
