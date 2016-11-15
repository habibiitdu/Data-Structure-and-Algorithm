package com.designPattern.strategy;

public class AttackingStrategy implements TeamStrategy{

	@Override
	public void play(String name) {
		System.out.println(name + " will play in attacking mode");
	}

}
