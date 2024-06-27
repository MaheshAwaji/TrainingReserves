package com.te.LearnJava8.oops.inheritance;

public class Dog extends Animal {
//	void eating() {
//		System.out.println("Animal eats");
//	}
	public static void main(String[] args) {
		Animal animal=new Dog();
		animal.eating();
		Dog dog=(Dog)animal;
		dog.eating();
	}
	
	

}
