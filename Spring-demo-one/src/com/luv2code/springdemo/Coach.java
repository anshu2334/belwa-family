package com.luv2code.springdemo;

public interface Coach {
	public String getDailyWorkout();
	default String   getDailyFortune() {
		return "default fortune";
	}

}
