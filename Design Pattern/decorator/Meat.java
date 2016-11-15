package com.designPattern.decorator;

public class Meat extends MealPreparation{

	public Meat(Meal meal){
		this.meal = meal;
	}
	@Override
	public String description() {
		return "Meat";
	}

	@Override
	public double cost() {
		System.out.println(this.description() + "-----> TK: 60.0" );
		return meal.cost() + 60;
	}

}
