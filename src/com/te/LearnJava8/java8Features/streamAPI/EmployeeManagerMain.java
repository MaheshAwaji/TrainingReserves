package com.te.LearnJava8.java8Features.streamAPI;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeManagerMain {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(02, "mahesh", 25, "Development", 40000, LocalDate.of(2018, 7, 17)),
				new Employee(03, "suresh", 26, "Testing", 26000, LocalDate.of(2017, 6, 18)),
				new Employee(01, "akash", 27, "Testing", 29000, LocalDate.of(2019, 9, 20)),
				new Employee(05, "ramesh", 25, "Human Resource", 25000, LocalDate.of(2022, 10, 25)),
				new Employee(06, "vijay", 25, "Development", 30000, LocalDate.of(2023, 07, 17)));

		List<Manager> managers = Arrays.asList(
				new Manager(01, "Mahesh", 25, "Development", LocalDate.of(2022, 07, 11),1000000),
				new Manager(03, "Ramesh", 30, "Testing", LocalDate.of(2019, 8, 13),50000),
				new Manager(02, "Akash", 34, "SalesForce", LocalDate.of(2023, 6, 13),200000),
				new Manager(06, "Akshay", 30, "Testing", LocalDate.of(2016, 05, 10),150000),
				new Manager(8, "Vijay", 27, "Development", LocalDate.of(2019, 4, 04),120000),
				new Manager(9, "Ajay", 23, "SalesForce", LocalDate.of(2018, 02, 21),300000),
				new Manager(10, "Pooja", 38, "Testing", LocalDate.of(2015, 07, 19),400000));

//		LocalDate currentDate = LocalDate.now();
//		for (Employee employee : employees) {
//			int experience = Period.between(employee.getEmployee_joiningDate(), currentDate).getYears();
//			if (experience >= 2) {
//				double currentSal = employee.getEmployee_salary();
//				employee.setEmployee_salary(employee.getEmployee_salary() * 1.5);
//			} else {
//				employee.setEmployee_salary(employee.getEmployee_salary() * 1.2);
//			}
//		}

//		Consumer<Employee> increaseSal=(employee)->{
//			if ((LocalDate.now().getYear()-employee.getEmployee_joiningDate().getYear())>=2) {
//				employee.setEmployee_salary(employee.getEmployee_salary()*1.5);
//			}else {
//				employee.setEmployee_salary(employee.getEmployee_salary()*1.2);
//			}
//			
//		};

		employees.stream().forEach(employee -> {
			if (LocalDate.now().getYear() - employee.getEmployee_joiningDate().getYear() >= 2) {
				employee.setEmployee_salary(employee.getEmployee_salary() * 1.5);

			} else {
				employee.setEmployee_salary(employee.getEmployee_salary() * 1.2);
			}
		});

		for (Employee employee2 : employees) {
			System.out.println(employee2);

		}

	}

}
