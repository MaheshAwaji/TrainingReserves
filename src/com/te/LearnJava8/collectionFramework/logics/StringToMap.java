package com.te.LearnJava8.collectionFramework.logics;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringToMap {
	public static void main(String[] args) {
		String str="aaabbbcccddaa";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				if (ch==str.charAt(j)) {
					count++;	
				}
			}
			map.put(ch, count);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}
	}

}
