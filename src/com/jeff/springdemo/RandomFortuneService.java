package com.jeff.springdemo;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes;

	public RandomFortuneService() {
		fortunes = new String[3];
		fortunes[0] = "Fortune1";
		fortunes[1] = "Fortune2";
		fortunes[2] = "Fortune3";
	}

	@Override
	public String getFortune() {
		int index = (int) (Math.random()*3);
		return fortunes[index];
	}

}
