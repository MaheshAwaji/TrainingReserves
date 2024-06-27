package com.te.LearnJava8.java8Features.defaultMethods;

public class OxygenOS implements AndroidOS  {

	@Override
	public void powerON() {
		System.out.println("Implementing powerON in OxygenOS");
		
	}

	@Override
	public void powerOFF() {
		System.out.println("Implementing powerOFF in OxygenOS");
		
	}
	 public void nightPhotography() {
		System.out.println("default method as nightPhotography in OxygenOS");
	}

}
