package com.te.LearnJava8.designPatterns.builder;

public class BuilderMain {
	public static void main(String[] args) {
		Employee employee1 = new LearnBuilder1().setEmp_Id(2).setEmp_Name("Mahesh").build();
		System.out.println(employee1);
	}

}
