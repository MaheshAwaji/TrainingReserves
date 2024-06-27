package com.te.LearnJava8.collectionFramework.map;

import java.util.Objects;

//class CompareByStudentRollNumber implements Comparator<StudentId>{
//
//	
//
////	@Override
////	public int compare(StudentId o1, StudentId o2) {
////		return o1.getRoll_number()-o2.getRoll_number();
////	}
//	
//}
public class Student implements Comparable<Student>  {
	private StudentId student_id;
	private String student_name;
	private int student_age;
	public Student() {
		super();
	}
	public Student(StudentId student_id, String student_name, int student_age) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_age = student_age;
	}
	public StudentId getStudent_id() {
		return student_id;
	}
	public void setStudent_id(StudentId student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_age() {
		return student_age;
	}
	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_age=" + student_age
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(student_age, student_id, student_name);
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
		return student_age == other.student_age && student_id == other.student_id
				&& Objects.equals(student_name, other.student_name);
	}
	@Override
	public int compareTo(Student o) {
		
		return this.student_name.compareTo(o.student_name);
	}
	
	

}
