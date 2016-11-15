package com.designPattern.decorator;

public class DecoratorPatternMain {
	public static void main(String args[]){
		Meal meal = new Rice();
		meal = new Meat(meal);
		meal = new Dal(meal);
		meal = new Vegetable(meal);

		System.out.println("Total Meal Cost is TK: " + meal.cost());
	}
}
