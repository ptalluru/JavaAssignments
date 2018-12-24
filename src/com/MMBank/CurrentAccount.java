package com.MMBank;

public abstract class CurrentAccount extends BankAccount {

	protected final float creditLimit;
	
	public CurrentAccount(String accountHolderName,double accountBalance,float creditLimit) {
		super(accountHolderName, accountBalance);
		this.creditLimit=creditLimit;
	}

	
	public float getCreditLimit() {
		return creditLimit;
	}


	public abstract void withdraw(double amount) throws Exception;

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + "]";
	}


	

	
}
