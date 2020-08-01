package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml")) {
			Coach coach =applicationContext.getBean("myCoach", Coach.class);
			Coach alphaCoach =applicationContext.getBean("myCoach", Coach.class);
			if(coach == alphaCoach)
			{
				System.out.println("both are same");
				
				System.out.println("Memory location coach:" + coach);
				System.out.println("Memory location alphaCoach:" + alphaCoach);
				
			}else {
				System.out.println("both are not equal");
				System.out.println("Memory location coach:" + coach);
				System.out.println("Memory location alphaCoach:" + alphaCoach);
			}
			
			if(coach.equals(alphaCoach))
			{
				System.out.println("both are same via equal method");
				System.out.println("Memory location coach:" + coach);
				System.out.println("Memory location alphaCoach:" + alphaCoach);
			}else {
				System.out.println("both are not equal via equal method");
				System.out.println("Memory location coach via equal method:" + coach);
				System.out.println("Memory location alphaCoach via equal method:" + alphaCoach);
			}
		}
		

	}

}
