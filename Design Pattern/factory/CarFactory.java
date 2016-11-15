package com.designPattern.factory;

public class CarFactory {
		public Car createCar(String carType){
			if(carType.equals("private")){
				return new PrivateCar();
			}else if(carType.equals("racing")){
				return new RacingCar();
			}else if(carType.equals("i20")){
				return new I20Car();
			}
			return null;
		}
}
