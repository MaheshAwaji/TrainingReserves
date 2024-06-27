package com.te.LearnJava8.collectionFramework.logics;

import java.util.TreeSet;

public class Anagrams {
	public static void main(String[] args) {
		String str="Maahesh";
		String str1="sheehMa";
		
		if (str.length()==str1.length()) {
			TreeSet<Character> set1=new TreeSet<Character>();
			TreeSet<Character> set2=new TreeSet<Character>();
			for(int i=0;i<str.length();i++) {
				set1.add(str.charAt(i));
				set2.add(str1.charAt(i));
			}
			
			System.out.println(set1);
			System.out.println(set2);
			
		}else {
			System.out.println("Not Anagrams");
		}
		
	
		
		
	}

}
