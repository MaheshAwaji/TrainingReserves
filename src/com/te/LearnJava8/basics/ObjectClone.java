package com.te.LearnJava8.basics;

public class ObjectClone implements Cloneable {
	 String name;
	 long mobile;
	public ObjectClone() {
		super();
	}
	public ObjectClone(String name, long mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	 
	 public static void main(String[] args) {
		
		try {
			ObjectClone clone=new ObjectClone("Mahesh", 7559475706l);
			ObjectClone clone2=(ObjectClone)clone.clone();
			System.out.println(clone.name);
			System.out.println(clone2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
	

}
