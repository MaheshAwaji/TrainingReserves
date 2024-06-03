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
		ConstructorOverride constructorOverride1=new ConstructorOverride("Mahesh");
		ConstructorOverride constructorOverride2=new ConstructorOverride("Mahesh",7559475706l);
		ConstructorOverride constructorOverride3=new ConstructorOverride("Mahesh",7559475706l,"maheshawaji111@gmail.com");
		
	}

}
