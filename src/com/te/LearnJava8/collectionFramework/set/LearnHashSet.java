package com.te.LearnJava8.collectionFramework.set;

import java.util.HashSet;

public class LearnHashSet {
	public static void main(String[] args) {
		HashSet<Employee> employees = new HashSet<>();

		employees.add(new Employee("Mahesh", 01, 24));
		employees.add(new Employee("Sachin", 02, 25));
		employees.add(new Employee("Ramesh", 03, 23));
		employees.add(new Employee("Anand", 04, 27));
		employees.add(new Employee("Rakesh", 05, 23));
		employees.add(null);
		System.out.println(employees);
	}

}
