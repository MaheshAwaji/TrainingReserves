package com.te.LearnJava8.oops.polymorphism;

public class Calculator {
	int a;
	int b;
	
	public Calculator() {
		System.out.println("Calculator()");
	}
	
	Calculator(int a){
		System.out.println("Calculator(int a");
		this.a=a;
	}
	Calculator(int a,int b){
		this(a);
		System.out.println("Calculator(int a,int b");
		this.b=b;
		
	}
	public void add(int a,int b){
		System.out.println("Calculator(int a,int b)");
		System.out.print("Result =");
		System.out.print(a+b);
	}
	public void add(int a,int b,int c){
		System.out.println("Calculator(int a,int b,int c)");
		System.out.print("Result =");
		System.out.print(a+b+c);
	}
	public static void main(String[] args) {
		System.out.println("Calculation");
		Calculator calculator=new Calculator();
		calculator.add(10, 20);
	}
	
	

}
