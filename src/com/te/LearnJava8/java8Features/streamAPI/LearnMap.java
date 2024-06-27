package com.te.LearnJava8.java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnMap {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Mahesh","Suresh","Rakesh","Ram","Sita");
		
//		List<String> list2=list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		List<String> list2=list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		List<Integer> integers=Arrays.asList(1,2,3,4,5);
		List<Integer> integers2=integers.stream().map(n->n*n).collect(Collectors.toList());
		
		System.out.println(integers2);
		
		
		System.out.println(list2);
	}

}
