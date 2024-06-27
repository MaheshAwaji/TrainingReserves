package com.te.LearnJava8.oops.inheritance;

public class Child1 extends Parent1 {
	int b=20;

	public Child1() {
		super();
		System.out.println("B super:" + super.toString());
		System.out.println("B this:" + this.toString());
	}

	@Override
	public String toString() {
		return "Child1 [b=" + b + "]";
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Child1 child1=new Child1();
		Parent1 parent1=new Parent1();
		Child1 child12=new Child1();
	}
	
	

}
