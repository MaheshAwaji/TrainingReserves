package com.te.LearnJava8.designPatterns.singleton;

public class LearnSingleton {
	public static void main(String[] args) {
		ViratKohli kohli1= ViratKohli.getVirat();
		ViratKohli kohli2=ViratKohli.getVirat();
		
		System.out.println(kohli1);
		System.out.println(kohli2);
	}

}
