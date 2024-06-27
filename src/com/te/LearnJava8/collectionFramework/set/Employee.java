package com.te.LearnJava8.collectionFramework.set;

import java.util.Comparator;
import java.util.Objects;



 class CompareBasedOnAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.getEmpAge()-o2.getEmpAge());
	}
	 
 }
 
 class CompareBasedOnName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEname().compareTo(o2.getEname());
		
	}
	 
 }
public class Employee implements Comparable<Employee> {
	 private String Ename;
	private int e_id;
	private int EmpAge;
	public Employee() {
		super();
	}
	public Employee(String ename, int e_id, int empAge) {
		super();
		Ename = ename;
		this.e_id = e_id;
		EmpAge = empAge;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public int getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}
	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + ", e_id=" + e_id + ", EmpAge=" + EmpAge + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(EmpAge, Ename, e_id);
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
		return EmpAge == other.EmpAge && Objects.equals(Ename, other.Ename) && e_id == other.e_id;
	}
	@Override
	public int compareTo(Employee o) {
		return (this.e_id-o.e_id);
	}
	
	
	

}
