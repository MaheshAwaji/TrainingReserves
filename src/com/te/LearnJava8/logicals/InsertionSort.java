package com.te.LearnJava8.logicals;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 3, 8, 9, 2, 1, };

		insertionSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			// shifting logic
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			// placing the key
			arr[j + 1] = key;
		}
	}

}
