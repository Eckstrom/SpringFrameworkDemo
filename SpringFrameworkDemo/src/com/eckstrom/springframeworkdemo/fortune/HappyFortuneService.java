package com.eckstrom.springframeworkdemo.fortune;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	String[] fortune = {"You will be wealthier today.", 
						"You will gain more insight today.", 
						"You will be luckier than usual today."};
	
	@Override
	public String getFortune() {
		int random = new Random().nextInt(fortune.length);
	    return fortune[random];
	}

}
