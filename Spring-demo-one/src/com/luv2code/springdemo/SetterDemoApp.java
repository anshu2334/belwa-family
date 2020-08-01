package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			Coach coach = applicationContext.getBean("myCricketCoach", Coach.class);
			
			if(coach instanceof CricketCoach)
			{
			CricketCoach cricketCoach = (CricketCoach)coach;
			System.out.println(cricketCoach.getDailyWorkout());
			System.out.println(cricketCoach.getDailyFortune());
			System.out.println(cricketCoach.getEmailAddress());
			System.out.println(cricketCoach.getTeam());
			}
		}
	}
}
