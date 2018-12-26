package com.cg.AdvancedCollections.EmployeeInfo;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class EmployeeInformationTest {
	private EmployeeInformation employeeInformationOne,employeeInformationTwo,employeeInformationThree,employeeInformationFour,employeeInformationFive;
	private MMASavingAccount mmaSavingAccountOne,mmaSavingAccountTwo,mmaSavingAccountThree,mmaSavingAccountFour,mmaSavingAccountFive;
	private AccountRelation accountRelation;
	
	@Before
	public void setUp(){
		employeeInformationOne = new EmployeeInformation(100,"Ajay","Analyst",20000);
		mmaSavingAccountOne = new MMASavingAccount(123456789,"Ajay",1000,true);
		
		employeeInformationTwo = new EmployeeInformation(102,"Prasanth","Analyst",20000);
		mmaSavingAccountTwo = new MMASavingAccount(123456799,"Prasanth",1000,true);
		
		employeeInformationThree = new EmployeeInformation(103,"Sriram","Analyst",20000);
		mmaSavingAccountThree = new MMASavingAccount(123446789,"Sriram",1000,true);
		
		employeeInformationFour = new EmployeeInformation(105,"Manoj","Analyst",20000);
		mmaSavingAccountFour = new MMASavingAccount(123457789,"Manoj",1000,true);
		
		employeeInformationFive = new EmployeeInformation(108,"Jaffar","Analyst",20000);
		mmaSavingAccountFive= new MMASavingAccount(123356789,"Jaffar",1000,true);
		
	}

	@Test
	public void testForRelation() {
		HashMap<String, AccountRelation> hashMap=new HashMap<String, AccountRelation>();
		hashMap.put("Ajay",new AccountRelation(employeeInformationOne, mmaSavingAccountOne));
		hashMap.put("Prasanth",new AccountRelation(employeeInformationTwo, mmaSavingAccountTwo) );
		hashMap.put("Sriram",new AccountRelation(employeeInformationThree, mmaSavingAccountThree) );
		hashMap.put("Manoj",new AccountRelation(employeeInformationFour, mmaSavingAccountFour) );
		hashMap.put("Jaffar",new AccountRelation(employeeInformationFive, mmaSavingAccountFive) );
		
		String actual=hashMap.get("Sriram").toString();
		String expected = "AccountRelation [employeeInformation=EmployeeInformation [employeeId=103, employeeName=Sriram, employeeDesignation=Analyst, employeeSalary=20000.0], mmaSavingAccount=MMASavingAccount [accountId=123446789, accountHolderName=Sriram, accountBalance=1000.0, isSalaryAccount=true]]";
		assertEquals(expected,actual);
	}
	
	@Test(expected= RuntimeException.class)
	public void testForInvalidKey(){
		HashMap<String, AccountRelation> hashMap=new HashMap<String, AccountRelation>();
		hashMap.put("Ajay",new AccountRelation(employeeInformationOne, mmaSavingAccountOne));
		hashMap.put("Prasanth",new AccountRelation(employeeInformationTwo, mmaSavingAccountTwo) );
		hashMap.put("Sriram",new AccountRelation(employeeInformationThree, mmaSavingAccountThree) );
		hashMap.put("Manoj",new AccountRelation(employeeInformationFour, mmaSavingAccountFour) );
		hashMap.put("Jaffar",new AccountRelation(employeeInformationFive, mmaSavingAccountFive) );
		
		String actual=hashMap.get("Sri").toString();
		String expected = "AccountRelation [employeeInformation=EmployeeInformation [employeeId=103, employeeName=Sriram, employeeDesignation=Analyst, employeeSalary=20000.0], mmaSavingAccount=MMASavingAccount [accountId=123446789, accountHolderName=Sriram, accountBalance=1000.0, isSalaryAccount=true]]";
		assertEquals(expected,actual);
	}
}

