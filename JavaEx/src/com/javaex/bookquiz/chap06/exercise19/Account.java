package com.javaex.bookquiz.chap06.exercise19;

public class Account {
	//	정적 필드 선언
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance = 0;
		
	//	getter / setter
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if ( balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;			
		}
	}
}
