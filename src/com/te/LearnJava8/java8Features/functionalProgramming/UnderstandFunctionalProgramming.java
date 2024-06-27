package com.te.LearnJava8.java8Features.functionalProgramming;

import java.util.function.Function;

public class UnderstandFunctionalProgramming {
	public static void main(String[] args) {
		//Pass function to Function
		
		Function<Integer, Integer> square=(m)->m*m;
		System.out.println(newFunction(5,square));
		
		Function<Integer,Integer> cube=createCubeFunction();
		System.out.println(cube.apply(3));
		
	}

	

	private static Integer newFunction(int i, Function<Integer, Integer> square) {
		return square.apply(i);
	}
	
	//Returning Function
	private static Function<Integer, Integer> createCubeFunction() {
		return (m)->m*m*m;
	}
	
	

}
