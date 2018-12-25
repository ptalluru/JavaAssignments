package com.cg.AdvancedCollections.SavingsAccount;

import java.io.FileWriter;
import java.io.Serializable;

public class SavingsAccount implements Serializable,Comparable<SavingsAccount>{
	private double accountbalance;
	private int accountid;
	private String accountholdername;
	private boolean issalariedaccount;
	private static int accountidGenerator;

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
		SavingsAccount other = (SavingsAccount) obj;
		if (Double.doubleToLongBits(accountbalance) != Double
				.doubleToLongBits(other.accountbalance))
			return false;
		if (accountholdername == null) {
			if (other.accountholdername != null)
				return false;
		} else if (!accountholdername.equals(other.accountholdername))
			return false;
		if (issalariedaccount != other.issalariedaccount)
			return false;
		return true;
	}

	public SavingsAccount(int accountid,double accountbalance, String accountholdername,
			boolean issalariedaccount) {
		super();
		this.accountid=accountid;
		this.accountbalance = accountbalance;
		this.accountholdername = accountholdername;
		this.issalariedaccount = issalariedaccount;
	}

	
	public SavingsAccount() {
		super();
	}

	@Override
	public String toString() {
		return "SavingAccount [accountbalance=" + accountbalance
				+ ", accountid=" + accountid + ", accountholdername="
				+ accountholdername + ", issalariedaccount="
				+ issalariedaccount + "]";
	}

	@Override
	public int compareTo(SavingsAccount a) {
		if( a.accountid==this.accountid)
			return 0;
		else if(a.accountid>this.accountid)
			return -1;
		else
			return 1;
	}

	}