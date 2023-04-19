package org.abs;

public class EmployeeDetails extends Employee {

	@Override
	void employeeAddress() {
		System.out.println("Employee Address : Tiruttani");

	}

	@Override
	public void employeeId() {
		System.out.println("Employee Id : 0321");
	}

	public static void main(String[] args) {

		EmployeeDetails e = new EmployeeDetails();

		e.employeeAddress();
		e.employeeId();

	}

}
