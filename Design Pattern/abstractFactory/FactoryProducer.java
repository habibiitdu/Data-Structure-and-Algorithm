package com.designPattern.abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType){
		if(factoryType.equals("car")){
			return new CarFactory();
		}else if(factoryType.equals("color")){
			return new ColorFactory();
		}
		return null;
	}
}
