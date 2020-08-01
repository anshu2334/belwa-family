package com.project.annotation.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Coach coach =applicationContext.getBean("tennisCoach", Coach.class);
			Coach alphaCoach =applicationContext.getBean("tennisCoach", Coach.class);
			boolean result = coach == alphaCoach;
			System.out.println(result);
			System.out.println("memory location for coach:"+coach);
			System.out.println("memory location for alphaCoach:"+alphaCoach);
		}

	}

}
