package com.te.LearnJava8.logicals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class Sort {
	public static void main(String[] args) {
		int[] arr= {3,4,5,6,2,4};
		
		System.out.println(Arrays.toString(arr));
//		int start=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if (arr[j]<arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
