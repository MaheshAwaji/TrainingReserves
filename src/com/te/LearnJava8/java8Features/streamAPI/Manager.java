package com.te.LearnJava8.java8Features.streamAPI;

import java.time.LocalDate;
import java.util.Objects;

public class Manager {
	private int manager_id;
	private String manager_name;
	private int manager_age;
	private String manager_department;
	private LocalDate manager_DateOfJoining;
	private double manager_Salary;

	public Manager() {
		super();
	}

	

	public Manager(int manager_id, String manager_name, int manager_age, String manager_department,
			LocalDate manager_DateOfJoining, double manager_Salary) {
		super();
		this.manager_id = manager_id;
		this.manager_name = manager_name;
		this.manager_age = manager_age;
		this.manager_department = manager_department;
		this.manager_DateOfJoining = manager_DateOfJoining;
		this.manager_Salary = manager_Salary;
	}



	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public int getManager_age() {
		return manager_age;
	}

	public void setManager_age(int manager_age) {
		this.manager_age = manager_age;
	}

	public String getManager_department() {
		return manager_department;
	}

	public void setManager_department(String manager_department) {
		this.manager_department = manager_department;
	}

	public LocalDate getManager_DateOfJoining() {
		return manager_DateOfJoining;
	}

	public void setManager_DateOfJoining(LocalDate manager_DateOfJoining) {
		this.manager_DateOfJoining = manager_DateOfJoining;
	}

	@Override
	public String toString() {
		return "Manager [manager_id=" + manager_id + ", manager_name=" + manager_name + ", manager_age=" + manager_age
				+ ", manager_department=" + manager_department + ", manager_DateOfJoining=" + manager_DateOfJoining
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(manager_DateOfJoining, manager_age, manager_department, manager_id, manager_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return Objects.equals(manager_DateOfJoining, other.manager_DateOfJoining) && manager_age == other.manager_age
				&& Objects.equals(manager_department, other.manager_department) && manager_id == other.manager_id
				&& Objects.equals(manager_name, other.manager_name);
	}

}
