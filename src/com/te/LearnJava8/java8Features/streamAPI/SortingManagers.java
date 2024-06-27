package com.te.LearnJava8.java8Features.streamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class SortingManagers {
	public static void main(String[] args) {
		List<Manager> managers = Arrays.asList(
				new Manager(01, "Mahesh", 25, "Development", LocalDate.of(2022, 07, 11),1000000),
				new Manager(03, "Ramesh", 30, "Testing", LocalDate.of(2019, 8, 13),50000),
				new Manager(02, "Akash", 34, "SalesForce", LocalDate.of(2023, 6, 13),200000),
				new Manager(06, "Akshay", 30, "Testing", LocalDate.of(2016, 05, 10),150000),
				new Manager(8, "Vijay", 27, "Development", LocalDate.of(2019, 4, 04),120000),
				new Manager(9, "Ajay", 23, "SalesForce", LocalDate.of(2018, 02, 21),300000),
				new Manager(10, "Pooja", 38, "Testing", LocalDate.of(2015, 07, 19),400000));
		
		
		
	}

}
