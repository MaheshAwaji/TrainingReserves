package com.te.LearnJava8.java8Features.FunctionInterfaces;

import java.util.function.Predicate;

public class LearnPredicate {
	public static void main(String[] args) {
		Predicate<Integer> predicate=(n)->n>18;
		boolean test = predicate.test(10);
		System.out.println(test);
	}

}
