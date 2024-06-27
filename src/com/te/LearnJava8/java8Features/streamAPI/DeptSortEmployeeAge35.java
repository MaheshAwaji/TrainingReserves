package com.te.LearnJava8.java8Features.streamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeptSortEmployeeAge35 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(02, "mahesh", 25, "Development", 40000, LocalDate.of(2018, 7, 17)),
				new Employee(03, "suresh", 26, "Testing", 26000, LocalDate.of(2024, 6, 18)),
				new Employee(01, "Salman", 35, "Development", 50000, LocalDate.of(2020, 8, 21)),
				new Employee(04, "Akshay", 40, "Testing", 55000, LocalDate.of(2021, 5, 13)),
				new Employee(07, "Sita", 31, "Human Resource", 35000, LocalDate.of(2023, 3, 11)),
				new Employee(8, "akash", 31, "Testing", 60000, LocalDate.of(2022, 9, 20)),
				new Employee(05, "ramesh", 35, "Human Resource", 25000, LocalDate.of(2023, 10, 25)),
				new Employee(06, "vijay", 32, "Development", 30000, LocalDate.of(2022, 07, 17)));
		
		
		Map<String, List<Employee>> groupByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept_name));
		groupByDept.forEach((dept,eList)->{
			long count = eList.stream().filter(employee->employee.getEmployee_age()>=35).count();
			System.out.println("Employees present in dept "+dept+" are "+count);
		});
	}

}
