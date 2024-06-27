package com.te.LearnJava8.oops.polymorphism;

public class Child extends Parent {
	void demo() {
		System.out.println("non-static child class method");
	}
	
	static void test() {
		System.out.println("Child class static method");
	}
	public static void main(String[] args) {
		Child child=new Child();
		child.demo();
		test();
	}

}
