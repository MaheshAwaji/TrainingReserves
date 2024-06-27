package com.te.LearnJava8.java8Features.FunctionInterfaces;

import java.util.function.Consumer;

public class LearnConsumer {
	public static void main(String[] args) {
		Consumer<String> consumer=(str)->System.out.println(str.toUpperCase());
		consumer.accept("Mahesh");
	}

}
