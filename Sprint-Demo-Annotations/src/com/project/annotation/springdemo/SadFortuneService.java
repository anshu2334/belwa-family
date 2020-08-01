package com.project.annotation.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is not lucky day";
	}

}
