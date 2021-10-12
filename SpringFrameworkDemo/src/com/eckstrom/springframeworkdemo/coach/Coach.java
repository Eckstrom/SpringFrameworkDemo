package com.eckstrom.springframeworkdemo.coach;

import com.eckstrom.springframeworkdemo.fortune.FortuneService;

public interface Coach {
	
	public String getDailyWorkout();
	
	public String getDailyFortune();
	
	public void setFortuneService(FortuneService fortuneService);

}
