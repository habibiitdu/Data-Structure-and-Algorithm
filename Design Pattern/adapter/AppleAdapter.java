package com.designPattern.adapter;

public class AppleAdapter implements AppleCharger{

	SamsungCharger samsCharger;

	public void setSamungChager(SamsungCharger samsCharger){
		this.samsCharger = samsCharger;
	}

	@Override
	public void setMobileName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void charge() {
		samsCharger.charge();
	}

}
