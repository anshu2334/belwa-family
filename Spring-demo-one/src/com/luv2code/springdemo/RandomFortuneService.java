package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {"lucky day","hard day","perfect day"};				
		int index = new Random().ints(0, 2).findAny().getAsInt();
		//int index = new Random().nextInt(3);
		String fortune =fortunes[index];
		System.out.println("index :"+index+"    fortune: "+fortune);
		return fortune;
		
		
		//String[] fortunes = {"lucky day","hard day","perfect day"};
		//Random random = new Random();		
		//int index = new Random().nextInt(3);
		//String fortune =fortunes[index];
		//System.out.println("index :"+index+"    fortune: "+fortune);
		//return fortune;
	}

}
