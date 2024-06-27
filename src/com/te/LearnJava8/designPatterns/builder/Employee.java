package com.te.LearnJava8.designPatterns.builder;

import java.time.LocalDate;

public class Employee {
	
	private int emp_Id;
	private String emp_Name;
	private double emp_Salary;
	private String emp_Address;
	private long emp_MobileNumber;
	private LocalDate emp_DOB;
	private boolean emp_MaritalStatus;
	private int emp_Age;
	public Employee() {
		super();
	}
	public Employee(int emp_Id, String emp_Name, double emp_Salary, String emp_Address, long emp_MobileNumber,
			LocalDate emp_DOB, boolean emp_MaritalStatus, int emp_Age) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Salary = emp_Salary;
		this.emp_Address = emp_Address;
		this.emp_MobileNumber = emp_MobileNumber;
		this.emp_DOB = emp_DOB;
		this.emp_MaritalStatus = emp_MaritalStatus;
		this.emp_Age = emp_Age;
	}
	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", emp_Salary=" + emp_Salary + ", emp_Address="
				+ emp_Address + ", emp_MobileNumber=" + emp_MobileNumber + ", emp_DOB=" + emp_DOB
				+ ", emp_MaritalStatus=" + emp_MaritalStatus + ", emp_Age=" + emp_Age + "]";
	}
	
	

}
