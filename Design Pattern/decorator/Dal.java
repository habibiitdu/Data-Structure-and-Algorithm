package com.designPattern.decorator;

public class Dal extends MealPreparation{

	public Dal(Meal meal){
		this.meal = meal;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Dal";
	}

	@Override
	public double cost() {
		System.out.println(this.description() + "-----> TK: 10.0" );
		return meal.cost() + 10;
	}

}
