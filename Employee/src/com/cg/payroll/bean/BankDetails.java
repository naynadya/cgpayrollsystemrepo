package com.cg.payroll.bean;

public class BankDetails {
	
 private String AccountNumber,BankName,IFSCCode;
 
 public BankDetails(){};
 public  BankDetails(String  AccountNumber,String BankName,String IFSCCode)
 {

 

	this.AccountNumber = AccountNumber;
	this.BankName = BankName;
	this.IFSCCode = IFSCCode;
	
 
}
public String getAccountNumber() {
	return AccountNumber;
}
public void setAccountNumber(String accountNumber) {
	AccountNumber = accountNumber;
}
public String getBankName() {
	return BankName;
}
public void setBankName(String bankName) {
	BankName = bankName;
}
public String getIFSCCode() {
	return IFSCCode;
}
public void setIFSCCode(String iFSCCode) {
	IFSCCode = iFSCCode;
}}
		
