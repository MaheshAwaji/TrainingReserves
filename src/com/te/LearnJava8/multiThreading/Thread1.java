package com.te.LearnJava8.multiThreading;

public class Thread1 extends Thread {
	@Override
	public void run() {
		
		for(int i=0;i<=3;i++) {
			System.out.println("Thread1");
		}
//		System.out.println("Thread1");
	}

}
