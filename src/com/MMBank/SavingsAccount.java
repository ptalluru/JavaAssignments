package com.MMBank;

import javax.management.RuntimeErrorException;

public abstract class  SavingsAccount extends BankAccount {

	private boolean isSalaried;
	public SavingsAccount(String accountHolderName,double accountBalance,boolean isSalaried) {
		super(accountHolderName, accountBalance);
		this.isSalaried=isSalaried;
	}
	
	public boolean isSalaried() {
		return isSalaried;
	}
	
	@Override
	public abstract void withdraw(double amount) throws Exception;

	@Override
	public String toString() {
		return "SavingsAccount [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}
}
