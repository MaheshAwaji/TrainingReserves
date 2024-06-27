package com.te.LearnJava8.java8Features.functionalProgramming;

import java.util.Arrays;
import java.util.Comparator;

class CompareByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.getEmployee_Age() - o2.getEmployee_Age());
	}
}

class CompareById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.getEmployee_Id() - o2.getEmployee_Id());
	}

}

class CompareByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployee_name().compareTo(o2.getEmployee_name());

	}

}

public class CompareEmployees {
	public static void main(String[] args) {
		Employee[] employees = { new Employee(01, "Mahesh", 24), new Employee(05, "Suresh", 21),
				new Employee(03, "Akash", 25) };
		Arrays.sort(employees, new CompareByAge());
		System.out.println("Sorting Employees By Age using class");
		System.out.println();
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		System.out.println();

		System.out.println("Sorting Employees By Id using class");
		System.out.println();
		Arrays.sort(employees, new CompareById());
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		System.out.println();

		System.out.println("Sorting Employees By Name using class");
		System.out.println();
		Arrays.sort(employees, new CompareByName());
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		System.out.println();

		Comparator<Employee> compareByAge = (o1, o2) -> {
			return (o1.getEmployee_Age() - o2.getEmployee_Age());
		};

		Arrays.sort(employees, compareByAge);
		System.out.println("Sorting Employees By Age using LambdaExpression");
		System.out.println();
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		System.out.println();

		Comparator<Employee> compareByName = (o1, o2) -> {
			return o1.getEmployee_name().compareTo(o2.getEmployee_name());
		};
		Arrays.sort(employees, compareByName);
		System.out.println("Sorting Employees By Name using LambdaExpression");
		System.out.println();
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		System.out.println();

		Comparator<Employee> compareById = (o1, o2) -> {
			return o1.getEmployee_Id() - o2.getEmployee_Id();
		};
		Arrays.sort(employees, compareById);
		System.out.println("Sorting Employees By Id using LambdaExpression");
		System.out.println();
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

	}

}
