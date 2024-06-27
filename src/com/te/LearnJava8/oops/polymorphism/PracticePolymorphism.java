package com.te.LearnJava8.oops.polymorphism;

class Parent1 {
	int a=20;
	public static void demo() {
		System.out.println("Parent class demo()");
	}
	
	public void test() {
		System.out.println("Parent class test()");
	}

}

class Child1 extends Parent1 {
	int a=40;
	public static void demo() {
		System.out.println("Child class demo()");
	}

	public void test() {
		System.out.println("Child class test()");
	}

}

public class PracticePolymorphism {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Parent1 parent1=new Parent1();
		Parent1 parent12=new Child1();
		Child1 child1=new Child1();
		System.out.println(parent1.a);
		System.out.println(parent12.a);
		System.out.println(child1.a);
		parent1.demo();
		parent12.demo();
		child1.demo();
		
		parent1.test();
		parent12.test();
		child1.test();
		
		

	}

}
