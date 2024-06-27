package com.te.LearnJava8.logicals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,3,2};
		
		System.out.println(Arrays.toString(arr));
		
		Set<Integer> s=new HashSet<>();
		
		for (int num : arr) {
			s.add(num);
		}
		int[] unique=new int[s.size()];
		int i=0;
		for (int obj : s) {
			unique[i++]=obj;	
		}
		
		System.out.println(Arrays.toString(unique));
	}

}
