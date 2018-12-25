package com.cg.AdvancedCollections.SavingsAccount;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList  {
	
	public Set<SavingsAccount> addAccountsList(List<SavingsAccount> al) {
		Set<SavingsAccount> savingAccountSet = new TreeSet<SavingsAccount>(al);
		return savingAccountSet;
	}
}