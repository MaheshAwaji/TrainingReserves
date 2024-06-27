package com.te.LearnJava8.oops.polymorphism;

class A {
	int a = 10;
	public static void m1() {
		System.out.println("m1() from A");
	}
	void m2() {
		System.out.println("m2() from A");
	}
}
class B extends A {
	int a = 20;
	public static void m1() {
		System.out.println("m1() from B");
	}
	void m2() {
		System.out.println("m2() from B");
	}
}
public class CompileTimePolymorphism {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(b.a);
		a1.m1();
		a2.m1();
		b.m1();
		a1.m2();
		a2.m2();
		b.m2();

//		For variable shadowing the type of reference variable matters 

//		Case:01 A a1=new A() ;
//		here reference variable is a type of A and also the object created i also a type A
//		But the only reference variable type is considered .so,when we call a1.a we get the result
//		a=10
//		
//		Case:02 A a2=new B()
//		
//		here reference variable is a type of A but the Object is of Type B .class a variable shadowing 
//		only reference type is considered ,when we perform a2.a we still get 10,Data of a stored in class B 
//		object is not considered 
//		
//		
//		Case:3 B b=new B();
//		
//		In this case reference and object are of same type so B class 'a' variable is used .

	}

}
