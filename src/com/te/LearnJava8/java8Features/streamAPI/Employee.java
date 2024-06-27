package com.te.LearnJava8.java8Features.streamAPI;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private int employee_id;
	private String employee_name;
	private int employee_age;
	private String dept_name;
	private double employee_salary;
	private LocalDate employee_joiningDate;

	public Employee() {
		super();
	}

	public Employee(int employee_id, String employee_name, int employee_age, String dept_name, double employee_salary,
			LocalDate employee_joiningDate) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_age = employee_age;
		this.dept_name = dept_name;
		this.employee_salary = employee_salary;
		this.employee_joiningDate = employee_joiningDate;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public int getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_age(int employee_age) {
		this.employee_age = employee_age;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public double getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}

	public LocalDate getEmployee_joiningDate() {
		return employee_joiningDate;
	}

	public void setEmployee_joiningDate(LocalDate employee_joiningDate) {
		this.employee_joiningDate = employee_joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_age="
				+ employee_age + ", dept_name=" + dept_name + ", employee_salary=" + employee_salary
				+ ", employee_joiningDate=" + employee_joiningDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept_name, employee_age, employee_id, employee_joiningDate, employee_name, employee_salary);
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
		return Objects.equals(dept_name, other.dept_name) && employee_age == other.employee_age
				&& employee_id == other.employee_id && Objects.equals(employee_joiningDate, other.employee_joiningDate)
				&& Objects.equals(employee_name, other.employee_name)
				&& Double.doubleToLongBits(employee_salary) == Double.doubleToLongBits(other.employee_salary);
	}

}
