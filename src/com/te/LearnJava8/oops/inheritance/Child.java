package com.te.LearnJava8.oops.inheritance;

public class Child extends Parent {
	int b = 20;

	public Child() {
		super();
		System.out.println("B super:" + super.hashCode());
		System.out.println("B this:" + this.hashCode());

	}
	public static void staticMethod() {
		System.out.println("Child static method");
	}

	@Override
	public String toString() {
		return "Child [b=" + b + "]";
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int b = 2;
		Child child = new Child();
		Parent parent = new Parent();
		Child child2 = new Child();
		Parent parent2=new Child();
		
	
		

//		child.Add();
//		parent.Add();

	}

}
