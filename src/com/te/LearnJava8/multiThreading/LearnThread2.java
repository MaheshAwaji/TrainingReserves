package com.te.LearnJava8.multiThreading;

public class LearnThread2 {

	public static void letThreadSleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
			letThreadSleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ends");
	}

}
