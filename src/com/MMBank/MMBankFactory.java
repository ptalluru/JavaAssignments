package com.MMBank;

public class MMBankFactory extends BankFactory{

	@Override
	public MMCurrentAccount getNewCurrentAccount(String accountHolderName, double accountBalance, float creditLimit) {
		return new MMCurrentAccount(accountHolderName, accountBalance, creditLimit);
	}

	@Override
	public MMSavingsAccount getNewSavingsAccount(String accountHolderName, double accountBalance, boolean isSalaried) {
		return new MMSavingsAccount(accountHolderName,accountBalance, isSalaried);
	}
}
