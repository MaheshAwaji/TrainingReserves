package com.te.LearnJava8.java8Features.FunctionInterfaces;

import java.util.function.Function;

public class LearnFunction {
	public static void main(String[] args) {
		Function<String, Integer> function=(str)->str.length();
		Function<Integer, Integer> function1=(n)->n*n;
		
		System.out.println(function.apply("Mahesh"));
		System.out.println(function1.apply(5));
	}

}
