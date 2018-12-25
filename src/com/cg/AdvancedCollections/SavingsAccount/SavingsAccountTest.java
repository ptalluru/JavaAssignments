package com.cg.AdvancedCollections.SavingsAccount;

import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * 1)Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter methods with business method like withdraw and deposit.
 *	a.Create 5 different object of SavingAccount and add them into ArrayList, now interate the arraylist and display all SavingAccount’s object one by one.
 *	b.Now save the ArrayList which contains SavingAccount’s object into a file and read the file and display all savingAccount Object one by one.
 *	c.Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
 * 
 */
public class SavingsAccountTest {
	private SavingsAccount savingsAccountOne,savingsAccountTwo,savingsAccountThree,savingsAccountFour,
							savingsAccountFive,savingsAccountSix,savingsAccountSeven;
	private BankAccountList bankAccountList;
	List<SavingsAccount> al = new ArrayList<SavingsAccount>();

	@Before
	public void setUp(){
		savingsAccountOne = new SavingsAccount(105,15000,"Prasanth",true);
		savingsAccountTwo = new SavingsAccount(200,50000,"Ajay",false);
		savingsAccountThree = new SavingsAccount(20,10000,"Sriram",true);
		savingsAccountFour = new SavingsAccount(1,30000,"Manoj",false);
		savingsAccountFive = new SavingsAccount(100,23000,"Jaffar",true);
		savingsAccountSix = new SavingsAccount(105,2000,"Yugesh",true);
		savingsAccountSeven = new SavingsAccount(1,200000,"NTR",true); 

		al.add(savingsAccountOne);
		al.add(savingsAccountTwo);
		al.add(savingsAccountThree);
		al.add(savingsAccountFour);
		al.add(savingsAccountFive);
		al.add(savingsAccountSix);
		al.add(savingsAccountSeven);

	}

	@Test
	public void testForPrintingObjectsThroughArrayList() throws FileNotFoundException, IOException, ClassNotFoundException {
			List<SavingsAccount> al = new ArrayList<SavingsAccount>();
			al.add(savingsAccountOne);
			al.add(savingsAccountTwo);
			al.add(savingsAccountThree);
			al.add(savingsAccountFour);
			al.add(savingsAccountFive);
			al.add(savingsAccountSix);
			al.add(savingsAccountSeven);
			for (SavingsAccount savingAccount2 : al) {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ptalluru\\Desktop\\SavingsList.txt"));
				oos.writeObject(savingAccount2);
				oos.close();
			}
			for (SavingsAccount savingAccount2 : al) {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\ptalluru\\Desktop\\SavingsList.txt"));
				SavingsAccount savingAccount=(SavingsAccount) ois.readObject();
				ois.close();
			}
	}

	@Test
	public void testObjectsThroughArrayList() throws FileNotFoundException, IOException, ClassNotFoundException {
		bankAccountList = new BankAccountList();
		Set<SavingsAccount> customerSet = bankAccountList.addAccountsList(al);
		String expected = "[SavingAccount [accountbalance=30000.0, accountid=1, accountholdername=Manoj, issalariedaccount=false],"
						+ " SavingAccount [accountbalance=10000.0, accountid=20, accountholdername=Sriram, issalariedaccount=true],"
						+ " SavingAccount [accountbalance=23000.0, accountid=100, accountholdername=Jaffar, issalariedaccount=true],"
						+ " SavingAccount [accountbalance=15000.0, accountid=105, accountholdername=Prasanth, issalariedaccount=true],"
						+ " SavingAccount [accountbalance=50000.0, accountid=200, accountholdername=Ajay, issalariedaccount=false]]";
		assertEquals(expected,customerSet.toString());
	}
}