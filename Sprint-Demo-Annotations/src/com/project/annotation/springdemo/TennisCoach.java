package com.project.annotation.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${com.coach.email}")
	private String email;
	@Value("${com.coach.team}")
	private String team;
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor:");
	}
	
	@PostConstruct
	public void initiazeObject() {
		System.out.println("post object initialization");
	}
	
	@PreDestroy
	public void cleanupHook()
	{
		System.out.println("pre destroy");
	}
	
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneServiceObj = fortuneService; }
	 */
	@Override
	public String getDailyWorkOut() {
		return "Practice your backend volley";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	

}
