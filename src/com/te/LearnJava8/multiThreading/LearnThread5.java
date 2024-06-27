package com.te.LearnJava8.multiThreading;

class CommonClass{
 StringBuffer str= new StringBuffer(" Hello ");
	
	public   void write() {
		for(int i=0;i<5;i++) {
			str=str.append(" hi");
			System.out.println(str);
			
		}
	}
	public   void read() {
		for(int i=0;i<5;i++) {
			System.out.println(str);
		}
	}
	
}
class Operation1 extends Thread{
	CommonClass class1=new CommonClass();
	 
	@Override
	public void run() {
		class1.write();
	}
}
class Operation2 extends Thread{
	CommonClass class1=new CommonClass();
	@Override
	public void run() {
		class1.read();
	}
}

public class LearnThread5 {
	public static void main(String[] args) {
		Operation1 operation1=new Operation1();
		Operation2 operation2=new Operation2();
		operation1.start();
		operation2.start();
	}

}
