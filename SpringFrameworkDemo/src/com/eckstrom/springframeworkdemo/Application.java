package com.eckstrom.springframeworkdemo;

public class Application {

	public static void main(String[] args) {
		
		Coach coach = new TrackCoach();
		
		System.out.println(coach.getDailyWorkout());

	}

}
