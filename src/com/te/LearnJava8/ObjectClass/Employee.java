package com.te.LearnJava8.ObjectClass;


public class Employee {
	private int empId;
	private int EmpAge;
	private String EmpName;
	public Employee() {
		super();
	}
	public Employee(int empId, int empAge, String empName) {
		super();
		this.empId = empId;
		EmpAge = empAge;
		EmpName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", EmpAge=" + EmpAge + ", EmpName=" + EmpName + "]";
	}
	@Override
	public int hashCode() {
//		return Objects.hash(EmpAge, EmpName, empId);
		return this.empId+this.EmpAge+this.EmpName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Employee other = (Employee) obj;
//		return EmpAge == other.EmpAge && Objects.equals(EmpName, other.EmpName) && empId == other.empId;
		if (this.hashCode()==other.hashCode()) {
			return true;
			
		}
		return false;
	}
	
	

}
