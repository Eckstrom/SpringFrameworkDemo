package com.eckstrom.springframeworkdemo.fortune;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService { 
	@Value("${random1}")
	private String val1;
	@Value("${random2}")
	private String val2;
	@Value("${random3}")
	private String val3;
	
	@Value("${randomArray}")
	String[] fortune;
	
	@Override
	public String getFortune() {
		int random = new Random().nextInt(fortune.length);
	    return fortune[random];
	}

}
