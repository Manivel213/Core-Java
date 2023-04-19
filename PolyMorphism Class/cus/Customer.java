package org.cus;

public class Customer {
	private void cusDetails(String name) {
		System.out.println("Customer Name : " + name);
		

	}
	private void cusDetails(int age, String Address) {
		System.out.println("Customer Age : " + age);
		System.out.println("Customer Address : " + Address);
		

	}
	private void cusDetails(float Salary, long PhoneNumber) {
		System.out.println("Customer Salary : " + Salary);
		System.out.println("Customer PhoneNumber : " + PhoneNumber);
		
	}
	public static void main(String[] args) {
		
		Customer c= new Customer();
		c.cusDetails("Mani Velan");
		c.cusDetails(30, "Tiruttani");
		c.cusDetails(50000f, 9677994549l);
		
	}

}
