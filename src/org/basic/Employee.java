package org.basic;

public class Employee {
	
	private void empId() {
	System.out.println("Employee Id number : 0321");
	}
	private void empName() {
	System.out.println("Employee Name : Velan");
	}
	private void empDOB() {
	System.out.println("Employee DOB : 07/06/1992");
	}
	private void empMail() {
		System.out.println("Employee Mail Id : velaneee.trt@gmail.com");
	}
	private void empAddress() {
		System.out.println("Employee Address : Tiruttani");
	}
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDOB();
		e.empMail();
		e.empAddress();
	}

}
