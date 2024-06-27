package com.te.LearnJava8.java8Features.functionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

class CompareStudentByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.getStudent_Name().compareTo(o2.getStudent_Name()));
	}

}

class CompareStudentById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.getStudent_Id() - o2.getStudent_Id());
	}

}

class CompareStudentByAge implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.getStudent_Age()-o2.getStudent_Age());
	}
	
}

public class CompareStudents {
	public static void main(String[] args) {
		Student[] students = { new Student(03, "Suresh", 28), new Student(01, "Vijay", 25),
				new Student(05, "Ajay", 29) };
		
		Predicate<Integer> ageCompare=(age)->age>25;
		
		for(int i=0;i<students.length;i++) {
			if(ageCompare.test(students[i].getStudent_Age())) {
				System.out.println(students[i]);
			}
		}
		
		Arrays.sort(students, new CompareStudentByName());
		System.out.println("Comparing Students by Name using class");
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println();
		
		System.out.println("Comparing Students by Id using class");
		System.out.println();
		Arrays.sort(students, new CompareStudentById());

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println();
		
		
		System.out.println("Comparing Students by Age using class");
		System.out.println();
		Arrays.sort(students, new CompareStudentByAge());

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println();
		
		
		
		Comparator<Student> compareStudentByName=(s1,s2)->{
			return (s1.getStudent_Name().compareTo(s2.getStudent_Name()));
			
		};
		Arrays.sort(students, compareStudentByName);
		System.out.println("Comparing Students by Name using LambdaExpression");
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println();
		
		
		Comparator<Student> compareStudentById=(s1,s2)->{
			return (s1.getStudent_Id()-s2.getStudent_Id());
			
		};
		Arrays.sort(students, compareStudentById);
		System.out.println("Comparing Students by Id using LambdaExpression");
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println();
		
		Comparator<Student> compareStudentByAge=(s1,s2)->{
			return (s1.getStudent_Age()-s2.getStudent_Age());
			
		};
		Arrays.sort(students, compareStudentByAge);
		System.out.println("Comparing Students by Age using LambdaExpression");
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
			

	}

}
