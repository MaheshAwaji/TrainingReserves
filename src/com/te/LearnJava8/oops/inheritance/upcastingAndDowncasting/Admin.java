package com.te.LearnJava8.oops.inheritance.upcastingAndDowncasting;

public class Admin extends Member {

	void addMember() {
		System.out.println("Adding member");
	}

	void removeMember() {
		System.out.println("Remove Member");
	}
	void sendMessage() {
		System.out.println("Admin Sends a messages");
	}

	void deleteMessage() {
		System.out.println("Admin deletes a message");
	}

}
