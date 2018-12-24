package com.MMBank;

public class MMSavingsAccount extends SavingsAccount{
	
	private static final float minimumBalance = 0;
	
	public MMSavingsAccount(String accountHolderName,double accountBalance, boolean isSalaried) {
		super(accountHolderName, accountBalance, isSalaried);
	}

	public static float getMinimumbalance() {
		return minimumBalance;
	}
	
	@Override
	public void withdraw(double amount) throws Exception {
		if(amount<=0){
			throw new InvalidInputException("Invalid Input");
		}
		else if(amount>accountBalance){
			throw new InsufficientException("Insufficient");
		}
		else
		accountBalance=accountBalance-amount;
	}

	@Override
	public String toString() {
		return "MMSavingsAccount [isSalaried()=" + isSalaried()
				+ ", toString()=" + super.toString()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}

	
	

}
