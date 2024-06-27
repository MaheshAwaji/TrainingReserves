package com.te.LearnJava8.oops.encapsulation;


public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeMailId;
	private long employeePhoneNumber;
	private Gender gender;
//	private Address address =new Address("Pune", "India", 232456l);//Early Instantiation
	private Address address;
//	private Department department=new Department(123, "Testing", "Pune");
	private Department department;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, String rmployeeMailId, long employeePhoneNumber,Gender gender,
			Address address,Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMailId = rmployeeMailId;
		this.employeePhoneNumber = employeePhoneNumber;
		this.gender=gender;
		this.address = address;
		this.department=department;
	}
//Address Helper-01
	public void addressHelper() {
		this.address = new Address("Pune", "India", 123456l);
	}
	//Address Helper-02
	public void addressHelper(Address address) {
		this.address=address;
	}
	//Department Helper-01
	public void departmentHelper() {
		this.department=new Department(234, "Development", "Hyderabad");
	}
//Department Helper-02
	public void departmentHelper(Department department) {
		this.department=department;
		
	}
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMailId() {
		return employeeMailId;
	}

	public void setEmployeeMailId(String rmployeeMailId) {
		this.employeeMailId = rmployeeMailId;
	}

	public long getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}

	public void setEmployeePhoneNumber(long employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeMailId="
				+ employeeMailId + ", employeePhoneNumber=" + employeePhoneNumber + ", gender=" + gender + ", address="
				+ address + ", department=" + department + "]";
	}

	

	

}
