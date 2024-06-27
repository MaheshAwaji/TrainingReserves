package com.te.LearnJava8.logicals;


public class CountCharInString {
	public static void main(String[] args) {
		String s="xxxxyyyaaacccxxaa";
		String newString="";
		
		int count=1;
		for(int i=1;i<s.length();i++) {
			if (s==null || s.length()==0) {
				newString+=" ";
				
			}
			
			if (s.charAt(i)==s.charAt(i-1)) {
				count++;
			}else {
				newString+=s.charAt(i-1)+String.valueOf(count);
				count=1;
			}
			
		}
		newString+=s.charAt(s.length()-1)+String.valueOf(count);
		System.out.println(newString);
	}

}
