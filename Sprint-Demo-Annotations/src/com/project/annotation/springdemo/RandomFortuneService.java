package com.project.annotation.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	@Value("${com.fortune.fortunes}")
	private String[] fortunes;

	//private String[] fortunes = {"lucky day","bad day","wonderful day","good day"};
	private Random newRandom = new Random();
	@Override
	public String getFortune() {
		
		int index = newRandom.nextInt(fortunes.length);
		return fortunes[index];
	}

}
