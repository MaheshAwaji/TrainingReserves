package com.te.LearnJava8.logicals;

import java.util.Arrays;

public class ArrangeZero {
	public static void main(String[] args) {
		int[] arr= {3,0,1,4,7,0,8,9};
		System.out.println(Arrays.toString(arr));
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]!=0) {
				arr[index]=arr[i];
				index++;
				
			}
		}
		while (index<arr.length) {
			arr[index]=0;
			index++;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
