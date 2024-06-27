package com.te.LearnJava8.java8Features.defaultMethods;

public interface AndroidOS {
	void powerON();
	void powerOFF();
	
	default void nightPhotography() {
		System.out.println("default method as nightPhotography");
	}

}
