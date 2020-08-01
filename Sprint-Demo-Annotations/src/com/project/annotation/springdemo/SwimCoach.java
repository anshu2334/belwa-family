package com.project.annotation.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${com.coach.email}")
	private String email;
	@Value("${com.coach.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		System.out.println("email:"+email);
				return "Swim with Dance";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("team:"+team);
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
