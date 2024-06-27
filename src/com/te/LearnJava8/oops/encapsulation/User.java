package com.te.LearnJava8.oops.encapsulation;

public class User {
	private int user_id;
	private String user_name;
	private String password;
	private int userAge;
	private String user_mail;

	User() {

	}

	User(int user_id, String user_name, String password, int userAge, String user_mail) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.userAge = userAge;
		this.user_mail = user_mail;

	}

	public int getUser_id() {
		return getUser_id();

	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;

	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.length()<8) {
			System.out.println("Enter password which is greater than 8 letter");
		}else {
			this.password=password;
		}
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUser_mail() {
		return getUser_mail();
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", password=" + password + ", userAge="
				+ userAge + ", user_mail=" + user_mail + "]";
	}
	
	

}
