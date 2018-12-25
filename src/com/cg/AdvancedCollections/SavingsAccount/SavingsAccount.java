package com.cg.AdvancedCollections.SavingsAccount;

import java.io.Serializable;

import com.MMBank.InsufficientException;
import com.MMBank.InvalidInputException;

public class SavingsAccount implements Serializable,Comparable<SavingsAccount>{
	/**
	 * 
	 * 1)Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter methods with business method like withdraw and deposit.
	 *	a.Create 5 different object of SavingAccount and add them into ArrayList, now interate the arraylist and display all SavingAccount’s object one by one.
	 *	b.Now save the ArrayList which contains SavingAccount’s object into a file and read the file and display all savingAccount Object one by one.
	 *	c.Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  

	 * 
	 */
	private static final long serialVersionUID = 6539568974409598816L;
	private double accountBalance;
	private int accountId;
	private String accountHolderName;
	private boolean isSalariedAccount;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((accountHolderName == null) ? 0 : accountHolderName
						.hashCode());
		result = prime * result + (isSalariedAccount ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		if (Double.doubleToLongBits(accountBalance) != Double
				.doubleToLongBits(other.accountBalance))
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (isSalariedAccount != other.isSalariedAccount)
			return false;
		return true;
	}

	public SavingsAccount(int accountId,double accountBalance, String accountHolderName,
			boolean isSalariedAccount) {
		super();
		this.accountId=accountId;
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
		this.isSalariedAccount = isSalariedAccount;
	}

	public double getAccountbalance() {
		return accountBalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountBalance = accountbalance;
	}

	public int getAccountid() {
		return accountId;
	}

	public void setAccountid(int accountid) {
		this.accountId = accountid;
	}

	public String getAccountholdername() {
		return accountHolderName;
	}

	public void setAccountholdername(String accountholdername) {
		this.accountHolderName = accountholdername;
	}

	public boolean isIssalariedaccount() {
		return isSalariedAccount;
	}

	public void setIssalariedaccount(boolean issalariedaccount) {
		this.isSalariedAccount = issalariedaccount;
	}

	public SavingsAccount() {
		super();
	}

	@Override
	public String toString() {
		return "SavingAccount [accountbalance=" + accountBalance
				+ ", accountid=" + accountId + ", accountholdername="
				+ accountHolderName + ", issalariedaccount="
				+ isSalariedAccount + "]";
	}



	@Override
	public int compareTo(SavingsAccount a) {
		if( a.accountId==this.accountId)
			return 0;
		else if(a.accountId>this.accountId)
			return -1;
		else
			return 1;
	}

	public void deposit(double amount) throws Exception{
		if(amount<=0){
			throw new InvalidInputException("Invalid Input");
		}
		else
		accountBalance=accountBalance+amount;
	}
	
	
	
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

	}