package com.te.LearnJava8.collectionFramework.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
	public static void main(String[] args) {
//		CompareByStudentRollNumber byStudentRollNumber=new CompareByStudentRollNumber();
		Comparator<StudentId> byStudentRollNumber=(s1,s2)->s1.getRoll_number()-s2.getRoll_number();
		TreeMap<StudentId, Student> students=new TreeMap<>(byStudentRollNumber);
		students.put(new StudentId("abc", 14, 'A'), new Student(new StudentId("abc", 14, 'A'),"Mahesh" , 30));
		students.put(new StudentId("abc", 13, 'B'), new Student(new StudentId("abc", 13, 'B'),"Ramesh" , 25));
		students.put(new StudentId("abc", 15, 'C'), new Student(new StudentId("abc", 15, 'C'),"Suresh" , 28));
		for(Map.Entry<StudentId, Student> student:students.entrySet()) {
			System.out.println("Key "+student.getKey()+"Value "+student.getValue());
			
		}
		
	}

}
