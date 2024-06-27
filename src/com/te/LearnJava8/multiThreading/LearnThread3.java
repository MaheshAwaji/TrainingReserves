package com.te.LearnJava8.multiThreading;

public class LearnThread3 {
	private int count=0;
	
	public  void increment() {
		count++;
		
	}
	
	public int grtCount() {
		return this.count;
	}
	public static void main(String[] args) throws InterruptedException {
		LearnThread3 learnThread3=new LearnThread3();
		
		Thread t1=new Thread(()->{
			for(int i=0;i<1000;i++) {
				learnThread3.increment();
			}
		});
		
		Thread t2=new Thread(()->{
			for(int i=0;i<1000;i++) {
				learnThread3.increment();
			}
		});
		
		t1.start();
		t1.join();
		t2.start();		
		t2.join();
		
		System.out.println("Final Count= "+learnThread3.grtCount());
	}

}
