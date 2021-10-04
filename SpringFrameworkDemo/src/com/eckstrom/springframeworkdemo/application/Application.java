package com.eckstrom.springframeworkdemo.application;

import com.eckstrom.springframeworkdemo.coach.Coach;
import com.eckstrom.springframeworkdemo.coach.TrackCoach;

public class Application {

	public static void main(String[] args) {
		
		Coach coach = new TrackCoach();
		
		System.out.println(coach.getDailyWorkout());

	}

}
