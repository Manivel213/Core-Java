package org.emp;


public class Employee {
	private void empID(String name) {
		System.out.println("Employee Name : " + name);
		

	}
	private void empID(int age, String Address) {
		System.out.println("Employee Age : " + age);
		System.out.println("Employee Address : " + Address);
		

	}
	private void empID(float Salary, long PhoneNumber) {
		System.out.println("Employee Salary : " + Salary);
		System.out.println("Employee PhoneNumber : " + PhoneNumber);
		
	}
	public static void main(String[] args) {
		
		Employee e= new Employee();
		e.empID("Mani Velan");
		e.empID(30, "Tiruttani");
		e.empID(50000f, 9677994549l);

}
}
