package com.te.LearnJava8.java8Features.functionalProgramming;

import java.util.Objects;

public class Employee {
	private int employee_Id;
	private String employee_name;
	private int employee_Age;
	public Employee() {
		super();
	}
	public Employee(int employee_Id, String employee_name, int employee_Age) {
		super();
		this.employee_Id = employee_Id;
		this.employee_name = employee_name;
		this.employee_Age = employee_Age;
	}
	public int getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getEmployee_Age() {
		return employee_Age;
	}
	public void setEmployee_Age(int employee_Age) {
		this.employee_Age = employee_Age;
	}
	@Override
	public String toString() {
		return "Employee [employee_Id=" + employee_Id + ", employee_name=" + employee_name + ", employee_Age="
				+ employee_Age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employee_Age, employee_Id, employee_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employee_Age == other.employee_Age && employee_Id == other.employee_Id
				&& Objects.equals(employee_name, other.employee_name);
	}
	
	
	

}
