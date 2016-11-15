package com.designPattern.abstractFactory;

public class AbstractFactoryInterpretor {
	public static void main(String args[]){
		AbstractFactory carFact = FactoryProducer.getFactory("car");
		AbstractFactory colorFact = FactoryProducer.getFactory("color");

		Car pCar = carFact.createCar("private");
		pCar.drive();

		Color green = colorFact.BrushColor("green");
		green.paint();
	}


}
