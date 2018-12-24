package com.MMBank;

public abstract class BankFactory {

	public abstract SavingsAccount getNewSavingsAccount(String accountHolderName,double accountBalance,boolean isSalaried);
	
	public abstract CurrentAccount getNewCurrentAccount(String accountHolderName,double accountBalance,float creditLimit);


}