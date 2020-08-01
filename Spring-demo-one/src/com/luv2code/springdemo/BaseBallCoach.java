package com.luv2code.springdemo;

public class BaseBallCoach implements Coach{
	
	private FortuneService fortuneService;
	public BaseBallCoach(FortuneService thefortuneService)
	{
		this.fortuneService = thefortuneService;
	}
	public String getDailyWorkout() {
		return "Spent 30 mins in batting practice";
	}
	@Override
	public String getDailyFortune() {
		// using fortune service to get fortune
		return fortuneService.getFortune();
	}
	
	

}
