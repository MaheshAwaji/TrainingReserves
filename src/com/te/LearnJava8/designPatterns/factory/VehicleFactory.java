package com.te.LearnJava8.designPatterns.factory;

public class VehicleFactory {
	Vehicles vehicles;
	public static Vehicles manufactureVehicle(String vehicle) {
		
		switch (vehicle.toLowerCase()) {
		case "car":
			return new Car();
		case "bus":
			return new Bus();
		case "bike":
			return new Bike();

		default:
			throw new IllegalArgumentException();//or you can return null
		}
	
	}

}
