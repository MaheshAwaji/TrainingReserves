package com.te.LearnJava8.java8Features.streamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageTotalByDept {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(02, "mahesh", 25, "Development", 40000, LocalDate.of(2018, 7, 17)),
				new Employee(03, "suresh", 26, "Testing", 26000, LocalDate.of(2017, 6, 18)),
				new Employee(01, "akash", 27, "Testing", 29000, LocalDate.of(2019, 9, 20)),
				new Employee(05, "ramesh", 25, "Human Resource", 25000, LocalDate.of(2022, 10, 25)),
				new Employee(06, "vijay", 25, "Development", 30000, LocalDate.of(2023, 07, 17)));
		
		Map<String, Double> averageSalByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept_name,Collectors.averagingDouble(Employee::getEmployee_salary)));
		
		System.out.println("Average Salary of Employees by Dept "+averageSalByDept);
		
		Map<String, Double> totalSalByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept_name,Collectors.summingDouble(Employee::getEmployee_salary)));
		
		System.out.println("Total Salary of Employees by Dept "+totalSalByDept);
		

		
		Map<String, List<Employee>> groupByDepartment = employees.stream()
				.collect(Collectors.groupingBy(employee->employee.getDept_name()));
		Map<Object, Long> groupByDepartment1 = employees.stream()
				.collect(Collectors.groupingBy(employee->employee.getDept_name(),Collectors.counting()));
		
		groupByDepartment.forEach((department,empList)->{
			
			
			double totalSalary=empList.stream()
					.map(employee->employee.getEmployee_salary())
					.reduce(0.0,(a,b)->a+b);
			System.out.println("Total Salary of "+department+"="+totalSalary);
			System.out.println("Average Salary of "+department+"="+totalSalary/groupByDepartment1.getOrDefault(department, 0L));
			
		});
		
		 
		
	}

}
