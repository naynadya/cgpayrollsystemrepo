package com.cg.payroll.main;
import com.cg.payroll.bean.Employee;
import com.cg.payroll.bean.BankDetails;
import com.cg.payroll.bean.Salary;


public class MainClass {
	public static void main(String[] args) {
		
	
Salary s=new Salary("100","767654","8767","987876","786785","897896","52334","87621","678");
BankDetails b=new BankDetails("52564", "hdfc", "hdfc3004");
		Employee emp=new Employee( 110, "nayana","dandegaonkar","PDO5455","JHG","nayana@gmail.com", b,s);
      
     /*   
	BankDetails bank=new BankDetails("654735675","SBI","N009");
	
	
	Salary sal=new Salary("100","767654","8767","987876","786785","897896","52334","87621", null);

	
	
	
	int []numList	=new int[10];
	Employee [] empList=new Employee[3];
	empList[0]=new Employee(110,"nayana","nayana@gmail.com","PDo5455","JHG","Cdcd");
	
	for(int i=0;i<10;i++)
	{
		if(emp.getId()==110)
		{
			System.out.println(emp.getFirstName());
			System.out.println(emp.getLastName());
		}
			
	}
	System.out.println();*/
		System.out.println(emp.getSalary().getBasicSalary());
		System.out.println(emp.getBankDetails().getBankName());
		
}
	}

