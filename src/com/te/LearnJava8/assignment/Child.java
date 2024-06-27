package com.te.LearnJava8.assignment;

public class Child extends Parent {
	String name;
	long mobile;
	
	public Child(String name, long mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
		System.out.println("Constroctor of (String,long ) called");
	}

	public Child(String name) {
		this(name,7559475706l);
		this.name = name;
		System.out.println("Constroctor of (String ) called");
	}

	public Child() {
		this("mahesh");
		System.out.println("Constroctor of no-argument called");
	}

	public static void main(String[] args) {
		
	}

}
