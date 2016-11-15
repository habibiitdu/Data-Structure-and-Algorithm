package com.designPattern.decorator;

public class Vegetable extends MealPreparation{

	public Vegetable(Meal meal) {
		this.meal = meal;
	}
	@Override
	public String description() {
		return "Vegetable";
	}

	@Override
	public double cost() {
		System.out.println(this.description() + "-----> TK: 15.0" );
		return meal.cost() + 15;
	}

}
