package com.te.LearnJava8.oops.encapsulation;

public class LearnEncapsulation {
	public static void main(String[] args) {
		User user = new User();
		user.setUser_id(1);
		user.setUser_name("Mahesh");
		user.setPassword("Mahi@1234");
		user.setUserAge(24);
		user.setUser_mail("maheshawaji111@gmail.com");

		System.out.println(user);
	}

}
