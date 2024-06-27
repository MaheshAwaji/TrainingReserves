package com.te.LearnJava8.designPatterns.factory;

public class Bike implements Vehicles {

	@Override
	public void creatingVehicle() {
		System.out.println("Creating a Bike");
	}

}
