package com.te.LearnJava8.logicals;

public class FirstMin {
	public static void main(String[] args) {
		int arr[] = { 8, 64, 32, 18, 5, 10, 90, 108 };

		int min = Integer.MAX_VALUE;
//		int min=arr[0];
		int max = Integer.MIN_VALUE;
//		int max = arr[0];
//		int smin = arr[0];
//		int smax=arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
//			if (min>arr[i]) {
//				min=arr[i];
//			}
//			if (max<arr[i]) {
//				max=arr[i];	
//			}
		}
		System.out.println("First Min:" + min);
		System.out.println("First Max:" + max);
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i]<min) {
//				if (arr[i] < smin) {
//					smin = arr[i];
//				}
//			}
//			if (arr[i]<max) {
//				if (arr[i] > smax) {
//					smax = arr[i];
//				}
//			}
//		}

//		System.out.println("Second Min:"+smin);
//		
//		System.out.println("Second Max:"+smax);
	}
}
