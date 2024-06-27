package com.te.LearnJava8.logicals;

import java.util.HashSet;
import java.util.Set;

public class FrequencyOfNumber {
	public static void main(String[] args) {
		int n = 12345678;
		int temp = n;
		Set<Integer> processed = new HashSet<>();
		while (n != 0) {

			int rem = n % 10;
			if (processed.contains(rem)) {
				continue;
			}
			System.out.println(rem + " present " + getCount(temp, rem) + " times");
			processed.add(rem);
			n = n / 10;
	
		}

	}

	private static int getCount(int n, int rem) {

		int count = 0;
		while (n != 0) {

			int r = n % 10;
			if (r == rem) {
				count++;
			}
			n = n / 10;
		}
		return count;

	}

}
