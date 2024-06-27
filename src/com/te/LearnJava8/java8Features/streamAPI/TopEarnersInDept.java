package com.te.LearnJava8.java8Features.streamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopEarnersInDept {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(02, "mahesh", 25, "Development", 40000, LocalDate.of(2018, 7, 17)),
				new Employee(03, "suresh", 26, "Testing", 26000, LocalDate.of(2017, 6, 18)),
				new Employee(01, "akash", 31, "Testing", 29000, LocalDate.of(2019, 9, 20)),
				new Employee(05, "ramesh", 35, "Human Resource", 25000, LocalDate.of(2023, 10, 25)),
				new Employee(06, "vijay", 32, "Development", 30000, LocalDate.of(2022, 07, 17)));
		
		
		Map<String, List<Employee>> employeeByDept = employees.stream()
				.collect(Collectors.groupingBy(employee->employee.getDept_name()));
		
		employeeByDept.forEach((department,empList)->{
			System.out.println("Employees of "+department);
			empList.stream().sorted((e1,e2)->Double.compare(e2.getEmployee_salary(), e1.getEmployee_salary()))
			.forEach(employee->System.out.println(employee));
			
		});
	}

}
