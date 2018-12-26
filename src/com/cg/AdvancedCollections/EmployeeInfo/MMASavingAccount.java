package com.cg.AdvancedCollections.EmployeeInfo;

/**
 *4)Create two classes Employee_information and MMASaving_Account 
 *
 *a.Employee_information class will have fields empID, Employee_name, employee_designation , 
 *	Employee_salary, employee_comm with that they will have setter getter methods 
 *
 *b.MMASaving Account class will have fields accountID, accountholder_name, account_balance,
 *	isSalaryAccount with that they will have setter and getter methods
 * 
 *c.Employee_information object and MMASaving_Account object belongs to a same entity 
 *	assuming there are more than 5 entities how will you store the objects preserving the relation between them. 

 * @author ptalluru
 *
 */

public class MMASavingAccount {

	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	private boolean isSalaryAccount;
	
	public MMASavingAccount(int accountId, String accountHolderName,
			double accountBalance, boolean isSalaryAccount) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isSalaryAccount = isSalaryAccount;
	}

	public MMASavingAccount() {
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public String toString() {
		return "MMASavingAccount [accountId=" + accountId
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", isSalaryAccount="
				+ isSalaryAccount + "]";
	}
	
	
	
}
