package com.te.LearnJava8.java9To17Features;

import java.util.List;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;

public class LearnGoogleGuava1 {
	public static void main(String[] args) {
		ImmutableList<String> immutableList=ImmutableList.of("Mahesh","Rakesh");
		System.out.println(immutableList);
		
		Multimap<String, String> multimap=ArrayListMultimap.create();
		multimap.put("Names", "Mahesh");
		multimap.put("Names", "Akash");
		multimap.put("LastName", "Awaji");
		System.out.println(multimap);
		
	}

}
