package org.company;

public class CompanyDetails {
	private void companyName() {
		System.out.println("Company Name : Velan");
		}
	private void companyId() {
		System.out.println("Company Id number : 0321");
		}
	private void companyAddress() {
		System.out.println("Company Address : Tiruttani");
	}
	public static void main(String[] args) {
		
		CompanyDetails c = new CompanyDetails();
		
		c.companyAddress();
		c.companyId();
		c.companyName();
	}

}
