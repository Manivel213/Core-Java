package org.cons;

public class Employee {
	//private void empId() {
		//System.out.println("Employee ID : 0321");
	//}
	public Employee() {
		System.out.println("Employee Address : Chennai");
		}
	public Employee(int id) {
		System.out.println("Employee Id : 0321");
		}
	public Employee(int age, String name, long Phonenumber) {
		System.out.println("Employee age : 30");
		System.out.println("Employee name : Velan");
		System.out.println("Employee Phonenumber : 9677994549");
		}
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee(30, "Velan", 9677994549l);
		
	}

	

}
