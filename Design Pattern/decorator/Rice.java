package com.designPattern.decorator;

public class Rice implements Meal{

	@Override
	public String description() {
		return "Rice";
	}

	@Override
	public double cost() {
		System.out.println(this.description() + "-----> TK: 10.0" );
		return 10.0;
	}

}
