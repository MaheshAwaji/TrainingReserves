package com.te.LearnJava8.java8Features.defaultMethods;

public class LearnDefaultMethod1 implements Left,Right,Middle {

	@Override
	public void m1() {
		System.out.println(" default method in implementing class");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		Left.super.m2();
	}
	
	

}
