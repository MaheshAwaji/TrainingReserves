package com.te.LearnJava8.ObjectClass;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee1=new Employee(101,25,"Mahesh");
		Employee employee2=new Employee(101,25,"Mahesh");
//		Employee employee2=new Employee(102, 33, "Giridhar");
		Employee employee3=employee1;
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		
		System.out.println(employee1.equals(employee2));
		System.out.println(employee1==employee2);
		System.out.println(employee2.equals(employee3));
		System.out.println(employee1.equals(employee3));
	}

}
