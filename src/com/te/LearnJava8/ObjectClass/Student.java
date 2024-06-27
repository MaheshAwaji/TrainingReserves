package com.te.LearnJava8.ObjectClass;


public class Student implements Cloneable {
	private String StudentName;
	private int RollNo;
	private long mobile;
	public Student() {
		super();
	}
	public Student(String studentName, int rollNo, long mobile) {
		super();
		StudentName = studentName;
		RollNo = rollNo;
		this.mobile = mobile;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", RollNo=" + RollNo + ", mobile=" + mobile + "]";
	}
	@Override
	public int  hashCode() {
//		return Objects.hash(RollNo, StudentName, mobile);
		return (int) (this.StudentName.hashCode()+this.RollNo+this.mobile);
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Student other = (Student) obj;
//		return RollNo == other.RollNo && Objects.equals(StudentName, other.StudentName) && mobile == other.mobile;
		if (this.hashCode()==other.hashCode()) {
			return true;			
		}
		
		return false;
	}
	
	
	

}
