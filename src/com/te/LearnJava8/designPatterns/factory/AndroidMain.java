package com.te.LearnJava8.designPatterns.factory;

import java.util.Scanner;

public class AndroidMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OS Type:");
		String osType=sc.next();
		AndroidOS color = OsFactory.getOs(osType);
		color.performance();
		color.security();
		color.ui();
	}

}
