package com.te.LearnJava8.ObjectClass;

public class StudentMain {
	public static void main(String[] args) {
		Student student1=new Student("Mahesh", 01, 123456789l);
		Student student2=new Student("Mahesh", 01, 123456789l);
//		Student student2=new Student("Giridhar", 02, 987654321l);
		Student student3=student1;
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		
		System.out.println(student1.equals(student2));
		System.out.println(student2.equals(student3));
		System.out.println(student1.equals(student3));
	}

}
