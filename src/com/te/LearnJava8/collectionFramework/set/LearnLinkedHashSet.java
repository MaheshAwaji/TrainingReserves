package com.te.LearnJava8.collectionFramework.set;

import java.util.LinkedHashSet;

public class LearnLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Employee> employees=new LinkedHashSet<>();
		
		employees.add(new Employee("Mahesh", 01, 23));
		employees.add(new Employee("Ramesh", 02, 24));
		employees.add(new Employee("Suresh", 03, 25));
		employees.add(new Employee("Akash", 04, 27));
		employees.add(null);
		employees.add(null);
		
		System.out.println(employees);
	}

}
