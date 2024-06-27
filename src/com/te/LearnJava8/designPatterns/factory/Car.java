package com.te.LearnJava8.designPatterns.factory;

public class Car implements Vehicles {

	@Override
	public void creatingVehicle() {
		System.out.println("Creating a Car");
	}

}
