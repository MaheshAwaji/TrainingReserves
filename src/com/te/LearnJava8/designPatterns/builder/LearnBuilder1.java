package com.te.LearnJava8.designPatterns.builder;

import java.time.LocalDate;

public class LearnBuilder1 {
	
	private int emp_Id;
	private String emp_Name;
	private double emp_Salary;
	private String emp_Address;
	private long emp_MobileNumber;
	private LocalDate emp_DOB;
	private boolean emp_MaritalStatus;
	private int emp_Age;
	public int getEmp_Id() {
		return emp_Id;
	}
	public LearnBuilder1 setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
		return this;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public LearnBuilder1 setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
		return this;
	}
	public double getEmp_Salary() {
		return emp_Salary;
	}
	public LearnBuilder1 setEmp_Salary(double emp_Salary) {
		this.emp_Salary = emp_Salary;
		return this;
	}
	public String getEmp_Address() {
		return emp_Address;
	}
	public LearnBuilder1 setEmp_Address(String emp_Address) {
		this.emp_Address = emp_Address;
		return this;
	}
	public long getEmp_MobileNumber() {
		return emp_MobileNumber;
	}
	public LearnBuilder1 setEmp_MobileNumber(long emp_MobileNumber) {
		this.emp_MobileNumber = emp_MobileNumber;
		return this;
	}
	public LocalDate getEmp_DOB() {
		return emp_DOB;
	}
	public LearnBuilder1 setEmp_DOB(LocalDate emp_DOB) {
		this.emp_DOB = emp_DOB;
		return this;
	}
	public boolean isEmp_MaritalStatus() {
		return emp_MaritalStatus;
	}
	public LearnBuilder1 setEmp_MaritalStatus(boolean emp_MaritalStatus) {
		this.emp_MaritalStatus = emp_MaritalStatus;
		return this;
	}
	public int getEmp_Age() {
		return emp_Age;
	}
	public LearnBuilder1 setEmp_Age(int emp_Age) {
		this.emp_Age = emp_Age;
		return this;
	}
	
	public Employee build() {
		return new Employee(emp_Id, emp_Name, emp_Salary, emp_Address, emp_MobileNumber, emp_DOB, emp_MaritalStatus, emp_Age);
		
	}
	
	

}
