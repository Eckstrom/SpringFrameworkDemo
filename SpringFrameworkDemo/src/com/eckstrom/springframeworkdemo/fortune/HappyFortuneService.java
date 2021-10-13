package com.eckstrom.springframeworkdemo.fortune;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	String[] fortune = {"You will be wealthier today.", 
						"You will gain more insight today.", 
						"You will be luckier than usual today."};
	
	public String getFortune() {
		
		return "Today is your lucky day!";
	}
	
	public String getFortune2() {
		int random = new Random().nextInt(fortune.length);
	    return fortune[random];
	}

}
