package com.te.LearnJava8.basics;

import java.util.Objects;

public class ObjectIdentity {
	String s1;

	
	public ObjectIdentity() {
		super();
	}

	public ObjectIdentity(String s1) {
		super();
		this.s1 = s1;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(s1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectIdentity other = (ObjectIdentity) obj;
		return Objects.equals(s1, other.s1);
	}

	public static void main(String[] args) {
		ObjectIdentity identity=new ObjectIdentity();
		ObjectIdentity identity2=new ObjectIdentity();
		System.out.println(identity==identity2);
		
		ObjectIdentity identity3=new ObjectIdentity("Mahesh");
		ObjectIdentity identity4=new ObjectIdentity("Mahesh");
		
		System.out.println(identity3==identity4);
		System.out.println(identity3.equals(identity4));
	}

}
