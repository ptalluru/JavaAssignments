package com.MMBank;

public class MMCurrentAccount extends CurrentAccount {

	public MMCurrentAccount(String accountHolderName,double accountBalance,float creditLimit) {
		super(accountHolderName, accountBalance, creditLimit);
	}
	@Override
	public void withdraw(double amount) throws Exception{
		if(amount<=accountBalance+creditLimit && amount > 0){
			accountBalance=accountBalance-amount;
		}else if(amount<=0){
			throw new InvalidInputException("Invalid Input");
		}
		else if(amount>accountBalance+creditLimit){
			throw new InsufficientException("Insufficient Funds ");
		}
	}

	
	@Override
	public String toString() {
		return "MMCurrentAccount [getCreditLimit()=" + getCreditLimit()
				+ ", toString()=" + super.toString()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}
	
	

	
	

}
