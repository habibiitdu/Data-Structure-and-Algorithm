package com.designPattern.singleton;

public class SingletonMain {
	public static void main(String args[]){
		Singleton singletonObject = Singleton.getSingletonObject();
		Singleton anotherSingleton = Singleton.getSingletonObject();

		if(singletonObject == anotherSingleton){
			System.out.println("Both are same Singleton object");
		}
	}
}
