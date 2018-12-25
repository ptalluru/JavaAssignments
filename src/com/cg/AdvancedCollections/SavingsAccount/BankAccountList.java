package com.cg.AdvancedCollections.SavingsAccount;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList  {
	private double accountbalance;
	private int accountid;
	private String accountholdername;
	private boolean issalariedaccount;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountbalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((accountholdername == null) ? 0 : accountholdername
						.hashCode());
		result = prime * result + accountid;
		result = prime * result + (issalariedaccount ? 1231 : 1237);
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
		BankAccountList other = (BankAccountList) obj;
		if (Double.doubleToLongBits(accountbalance) != Double
				.doubleToLongBits(other.accountbalance))
			return false;
		if (accountholdername == null) {
			if (other.accountholdername != null)
				return false;
		} else if (!accountholdername.equals(other.accountholdername))
			return false;
		if (accountid != other.accountid)
			return false;
		if (issalariedaccount != other.issalariedaccount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SavingAccountList [accountbalance=" + accountbalance
				+ ", accountid=" + accountid + ", accountholdername="
				+ accountholdername + ", issalariedaccount="
				+ issalariedaccount + "]";

	}



	public Set<SavingsAccount> addAccountsList(List<SavingsAccount> al) {
		Set<SavingsAccount> savingAccountSet = new TreeSet<SavingsAccount>(al);
//		savingAccountSet.addAll(al);
		
		return savingAccountSet;
	}

}
