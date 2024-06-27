package com.te.LearnJava8.exceptions;

public class InsufficientBalanceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String s) {
		super(s);
	}

}
