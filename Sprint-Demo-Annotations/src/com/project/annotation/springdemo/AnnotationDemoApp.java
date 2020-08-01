package com.project.annotation.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Coach coach =classPathXmlApplicationContext.getBean("tennisCoach", Coach.class);
			System.out.println(coach.getDailyWorkOut());
			System.out.println(coach.getDailyFortune());
		}
		/*
		 * try(AnnotationConfigApplicationContext annotationConfigApplicationContext =
		 * new AnnotationConfigApplicationContext("applicationContext.xml")) { Coach
		 * coach =annotationConfigApplicationContext.getBean("tennisCoachObj",
		 * Coach.class); System.out.println(coach.getDailyWorkOut()); }
		 */

	}
		

}

