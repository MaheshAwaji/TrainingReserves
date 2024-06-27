package com.te.LearnJava8.multiThreading;

public class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("Thread2");
		}
//		System.out.println("Thread2");
	}

}
