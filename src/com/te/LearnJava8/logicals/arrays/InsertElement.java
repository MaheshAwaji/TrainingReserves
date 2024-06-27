package com.te.LearnJava8.logicals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter Array Elements");
		for(int i=0;i<3;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		insert(arr,0,10);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static void insert(int arr[],int pos,int element) {
		int size=arr.length;
		
		if (pos<0 || pos>=size-1) {
			System.out.println("Enter proper Array");
			return;	
		}
		for(int i=size-2;i>=pos;i--) {
			arr[i+1]=arr[i];
		}
		arr[pos]=element;
		
	}

}
