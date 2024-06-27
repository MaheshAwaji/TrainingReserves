package com.te.LearnJava8.mock1;

;

public class CountChar {
	public static void main(String[] args) {
		String str = "aaabbcbbbccca";
		
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}else {
					
				}
			}
			newString = newString + ch + count;
		}
		System.out.println(newString);
	}

}
