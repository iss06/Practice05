package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 필요한 메소드 작성
	public void deposit (int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount);
		}
	}
	
	public void withdraw (int amount) {
		if (amount >0 && amount <= balance) {
			System.out.println(amount);
		}
	}
	
	public void showBalance (int amount) {
		if (amount > 0 && amount == balance) {
			System.out.println(amount);
		}
	}
	

}
