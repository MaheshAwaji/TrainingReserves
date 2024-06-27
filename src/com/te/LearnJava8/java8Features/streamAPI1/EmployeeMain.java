package com.te.LearnJava8.java8Features.streamAPI1;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(
				new Employee(01, "Mahesh", "Development", "Developer", 25, 2, 90000, 3, true, LocalDate.of(2022, 05, 12)),
				new Employee(02, "Suresh", "Testing", "Test Engineer", 27, 3, 300000, 4, false, LocalDate.of(2021, 06, 11)),
				new Employee(03, "Pooja", "HR", "Manager", 30, 8, 900000, 5, true, LocalDate.of(2016, 05, 13)),
				new Employee(07, "Akash", "Development", "Manager", 28, 4, 300000, 4, false, LocalDate.of(2023, 02, 10)),
				new Employee(20, "Umesh", "Testing", "Senior Test Engineer", 30, 10, 50000, 4, false, LocalDate.of(2014, 05, 12)),
				new Employee(8, "Shiva", "Development", "Manager", 35, 2, 400000, 3, true, LocalDate.of(2022, 05, 12)),
				new Employee(9, "Mahesh", "Development", "Developer", 25, 2, 200000, 3, true, LocalDate.of(2022, 05, 12))
				);
		
		List<Employee> sortedEmployees = employees.stream().filter(employee->(employee.getEmployee_Salary()>=100000
				&&employee.getEmployee_JobTitle()=="Manager"
				&&(LocalDate.now().getYear()-employee.getEmployee_dateOfJoining().getYear())<=3))
		         .sorted(Comparator.comparingInt(Employee::getEmployee_experience).reversed()
		        		 .thenComparing(Employee::getEmployee_Performance))
		         .collect(Collectors.toList());
		
		
		sortedEmployees.forEach(employee->System.out.println(employee.getEmployee_Name().toUpperCase()));
		
		
		
		
		
	}

}
