package com.designPattern.abstractFactory;

public class CarFactory extends AbstractFactory{
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

		@Override
		public Color BrushColor(String color) {
			// TODO Auto-generated method stub
			return null;
		}
}
