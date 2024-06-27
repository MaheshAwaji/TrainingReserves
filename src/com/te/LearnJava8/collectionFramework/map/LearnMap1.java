package com.te.LearnJava8.collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap1 {
	public static void main(String[] args) {
		HashMap<StudentId, Student> students=new HashMap<>();
		
		students.put(new StudentId("abc", 12, 'A'), new Student(new StudentId("abc", 12, 'A'),"Mahesh" , 24));
		students.put(new StudentId("abc", 13, 'B'), new Student(new StudentId("abc", 13, 'B'),"Ramesh" , 25));
		students.put(new StudentId("abc", 15, 'C'), new Student(new StudentId("abc", 15, 'C'),"Suresh" , 28));
		
		for (Map.Entry<StudentId, Student> student : students.entrySet()) {
			System.out.println("Key "+student.getKey()+"Value "+student.getValue());
			System.out.println(student);
			
		}
	}

}
