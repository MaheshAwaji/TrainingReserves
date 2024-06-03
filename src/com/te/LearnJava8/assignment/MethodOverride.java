package com.te.LearnJava8.assignment;

public class MethodOverride {
	public static void mathOperation(int a,int b) {
		int sum=a+b;
		System.out.println("Sum= "+sum);
	}
	public static void mathOperation(int a,int b,int c) {
		int multiplication=a*b*c;
		System.out.println("Product= "+multiplication);
	}
	public static void mathOperation(double a,double b) {
		double substration=a-b;
		System.out.println("Result= "+substration);
	}
	public static void main(String[] args) {
		mathOperation(2, 3);
		mathOperation(5, 7, 4);
		mathOperation(1.5, 1.0);
		
	}
	

}
