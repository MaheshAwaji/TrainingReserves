package com.te.LearnJava8.oops.abstraction;

public interface Interface1 {
	
	default void add() {
		System.out.println("Interface 1");
		
	}
	
	void demo();
	
	
	 static void privateStaticHelper() {
        System.out.println("Private Static Helper Method");
    }
	

}
