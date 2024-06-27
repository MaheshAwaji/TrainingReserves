package com.te.LearnJava8.strings;

public class String2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s1="Java";
		String s2=new String(s1);
		String s3="Java";
		String s4="Java";
		String s5="Java";
		String s6=s2.toLowerCase();
		String s7=s3.toUpperCase();
		String s8="JAVA";
		
		System.out.println(s7==s8);
		System.out.println(s7.equals(s8));
	}

}
