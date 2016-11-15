package com.designPattern.abstractFactory;

public class ColorFactory extends AbstractFactory{
	public Color BrushColor (String colorType){
		if(colorType.equals("red")){
			return new Red();
		}else if(colorType.equals("yellow")){
			return new Yellow();
		}else if(colorType.equals("green")){
			return new Green();
		}
		return null;
	}

	@Override
	public Car createCar(String car) {
		// TODO Auto-generated method stub
		return null;
	}
}
