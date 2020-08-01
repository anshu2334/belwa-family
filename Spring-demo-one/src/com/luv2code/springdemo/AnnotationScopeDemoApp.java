package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationScopeDemoApp {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("annotation-applicationContext.xml")){
			Coach coach =annotationConfigApplicationContext.getBean("tennisCoach", Coach.class);
			System.out.println(coach.getDailyWorkout());
		}

	}

}
