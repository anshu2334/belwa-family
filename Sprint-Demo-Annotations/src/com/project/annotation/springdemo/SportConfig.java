package com.project.annotation.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.project.annotation.springdemo")
@PropertySource("classpath:application.properties")
public class SportConfig {
	
	/*
	 * @Bean public FortuneService happyFortuneService() { return new
	 * HappyFortuneService(); }
	 */
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach swimCoach = new SwimCoach(sadFortuneService());
		return swimCoach;
	}

}
