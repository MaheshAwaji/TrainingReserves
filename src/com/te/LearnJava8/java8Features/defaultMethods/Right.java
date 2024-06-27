package com.te.LearnJava8.java8Features.defaultMethods;

public interface Right {
	default void m1() {
		System.out.println("default method m1() from Right");
	}
	default void m2() {
		System.out.println("default method m2() from Right");
	}
	public static void Demo() {
		System.out.println("static method in Right ");
	}

}
