package com.te.LearnJava8.collectionFramework.logics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Anagrams {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}

	}

	public static boolean areAnagrams(String str1, String str2) {
		// If lengths are not the same, they cannot be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Create frequency maps for both strings
		Map<Character, Integer> frequencyMap1 = new HashMap<>();
		Map<Character, Integer> frequencyMap2 = new HashMap<>();

		// Populate the frequency maps
		for (char c : str1.toCharArray()) {
			frequencyMap1.put(c, frequencyMap1.getOrDefault(c, 0) + 1);
		}
		for (char c : str2.toCharArray()) {
			frequencyMap2.put(c, frequencyMap2.getOrDefault(c, 0) + 1);
		}
		System.out.println(frequencyMap1);
		System.out.println(frequencyMap2);
		// Compare the frequency maps
		return frequencyMap1.equals(frequencyMap2);
	}

}
