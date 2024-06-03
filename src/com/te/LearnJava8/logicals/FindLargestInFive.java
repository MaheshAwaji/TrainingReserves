package com.te.LearnJava8.logicals;

public class FindLargestInFive {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		
//		if (a>b && a>c && a>d && a>e) {
//			System.out.println(a);	
//		} else if(b>c && b>d && b>e) {
//			System.out.println(b);
//		}else if(c>d && c>e) {
//			System.out.println(c);
//		}else if(d>e) {
//			System.out.println(d);
//		}else {
//			System.out.println(e);
//		}
		
		int max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		if(d>max) {
			max=d;
		}
		if(e>max) {
			max=e;
		}
		System.out.println("Greater number is "+max);
		
		int res=(a>b && a>c && a>d && a>e)?a
				:(b>c && b>d && b>e)?b
						:(c>d && c>e)?c
								:(d>e)?d
										:e;
		
		System.out.println("Greater number is "+res);
		
		
		
		
		
	}

}
