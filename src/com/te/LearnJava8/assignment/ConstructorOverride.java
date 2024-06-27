package com.te.LearnJava8.assignment;

public class ConstructorOverride {
	String name;
	long mobile;
	String gmail;
	
	
	
	public ConstructorOverride(String name) {
		super();
		this.name = name;
	}
	

	public ConstructorOverride(String name, long mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	

	public ConstructorOverride(String name, long mobile, String gmail) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.gmail = gmail;
	}




	public static void main(String[] args) {
		new ConstructorOverride("Mahesh");
		new ConstructorOverride("Mahesh",7559475706l);
		new ConstructorOverride("Mahesh",7559475706l,"maheshawaji111@gmail.com");
		
	}

}
