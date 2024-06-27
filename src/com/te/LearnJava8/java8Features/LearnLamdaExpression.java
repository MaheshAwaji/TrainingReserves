package com.te.LearnJava8.java8Features;



interface MathOperation{
	int add(int a,int b);
}
public class LearnLamdaExpression  {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int m=10;
		MathOperation mathOperation=(a,b)->{
			System.out.println(m);
			return 0;
		};
		
		int c=mathOperation.add(2, 3);
//		System.out.println(c);
		
		
		
	}
	
	

}
