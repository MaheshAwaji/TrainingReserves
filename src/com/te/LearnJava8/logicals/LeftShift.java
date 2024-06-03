package com.te.LearnJava8.logicals;

import java.util.Arrays;

public class LeftShift {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int length = arr.length;
		int arr1[]=new int[length];
//		System.out.println(length);
		int n = 2;
		int m = 1;

		for (int i = 0; i <arr.length; i++) {
				arr1[i] = arr[i];
				n++;
				
		}
		
		

		System.out.println(Arrays.toString(arr1));
	}

}
