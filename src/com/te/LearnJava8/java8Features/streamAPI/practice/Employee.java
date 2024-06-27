package com.te.LearnJava8.java8Features.streamAPI.practice;

import java.util.List;
import java.util.Objects;

public class Employee {
	 private int id;
	    private String name;
	    private double salary;
	    private String department;
	    private int age;
	    private List<String> projects;
	    private int performanceRating;
		public Employee() {
			super();
		}
		public Employee(int id, String name, double salary, String department, int age, List<String> projects,
				int performanceRating) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.department = department;
			this.age = age;
			this.projects = projects;
			this.performanceRating = performanceRating;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public List<String> getProjects() {
			return projects;
		}
		public void setProjects(List<String> projects) {
			this.projects = projects;
		}
		public int getPerformanceRating() {
			return performanceRating;
		}
		public void setPerformanceRating(int performanceRating) {
			this.performanceRating = performanceRating;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
					+ ", age=" + age + ", projects=" + projects + ", performanceRating=" + performanceRating + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(age, department, id, name, performanceRating, projects, salary);
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
			return age == other.age && Objects.equals(department, other.department) && id == other.id
					&& Objects.equals(name, other.name) && performanceRating == other.performanceRating
					&& Objects.equals(projects, other.projects)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}
	    
	    


}
