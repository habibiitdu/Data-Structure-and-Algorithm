package com.designPattern.adapter;

public class AdapterPatternMain {
	public static void main(String args[]){
		AppleCharger appCharger = new AppleMobile();
		appCharger.setMobileName("Apple");
		appCharger.charge();

		System.out.println("After adding addapter");

		SamsungCharger samsCharger = new SamsungMobile();
		samsCharger.setMobileName("Galaxy Note 5");

		AppleAdapter appAdapter = new AppleAdapter();
		appAdapter.setSamungChager(samsCharger);
		appAdapter.charge();
	}
}
