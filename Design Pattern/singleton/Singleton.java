package com.designPattern.singleton;

public class Singleton {
	private static Singleton singletonObj = null;


	private Singleton(){
	}

	public static Singleton getSingletonObject(){
		if(singletonObj == null){
			singletonObj = new Singleton();
		}
		return singletonObj;
	}

	public void doSomething(){
		System.out.println("Single");
	}
}
