package com.te.LearnJava8.strings;

public class String1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str1="maheshAwaji";
		String s="maheshAwaji";
		System.out.println(str1==s);
		System.out.println();
		str1=str1.concat("Awaji");
		System.out.println(str1);
		String str2="Mahesh";
		String str5=str1.toLowerCase();
		String str6=str2.toUpperCase();
		System.out.println(str1==str2);
		System.out.println(str1==str5);
		
		
		String str3=new String("Mahesh");
		String str4=new String("Mahesh");
		
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		
		String info="My name is Mahesh Awaji";
		System.out.println(info.length());//length()
		
		System.out.println(info.charAt(0));//charAt(index value)
		
		System.out.println("substring(start index)"+info.substring(10));
		System.out.println("substring(start index,end index)"+info.substring(0,7));
		
		StringBuffer v=new StringBuffer();
		
	}

}
