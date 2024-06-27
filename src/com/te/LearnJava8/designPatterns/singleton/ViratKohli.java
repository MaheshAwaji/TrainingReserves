package com.te.LearnJava8.designPatterns.singleton;

public class ViratKohli {
	
	private static ViratKohli kohli;
	
	private String name;
	private int age;
	
	
	private ViratKohli() {
	}


	private ViratKohli(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static ViratKohli getVirat () {
		if (kohli==null) {
			kohli=new ViratKohli("Virat", 36);
			return kohli;
			
		}
		return kohli;
		
	}


	@Override
	public String toString() {
		return "ViratKohli [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	

}
