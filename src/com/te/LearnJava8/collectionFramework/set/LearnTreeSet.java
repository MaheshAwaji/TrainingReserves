package com.te.LearnJava8.collectionFramework.set;

import java.util.TreeSet;

public class LearnTreeSet {
	public static void main(String[] args) {
		CompareBasedOnAge age=new CompareBasedOnAge();
		CompareBasedOnName basedOnName=new CompareBasedOnName();
		TreeSet<Employee> employees=new TreeSet<>();
		employees.add(new Employee("Mahesh", 01, 25));
		employees.add(new Employee("Mahesh", 01, 25));
		employees.add(new Employee("Suresh", 04, 28));
		employees.add(new Employee("Akash", 06, 26));
		employees.add(new Employee("Ramesh", 20, 23));
		
		TreeSet<Employee> employees2=new TreeSet<>(age);
		employees2.addAll(employees);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("--------------------------------------------");
		TreeSet<Employee> employees3=new TreeSet<>(basedOnName);
		employees3.addAll(employees);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}

}
