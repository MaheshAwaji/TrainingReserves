package com.te.LearnJava8.oops.inheritance;

public class Parent {
	int a=10;

	public Parent() {
		super();
		System.out.println("A super:"+super.hashCode());
		System.out.println("A this:"+this.hashCode());
	}
	
	
	public static void staticMethod() {
		System.out.println("Parent static method");
	}
	
	

	@Override
	public String toString() {
		return "Parent [a=" + a + "]";
	}
	
	

}
