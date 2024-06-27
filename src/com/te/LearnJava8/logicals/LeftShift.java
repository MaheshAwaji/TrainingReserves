package com.te.LearnJava8.logicals;

import java.util.Arrays;

public class LeftShift {
	public static int[] rightShift(int[] arr,int n) {
		int length=arr.length;
		int[] ra=new int[length];
		
		for(int i=0;i<length;i++) {
			ra[i]=arr[(i+n)%length];
		}
		return ra;
		
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5};
		int n = 2;
//		int[] ra=rightShift(arr, n);

		for(int i=0;i<n;i++) {
			int last=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println(Arrays.toString(arr));
	}

}
