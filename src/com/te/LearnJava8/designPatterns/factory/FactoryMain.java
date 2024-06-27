package com.te.LearnJava8.designPatterns.factory;

public class FactoryMain {
	public static void main(String[] args) {
		
		 Vehicles car = VehicleFactory.manufactureVehicle("Car");
		car.creatingVehicle();
		
		Vehicles bike = VehicleFactory.manufactureVehicle("bike");
		bike.creatingVehicle();
	}

}
