package com.te.LearnJava8.exceptions;

public class BankBalance {
	private static int balance=500;
	public static void withdrawBalance(int amount) {
		if (amount<=balance) {
			
			System.out.println(amount+" debited from your amount");
			
		}else {
			throw new InsufficientBalanceException("Insufficient balance");
			
		}
	}
	public static void main(String[] args) {
		try {
			withdrawBalance(600);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
