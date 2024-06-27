package com.te.LearnJava8.java8Features.FunctionInterfaces;

import java.util.function.Supplier;

public class LearnSupplier {
	public static void main(String[] args) {
		Supplier<Float> supplier=()->(float)Math.random();
		System.out.println(supplier.get());
	}

}
