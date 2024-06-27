package com.te.LearnJava8.logicals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter Array Element at "+i);
			arr[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		deleteElement(arr, 4);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static void deleteElement(int arr[],int pos) {
		for(int i=pos;i<=arr.length-2;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
	}

}
