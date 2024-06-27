package com.te.LearnJava8.logicals;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {1,3,5,3,2,7,0,7};
		searchElement(arr, 7);
		
	}
	
	public static void searchElement(int arr[],int target) {
		int ans=-1;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==target) {
				ans=i;	
			}
		}
		if (ans==-1) {
			System.out.println(target+" is not present");
			
		}else {
			System.out.println(target+" is present on index "+ans);
		}
		
		
	}

}
