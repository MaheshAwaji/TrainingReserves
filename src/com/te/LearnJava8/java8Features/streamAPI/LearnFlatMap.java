package com.te.LearnJava8.java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnFlatMap {
	public static void main(String[] args) {
		List<List<Integer>> list1=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));
//		List<Integer> list2=list1.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		List<Integer> list2=list1.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(list2);
		
		List<String> list =Arrays.asList("Mahesh Awaji","Akash Patil");
		
		
		
	}

}
