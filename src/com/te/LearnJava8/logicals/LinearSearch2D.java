package com.te.LearnJava8.logicals;

public class LinearSearch2D {

	public static void main(String[] args) {
		int[][] arr= {
				{21,40,59,68,33},
				{6,42,32,52,34},
				{3,34,21,32,78},
				{12,34,2,67,89},
				{2,44,75,69,36,},
		};
		
		linearSearch2D(arr, 21,true);
		
	}
	
	public static void linearSearch2D(int arr[][],int target,boolean lastIndex ) {
		int outerIndex=-1;
		int innerIndex=-1;
		
		for(int i=0;i<arr.length;i++) {
			boolean found=false;
			for(int j=0;j<arr[i].length;j++) {
				if (arr[i][j]==target) {
					outerIndex=i;
					innerIndex=j;
					if (lastIndex==false) {
						found=true;
						
					}
					
				}
				
			}
			if (found==true) {
				break;
				
			}
		}
		
		System.out.println(outerIndex+","+innerIndex);
		
	}

}
