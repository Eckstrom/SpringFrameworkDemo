package com.eckstrom.springframeworkdemo.coach;

import org.springframework.beans.factory.annotation.Value;

import com.eckstrom.springframeworkdemo.fortune.FortuneService;

public class SwimCoach implements Coach2 {
	
	@Value("${email}")
	String email;
	
	@Value("${team}")
	String team;
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	 
}
