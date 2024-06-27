package com.te.LearnJava8.java8Features.defaultMethods;

public interface Left {
	default void m1() {
		System.out.println("default method m1() from Left");
	}
	default void m2() {
		System.out.println("default method m2() from Left");
	}

}
