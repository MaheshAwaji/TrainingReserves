package com.te.LearnJava8.oops.inheritance;

public class Parent1 {
	int a=10;

	public Parent1() {
		super();
		System.out.println("A super:"+super.toString());
		System.out.println("A this:"+this.toString());
	}

	@Override
	public String toString() {
		return "Parent1 [a=" + a + "]";
	}
	

}
