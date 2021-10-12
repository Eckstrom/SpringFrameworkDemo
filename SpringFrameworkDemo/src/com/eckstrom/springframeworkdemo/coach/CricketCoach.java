package com.eckstrom.springframeworkdemo.coach;
import com.eckstrom.springframeworkdemo.fortune.FortuneService;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		//System.out.println("Called the constuctor");
	}	
	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("Called the setter");
		this.fortuneService = fortuneService;
	}
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		//System.out.println("Setting email");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		//System.out.println("Setting team");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15m";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
