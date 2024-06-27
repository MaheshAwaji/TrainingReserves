package com.te.LearnJava8.multiThreading;



 class Thread3 extends Thread{
	 void task() {
		 for(int i=0;i<20;i++) {
			 System.out.println("Thread3 "+i);
		 }
	 }
	 
	 @Override
	public void run() {
		task();
	}
	
}
 
 class Thread4 implements Runnable{
	 void task() {
		 for(int i=0;i<20;i++) {
			 System.out.println("Thread4 "+i);
		 }
	 }

	@Override
	public void run() {
		task();
		
	}
	 
 }
public class LearnThread4 {
	public static void main(String[] args) {
		//Creating thread by using Thread class 
		Thread3 thread3=new Thread3();
		//Creating Thread by using Runnable interface
		Thread thread=new Thread(new Thread4() );
		//Using lambda expression for runnable interface
		Runnable runnable=()->{
			for(int i=0;i<20;i++) {
				 System.out.println("Using lambda expression "+i);
			 }
			
		};
		
		Thread thread2=new Thread(runnable);
		
		thread3.start();
		thread.start();
		thread2.start();
		
		
		
		
	}

}
