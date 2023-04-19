package org.company;


public class CompanyInfo {
	private void companyName(String name) {
		System.out.println("Company Name : " + name);
		

	}
	private void companyName(int Year, String Address) {
		System.out.println("Company Starting Year : " + Year);
		System.out.println("Company Address : " + Address);
		

	}
	private void companyName(float Salary, long PhoneNumber) {
		System.out.println("Company Salary : " + Salary);
		System.out.println("Company PhoneNumber : " + PhoneNumber);
		
	}
	public static void main(String[] args) {
		
		CompanyInfo c = new CompanyInfo();
		c.companyName("Mani Velan");
		c.companyName(1992, "Tiruttani");
		c.companyName(50000f, 9677994549l);

}
}
