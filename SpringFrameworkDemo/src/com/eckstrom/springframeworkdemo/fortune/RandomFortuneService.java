package com.eckstrom.springframeworkdemo.fortune;

import java.util.Random;

import javax.annotation.PostConstruct;

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
	
	String[] initFortune = new String[3];
	
	@PostConstruct
	public void init() {
		initFortune[0] = val1;
		initFortune[1] = val2;
		initFortune[2] = val3;
	}
	
	@Override
	public String getFortune() {
		int random = new Random().nextInt(initFortune.length);
	    return initFortune[random];
	}

}
