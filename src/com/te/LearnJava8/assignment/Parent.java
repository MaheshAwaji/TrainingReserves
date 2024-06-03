package com.te.LearnJava8.assignment;

public  class Parent {
	int name;
	int email;
	
	public Parent() {
		super();
		System.out.println("Parent class no=argument controctor called");
	}

	public Parent(int name, int email) {
		super();
		System.out.println("Parent class parameterised constructor called");
		this.name = name;
		this.email = email;
	}
	

}
