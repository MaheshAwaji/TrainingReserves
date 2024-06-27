package com.te.LearnJava8.logicals;

import java.util.Arrays;

public class MisteryOfReapeatingDecimals {
	public static void main(String[] args) {
		float num=1;
		float deno=3;
		
		float result=num/deno;
		String s=String.valueOf(result);
		String[] seperateFromDeci=s.split("\\.");
		
		String s1=seperateFromDeci[1];
		String newString="";
		newString=newString+seperateFromDeci[0]+".";
		System.out.println(newString);
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			int count=0;
			for(int j=0;j<s1.length();j++) {
				if (ch==s1.charAt(j)) {
					count++;
					
				}
			}
			if (count>1) {
				newString=newString+"("+ch+")";
				
			}else {
				newString=newString+ch;
			}
		}
		System.out.println(newString);
		System.out.println(Arrays.toString(seperateFromDeci));
		System.out.println(s1);
	}

}
