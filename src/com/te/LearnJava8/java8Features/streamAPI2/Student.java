package com.te.LearnJava8.java8Features.streamAPI2;

import java.util.Map;
import java.util.Objects;

public class Student {
	private int student_Id;
	private String student_name;
	private Rating rating;
	private Map<String, Integer> marks;
	public Student() {
		super();
	}
	public Student(int student_Id, String student_name, Rating rating, Map<String, Integer> marks) {
		super();
		this.student_Id = student_Id;
		this.student_name = student_name;
		this.rating = rating;
		this.marks = marks;
	}
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", student_name=" + student_name + ", rating=" + rating
				+ ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks, rating, student_Id, student_name);
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
		return Objects.equals(marks, other.marks) && rating == other.rating && student_Id == other.student_Id
				&& Objects.equals(student_name, other.student_name);
	}
	
	

}
