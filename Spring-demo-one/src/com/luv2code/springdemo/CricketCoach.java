package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	private FortuneService fortuneService;	
	
	public CricketCoach() {
		System.out.println("Cricketing coach inside no-arg construtor");
	}
	@Override
	public String getDailyWorkout() {	
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "Cricketing Luck: "+fortuneService.getFortune();
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricketing coach inside setFortuneService:"+fortuneService);
		this.fortuneService = fortuneService;		
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricketing coach inside setEmail:"+emailAddress);
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("Cricketing coach inside setTeam:"+team);
		this.team = team;
	}
	
	
	
	
}
