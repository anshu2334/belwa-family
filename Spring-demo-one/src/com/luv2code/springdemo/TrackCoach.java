package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach , DisposableBean{
	
	private FortuneService fortuneService;
	static int instanceCount =0;
	
public TrackCoach(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spent 30 mins in track practice";
	}
	
	@Override
	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}
	
	private void init() {
		instanceCount = instanceCount +1;
		System.out.println("initialize method called with count:"+instanceCount);
	}
	
	public void destroyBean() {
		System.out.println("Bean  is getting destroyed");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy Method: Bean  is getting destroyed");
		
	}

}
