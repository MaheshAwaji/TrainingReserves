package com.te.LearnJava8.java8Features.streamAPI.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingInRange {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Alice", 90000, "Development", 30, Arrays.asList("Ecommerce", "Finance"), 2),
				new Employee(2, "Bob", 120000, "HR", 40, Arrays.asList("Recruitment", "Training"), 4),
				new Employee(3, "Charlie", 110000, "Marketing", 35, Arrays.asList("SEO", "Content Marketing"), 3),
				new Employee(4, "David", 95000, "Development", 28,
						Arrays.asList("Web Development", "Mobile Development"), 2),
				new Employee(5, "Eve", 130000, "Finance", 45, Arrays.asList("Investment Banking", "Corporate Finance"),
						5),
				new Employee(6, "Frank", 85000, "Customer Support", 32,
						Arrays.asList("Tech Support", "Customer Relations"), 1),
				new Employee(7, "Grace", 115000, "Development", 38,
						Arrays.asList("Backend Development", "API Development"), 4),
				new Employee(8, "Hank", 98000, "Development", 29, Arrays.asList("Frontend Development", "UI/UX Design"),
						1),
				new Employee(9, "Ivy", 150000, "Management", 50,
						Arrays.asList("Project Management", "Strategic Planning"), 6),
				new Employee(10, "Jack", 105000, "Development", 36, Arrays.asList("Database Management", "Security"),
						3));
		
//		Group employees first by department and then by their age range (e.g., 20-30, 31-40, etc.). Print the result in a nested map format
		Map<String, Map<String, List<Employee>>> groupedByDepartmentAndAgeRange = employees.stream()
	            .collect(Collectors.groupingBy(
	                Employee::getDepartment,
	                Collectors.groupingBy(employee -> {
	                    int age = employee.getAge();
	                    if (age >= 20 && age <= 30) return "20-30";
	                    if (age >= 31 && age <= 40) return "31-40";
	                    if (age >= 41 && age <= 50) return "41-50";
	                    if (age >= 51 && age <= 60) return "51-60";
	                    else return "60+";
	                })
	            ));
		 groupedByDepartmentAndAgeRange.forEach((department, ageRangeMap) -> {
	            System.out.println("Department: " + department);
	            ageRangeMap.forEach((ageRange, employeeList) -> {
	                System.out.println("  Age Range: " + ageRange);
	                employeeList.forEach(employee -> System.out.println("    " + employee));
	            });
	        });

	}

}
