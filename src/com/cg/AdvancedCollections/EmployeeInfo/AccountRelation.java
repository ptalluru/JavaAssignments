package com.cg.AdvancedCollections.EmployeeInfo;

public class AccountRelation {

	private EmployeeInformation employeeInformation;
	private MMASavingAccount mmaSavingAccount;
	
	public AccountRelation(EmployeeInformation employeeInformation,
			MMASavingAccount mmaSavingAccount) {
		super();
		this.employeeInformation = employeeInformation;
		this.mmaSavingAccount = mmaSavingAccount;
	}

	public EmployeeInformation getEmployeeInformation() {
		return employeeInformation;
	}

	public MMASavingAccount getMmaSavingAccount() {
		return mmaSavingAccount;
	}

	@Override
	public String toString() {
		return "AccountRelation [employeeInformation=" + employeeInformation
				+ ", mmaSavingAccount=" + mmaSavingAccount + "]";
	}
	
}
