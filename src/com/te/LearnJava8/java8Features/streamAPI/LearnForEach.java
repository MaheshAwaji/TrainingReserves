package com.te.LearnJava8.java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;

public class LearnForEach {
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(2,3,4,5,6,7);
		integers.stream().forEach(result->System.out.println(result*2));
		System.out.println(integers);
	}

}
