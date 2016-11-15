package com.designPattern.factory;

public class FactoryMain {
	public static void main(String args[]){
		CarFactory factory = new CarFactory();
		Car racingCar = factory.createCar("racing");
		racingCar.drive();
		Car privateCar = factory.createCar("private");
		privateCar.drive();
		Car i20Car = factory.createCar("i20");
		i20Car.drive();
	}
}
