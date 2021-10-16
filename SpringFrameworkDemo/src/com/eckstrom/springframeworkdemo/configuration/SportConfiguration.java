package com.eckstrom.springframeworkdemo.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.eckstrom.springframeworkdemo.coach.Coach2;
import com.eckstrom.springframeworkdemo.coach.SwimCoach;
import com.eckstrom.springframeworkdemo.coach.TennisCoach;
import com.eckstrom.springframeworkdemo.fortune.FortuneService;
import com.eckstrom.springframeworkdemo.fortune.RandomFortuneService;
import com.eckstrom.springframeworkdemo.fortune.SadFortuneService;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfiguration {
	
	@Bean
	public LoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
									   @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		LoggerConfig myLoggerConfig = new LoggerConfig(rootLoggerLevel, printedLoggerLevel);
 
		return myLoggerConfig;
	}
	
	// define bean for our sad fortune service
	//!!!These beans MUST have the method signature containing the same name as the object type as shown below!!!
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public FortuneService randomFortuneService() {
		return new RandomFortuneService();
	}
 
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach2 tennisCoach() {
		TennisCoach tennisCoach = new TennisCoach();
 
		return tennisCoach;
	}
	
	@Bean
	public Coach2 swimCoach() {
		SwimCoach swimCoach = new SwimCoach(sadFortuneService());
 
		return swimCoach;
	}

}
