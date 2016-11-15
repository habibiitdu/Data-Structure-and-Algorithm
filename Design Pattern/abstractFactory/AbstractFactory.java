package com.designPattern.abstractFactory;

public abstract class AbstractFactory {
	public abstract Color BrushColor(String color);
	public abstract Car createCar(String car);
}
