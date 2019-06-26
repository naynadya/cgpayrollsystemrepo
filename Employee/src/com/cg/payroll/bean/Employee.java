package com.cg.payroll.bean;

public class Employee {
	
private int id;
private String firstName,lastName,pancard,designation,emailId;
private BankDetails bankDetails;
private Salary salary;
	public Employee(){}
	public Employee(int id, String firstName, String lastName, String pancard, String designation, String emailId,
			BankDetails bankDetails, Salary salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pancard = pancard;
		this.designation = designation;
		this.emailId = emailId;
		this.bankDetails = bankDetails;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}



}


