package com.project.annotation.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp2 {

	public static void main(String[] args) {
		

		 try(AnnotationConfigApplicationContext annotationConfigApplicationContext =
		  new AnnotationConfigApplicationContext(SportConfig.class)) { 
			 Coach 	 coach =annotationConfigApplicationContext.getBean("swimCoach", Coach.class); 
			 if(coach instanceof SwimCoach) {
				 SwimCoach swimCoach = (SwimCoach)coach;
			 System.out.println(swimCoach.getDailyWorkOut());
			 System.out.println(swimCoach.getDailyFortune());
			 System.out.println(swimCoach.getEmail());
			 System.out.println(swimCoach.getTeam());
			 }
		 }
		 

	}

}

