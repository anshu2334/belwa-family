package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HappyFortuneService fortuneService = new HappyFortuneService();
		Coach baseBallCoach = new CricketCoach();
		System.out.println(baseBallCoach.getDailyWorkout());

	}

}
