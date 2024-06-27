package com.te.LearnJava8.java8Features.defaultMethods;

public interface Middle {
	default void m1() {
		System.out.println("default method m1() from Middle");
	}
	default void m2() {
		System.out.println("default method m2() from Middle");
	}

}
