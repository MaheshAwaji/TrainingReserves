package com.te.LearnJava8.logicals;

import java.util.Arrays;


public class ArrangeZeroMiddle {
	public static void main(String[] args) {
		int[] arr= {1,0,3,6,7,0,9,7};
		int countZero=0;
		int nonZeroIndex=0;
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==0) {
				countZero++;
				
			}
		}
		int startZeroIndex=(arr.length-countZero)/2;
		int[] result=new int[arr.length];
		for (int i : arr) {
			if (i!=0) {
				if (nonZeroIndex<startZeroIndex) {
					result[nonZeroIndex]=i;
				}else {
					result[nonZeroIndex+countZero]=i;
				}
				nonZeroIndex++;
			}	
		}
		
		for(int i=startZeroIndex;i<startZeroIndex+countZero;i++) {
			result[i]=0;
		}
		
		System.out.println(Arrays.toString(result));
		
		
		
	}

}
