package com.te.LearnJava8.oops.encapsulation;

public class EmployeeMain {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Employee employee = new Employee();
		Address address = new Address();
		Department department=new Department();
		employee.setEmployeeId(1);
		employee.setEmployeeName("Mahesh");
		employee.setEmployeePhoneNumber(7559475706l);
		employee.setEmployeeMailId("maheshawaji111@gmail.com");
		employee.setGender(Gender.MALE);
//		address.setCity("Bangalore");
//		address.setCountry("India");
//		address.setPincode(123456);
//		employee.setAddress(address);
		employee.addressHelper();
//		employee.addressHelper(address);
		department.setDeptId(123);
		department.setDeptName("Management");
		department.setDeptLocation("Noida");
//		employee.departmentHelper();
//		employee.departmentHelper(department);
		employee.setDepartment(department);
		System.out.println(employee);

	}

}
