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
		
public class EmployeeInformation {
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public EmployeeInformation(int employeeId, String employeeName,
			String employeeDesignation, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}
	
	public EmployeeInformation() {
		super();
	}
	
	@Override
	public String toString() {
		return "EmployeeInformation [employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeSalary=" + employeeSalary
				+ "]";
	}
	
	
	
	
	
	
}
