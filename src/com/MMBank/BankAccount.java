package com.MMBank;

public abstract class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance;
	private static int increment=0;

	public BankAccount(String accountHolderName,double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	{
		
		accountNumber=++increment;
		
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public abstract void withdraw(double amount) throws Exception;
	
	public void deposit(double amount) throws Exception{
		if(amount<=0){
			throw new InvalidInputException("Invalid Input");
		}
		else
		accountBalance=accountBalance+amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	
}
