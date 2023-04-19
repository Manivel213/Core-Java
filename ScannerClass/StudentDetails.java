package org.emp;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. what is your name?");
		String name = scanner.nextLine();
		System.out.println("Ans : hello " + name);

		System.out.println("2. what is your Id Number?");
		int ID = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ans : My ID Number as " + ID);

		System.out.println("3. what is your email?");
		String mail = scanner.nextLine();
		System.out.println("Ans : email is " + mail);
		
		System.out.println("4. What is your Department?");
		String dept = scanner.nextLine();
		System.out.println("Ans : My department is " + dept);
		
		System.out.println("5. what is your PhoneNumber?");
		long phoneNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Ans : My phone Numbe is " + phoneNumber);
		
		System.out.println("6.What is your City?");
		String City = scanner.nextLine();
		System.out.println("Ans : My city is " + City);
		
	}

}
