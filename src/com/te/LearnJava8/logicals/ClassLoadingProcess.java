package com.te.LearnJava8.logicals;

public class ClassLoadingProcess {
	static int staticVar = 10;
	static {
		System.out.println("Static block gets executed");
		staticVar = 100;
	}

	int instatnceVar = 20;
	{
		System.out.println("Instance Block gets executed");
		instatnceVar = 50;
	}

	static void staticMethod() {
		System.out.println("static method gets executed");
	}

	public ClassLoadingProcess() {
		instatnceVar = 200;
		System.out.println("instructions exe");
		System.out.println("constructor exe");
	}

	public void nonStaticMethod() {
		System.out.println("nonStaticMethod gets executed");
	}

	static class StaticClass {
		void display() {
			System.out.println("static nested class executed");
		}
	}

	class InnerClass {
		void display() {
			System.out.println("Inner class executed");
		}

	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		ClassLoadingProcess.staticMethod();
		System.out.println("static var" + ClassLoadingProcess.staticVar);

		ClassLoadingProcess cp = new ClassLoadingProcess();
		cp.nonStaticMethod();

		System.out.println("InstanceVar " + cp.instatnceVar);

		StaticClass sn = new StaticClass();
		sn.display();

		InnerClass ic = cp.new InnerClass();
		ic.display();
		System.out.println("main() end");
		
	

	}

}
