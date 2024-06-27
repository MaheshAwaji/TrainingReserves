package com.te.LearnJava8.java8Features.streamAPI1;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private int employee_Id;
	private String employee_Name;
	private String employee_department;
	private String employee_JobTitle;
	private int employee_Age;
	private int employee_experience;
	private double employee_Salary;
	private int employee_Performance;
	private boolean employee_isMarried;
	private LocalDate employee_dateOfJoining;
	public Employee() {
		super();
	}
	public Employee(int employee_Id, String employee_Name, String employee_department, String employee_JobTitle,
			int employee_Age, int employee_experience, double employee_Salary, int employee_Performance,
			boolean employee_isMarried, LocalDate employee_dateOfJoining) {
		super();
		this.employee_Id = employee_Id;
		this.employee_Name = employee_Name;
		this.employee_department = employee_department;
		this.employee_JobTitle = employee_JobTitle;
		this.employee_Age = employee_Age;
		this.employee_experience = employee_experience;
		this.employee_Salary = employee_Salary;
		this.employee_Performance = employee_Performance;
		this.employee_isMarried = employee_isMarried;
		this.employee_dateOfJoining = employee_dateOfJoining;
	}
	public int getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public String getEmployee_department() {
		return employee_department;
	}
	public void setEmployee_department(String employee_department) {
		this.employee_department = employee_department;
	}
	public String getEmployee_JobTitle() {
		return employee_JobTitle;
	}
	public void setEmployee_JobTitle(String employee_JobTitle) {
		this.employee_JobTitle = employee_JobTitle;
	}
	public int getEmployee_Age() {
		return employee_Age;
	}
	public void setEmployee_Age(int employee_Age) {
		this.employee_Age = employee_Age;
	}
	public int getEmployee_experience() {
		return employee_experience;
	}
	public void setEmployee_experience(int employee_experience) {
		this.employee_experience = employee_experience;
	}
	public double getEmployee_Salary() {
		return employee_Salary;
	}
	public void setEmployee_Salary(double employee_Salary) {
		this.employee_Salary = employee_Salary;
	}
	public int getEmployee_Performance() {
		return employee_Performance;
	}
	public void setEmployee_Performance(int employee_Performance) {
		this.employee_Performance = employee_Performance;
	}
	public boolean isEmployee_isMarried() {
		return employee_isMarried;
	}
	public void setEmployee_isMarried(boolean employee_isMarried) {
		this.employee_isMarried = employee_isMarried;
	}
	public LocalDate getEmployee_dateOfJoining() {
		return employee_dateOfJoining;
	}
	public void setEmployee_dateOfJoining(LocalDate employee_dateOfJoining) {
		this.employee_dateOfJoining = employee_dateOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [employee_Id=" + employee_Id + ", employee_Name=" + employee_Name + ", employee_department="
				+ employee_department + ", employee_JobTitle=" + employee_JobTitle + ", employee_Age=" + employee_Age
				+ ", employee_experience=" + employee_experience + ", employee_Salary=" + employee_Salary
				+ ", employee_Performance=" + employee_Performance + ", employee_isMarried=" + employee_isMarried
				+ ", employee_dateOfJoining=" + employee_dateOfJoining + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employee_Age, employee_Id, employee_JobTitle, employee_Name, employee_Performance,
				employee_Salary, employee_dateOfJoining, employee_department, employee_experience, employee_isMarried);
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
				&& Objects.equals(employee_JobTitle, other.employee_JobTitle)
				&& Objects.equals(employee_Name, other.employee_Name)
				&& employee_Performance == other.employee_Performance
				&& Double.doubleToLongBits(employee_Salary) == Double.doubleToLongBits(other.employee_Salary)
				&& Objects.equals(employee_dateOfJoining, other.employee_dateOfJoining)
				&& Objects.equals(employee_department, other.employee_department)
				&& employee_experience == other.employee_experience && employee_isMarried == other.employee_isMarried;
	}
	
	

}
