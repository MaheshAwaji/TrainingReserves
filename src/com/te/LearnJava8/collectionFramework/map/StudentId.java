package com.te.LearnJava8.collectionFramework.map;

import java.util.Objects;

public class StudentId  {
	private String university_code;
	private int roll_number;
	private char section;
	public StudentId() {
		super();
	}
	public StudentId(String university_code, int roll_number, char section) {
		super();
		this.university_code = university_code;
		this.roll_number = roll_number;
		this.section = section;
	}
	public String getUniversity_code() {
		return university_code;
	}
	public void setUniversity_code(String university_code) {
		this.university_code = university_code;
	}
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "StudentId [university_code=" + university_code + ", roll_number=" + roll_number + ", section=" + section
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(roll_number, section, university_code);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentId other = (StudentId) obj;
		return roll_number == other.roll_number && section == other.section
				&& Objects.equals(university_code, other.university_code);
	}
//	@Override
//	public int compareTo(StudentId o) {
//		return (this.roll_number-o.roll_number);
//	}
	
	

}
