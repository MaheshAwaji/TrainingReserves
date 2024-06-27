package com.te.LearnJava8.oops.abstraction;

public class CommonClass implements Interface1 {

	@Override
	public void demo() {
		System.out.println("Demo() Interface 1");

	}

	public static void main(String[] args) {
		CommonClass class1=new CommonClass();
		class1.add();

	}

}
