package com.te.LearnJava8.designPatterns.prototype;

public class LearnPrototypeDesigningPattern {
	
	public static void main(String[] args) {
		ComplexObject object1=new ComplexObject(123, 4545, 5784, 78776, 7876, 8987, 6786, 756756, 57567);
		
		ComplexObject object2=null;
		
		try {
			object2=(ComplexObject) object1.clone();
			object2.setReadDataFromSensor9(222222);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(object1);
		System.out.println(object2);
		
		System.out.println(object1==object2);
	
	}

}
