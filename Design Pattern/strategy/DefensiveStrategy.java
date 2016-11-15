package com.designPattern.strategy;

public class DefensiveStrategy implements TeamStrategy{

	@Override
	public void play(String name) {
		System.out.println(name + " will play in defensive strategy");
	}

}
