package com.designPattern.adapter;

public class SamsungMobile implements SamsungCharger{

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
