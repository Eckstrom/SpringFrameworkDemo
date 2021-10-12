package com.eckstrom.springframeworkdemo.application;

import com.eckstrom.springframeworkdemo.coach.Coach;
import com.eckstrom.springframeworkdemo.coach.TrackCoach;

//Basic class with very basic Java functionality. It doesn't get more basic than this.
public class Application {

	public static void main(String[] args) {
		
		Coach coach = new TrackCoach();
		
		System.out.println(coach.getDailyWorkout());

	}

}
