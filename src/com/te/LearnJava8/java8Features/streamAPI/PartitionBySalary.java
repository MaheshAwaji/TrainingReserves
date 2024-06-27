package com.te.LearnJava8.java8Features.streamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBySalary {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(02, "mahesh", 25, "Development", 40000, LocalDate.of(2018, 7, 17)),
				new Employee(03, "suresh", 26, "Testing", 26000, LocalDate.of(2017, 6, 18)),
				new Employee(01, "Salman", 35, "Development", 50000, LocalDate.of(2020, 8, 21)),
				new Employee(01, "Akshay", 40, "Testing", 55000, LocalDate.of(2021, 5, 13)),
				new Employee(01, "Sita", 31, "Human Resource", 35000, LocalDate.of(2023, 3, 11)),
				new Employee(01, "akash", 31, "Testing", 60000, LocalDate.of(2019, 9, 20)),
				new Employee(05, "ramesh", 35, "Human Resource", 25000, LocalDate.of(2023, 10, 25)),
				new Employee(06, "vijay", 32, "Development", 30000, LocalDate.of(2022, 07, 17)));
		
		Map<Boolean, List<Employee>> partitionBasedOnSalary = employees.stream()
				.collect(Collectors.partitioningBy(employee->employee.getEmployee_salary()>50000));
		Double averageAge = partitionBasedOnSalary.get(true).stream()
				.collect(Collectors.averagingLong(Employee::getEmployee_age));
		System.out.println("Average Age of Employees whose salary is greater than 50000 is "+averageAge);
		System.out.println("Total Employees whose salary is greater than 50000 is "
		+partitionBasedOnSalary.get(true).stream().count());
		System.out.println();
		
		
		Double averageAge1 = partitionBasedOnSalary.get(false).stream()
				.collect(Collectors.averagingLong(Employee::getEmployee_age));
		System.out.println("Average Age of Employees whose salary is less than 50000 is "+averageAge1);
		System.out.println("Total Employees whose salary is greater than 50000 is "
		+partitionBasedOnSalary.get(false).stream().count());
		
		

		
	}

}
