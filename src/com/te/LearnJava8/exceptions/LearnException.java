package com.te.LearnJava8.exceptions;

public class LearnException {
	
	public static void checkVotingAge(int age) throws AgeInvalid {
		if (age>=18) {
			System.out.println("Eligible for voting");
			
		}else {
			throw new AgeInvalid("Not eligible for voting");
		}
		
	}
	public static void main(String[] args) throws AgeInvalid {
//		try {
//			checkVotingAge(2);
////			checkVotingAge(20);
//		} catch (AgeInvalid e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println("caught AgeInvalid "+e.getMessage());
//		}
		checkVotingAge(2);
		
		
	}

}
