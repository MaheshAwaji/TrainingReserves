package com.te.LearnJava8.java8Features.functionalProgramming;

import java.util.Objects;

public class Student {
	private int student_Id;
	private String student_Name;
	private int student_Age;
	public Student() {
		super();
	}

	public Student(int student_Id, String student_Name, int student_Age) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.student_Age = student_Age;
	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public int getStudent_Age() {
		return student_Age;
	}

	public void setStudent_Age(int student_Age) {
		this.student_Age = student_Age;
	}

	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", student_Age=" + student_Age
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(student_Age, student_Id, student_Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return student_Age == other.student_Age && student_Id == other.student_Id
				&& Objects.equals(student_Name, other.student_Name);
	}

}
