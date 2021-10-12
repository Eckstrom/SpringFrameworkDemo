package com.eckstrom.springframeworkdemo.coach;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach2 {

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley for 30m.";
	}

}
