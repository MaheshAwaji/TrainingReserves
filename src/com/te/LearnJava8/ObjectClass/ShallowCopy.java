package com.te.LearnJava8.ObjectClass;


import java.util.Objects;

public class ShallowCopy implements Cloneable {
	String name;
	int id;
	Student student;
	
	public ShallowCopy() {
		super();
	}

	public ShallowCopy(String name, int id, Student student) {
		super();
		this.name = name;
		this.id = id;
		this.student = student;
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		ShallowCopy copyReference=(ShallowCopy) super.clone();
		copyReference.student=(Student)student.clone();
		return copyReference;
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	@Override
	public String toString() {
		return "ShallowCopy [name=" + name + ", id=" + id + ", student=" + student + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id, name, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShallowCopy other = (ShallowCopy) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(student, other.student);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student=new Student("Mahesh", 02, 1234567l);
		ShallowCopy copy=new ShallowCopy("Giridhar", 2, student);
		ShallowCopy copy2=(ShallowCopy) copy.clone();
		copy2.student.setRollNo(03);
		System.out.println(copy);
		System.out.println(copy2);
		Integer obj=123;
		System.out.println(obj);
		
		
		
		
		
		
		
		
		
		
//		int n=obj.intValue();
//		
//		int m=30;
//		Integer s=m;
//		System.out.println(s);
	}

}
