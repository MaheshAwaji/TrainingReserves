package com.te.LearnJava8.oops.abstraction;

public class FirstMin {
	public static void main(String[] args) {
		int arr[] = { 8, 64, 32, 18, 5, 10, 90, 108 };

		int min = arr[0];
		int max = arr[0];
		int smin = arr[0];
		int smax=arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i]<min) {
				if (arr[i] < smin) {
					smin = arr[i];
				}
			}
			if (arr[i]<max) {
				if (arr[i] > smax) {
					smax = arr[i];
				}
			}
		}
		System.out.println("First Min:"+min);
		System.out.println("Second Min"+smin);
		System.out.println("First Max:"+max);
		System.out.println("Second Max:"+smax);
	}

}
