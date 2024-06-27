package com.te.LearnJava8.multiThreading;


class Resource1{
	public synchronized void resource1(Resource2 r2) {
		System.out.println("Resource 01");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r2.resource2(this);
		System.out.println("resource02 resource executed");
		
		
	}
}

class Resource2{
	public synchronized void resource2(Resource1 r1) {
		System.out.println("Resource 02");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		r1.resource1(this);
		System.out.println("resource01 resource executed");
		
		
	}
	
}
public class LearnDeadLock {
	public static void main(String[] args) {
		Resource1 resource1=new Resource1();
		Resource2 resource2=new Resource2();
		
		Thread thread=new Thread(()->resource1.resource1(resource2));
		Thread thread2=new Thread(()->resource2.resource2(resource1));
		
		thread.start();
		thread2.start();
		
	}

}
