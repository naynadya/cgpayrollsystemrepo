package com.cg.payroll.bean;

public class Salary {
	
		private String BasicSalary,Hra,ConveyenceAllowance,OtherAllowance,PersonalAllowance,MonthalyTax,epf,CompanyPF,Netsalary;

		public Salary(){}
		public Salary(String BasicSalary,String Hra,String ConveyenceAllowance,String OtherAllowance,String PersonalAllowance,String MonthalyTax,String epf,String CompanyPF,String Netsalary){
			
		
		 
			super();
			this.BasicSalary = BasicSalary;
			this.Hra = Hra;
			this.ConveyenceAllowance = ConveyenceAllowance;
			this.OtherAllowance = OtherAllowance;
			this.PersonalAllowance = PersonalAllowance;
			this.MonthalyTax = MonthalyTax;
			this.epf = epf;
			this.CompanyPF = CompanyPF;
			this.Netsalary = Netsalary;}
		 
		public String getBasicSalary() {
			return BasicSalary;
		}
		public void setBasicSalary(String basicSalary) {
			BasicSalary = basicSalary;
		}
		public String getHra() {
			return Hra;
		}
		public void setHra(String hra) {
			Hra = hra;
		}
		public String getConveyenceAllowance() {
			return ConveyenceAllowance;
		}
		public void setConveyenceAllowance(String conveyenceAllowance) {
			ConveyenceAllowance = conveyenceAllowance;
		}
		public String getOtherAllowance() {
			return OtherAllowance;
		}
		public void setOtherAllowance(String otherAllowance) {
			OtherAllowance = otherAllowance;
		}
		public String getPersonalAllowance() {
			return PersonalAllowance;
		}
		public void setPersonalAllowance(String personalAllowance) {
			PersonalAllowance = personalAllowance;
		}
		public String getMonthalyTax() {
			return MonthalyTax;
		}
		public void setMonthalyTax(String monthalyTax) {
			MonthalyTax = monthalyTax;
		}
		public String getEpf() {
			return epf;
		}
		public void setEpf(String epf) {
			this.epf = epf;
		}
		public String getCompanyPF() {
			return CompanyPF;
		}
		public void setCompanyPF(String companyPF) {
			CompanyPF = companyPF;
		}
		public String getNetsalary() {
			return Netsalary;
		}
		public void setNetsalary(String netsalary) {
			Netsalary = netsalary;
		}	
		
}
