package com.te.LearnJava8.java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnDistinct {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,6,4,3,2,8,9,10,0,1,3,2,5,6,8);
		
		List<Integer> list2=list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list2);
	}

}
