package com.designPattern.adapter;

public class AppleMobile implements AppleCharger{

	String mobileName;

	@Override
	public void setMobileName(String name) {
		this.mobileName = name;
	}

	@Override
	public void charge() {
		System.out.println("Charging " + mobileName);
	}
}
