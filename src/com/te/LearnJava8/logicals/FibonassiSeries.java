package com.te.LearnJava8.logicals;

public class FibonassiSeries {
	public static void main(String[] args) {
		int end = 10;
		int first = 0;
		int second = 1;
		int third = 0;

		System.out.print(first + " ");
		System.out.print(second + " ");

		while (end >= 0) {
			third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
			end--;

		}

	}

}
