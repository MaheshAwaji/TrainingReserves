package com.te.LearnJava8.java9To17Features;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class Learn1 {
	public static void main(String[] args) {
		String str="i am learning advance java features ";
		System.out.println(StringUtils.trimToNull(str));
		System.out.println(StringUtils.isBlank(str));
		System.out.println(StringUtils.capitalize(str));
		
		
		
		String[] arr= {"M","A","H","E","S","H"};
		System.out.println(StringUtils.join(arr, ""));
		System.out.println(StringUtils.substringBefore(str, "java"));
		
		//Number Utils
		String str1="1234r";
		
		System.out.println(NumberUtils.isCreatable(str1));
		int n=NumberUtils.toInt(str1);
		System.out.println(n);
		
		//Array utils
		System.out.println(ArrayUtils.contains(arr, "M"));
		System.out.println("Array to String "+ArrayUtils.toString(arr));
	}

}
