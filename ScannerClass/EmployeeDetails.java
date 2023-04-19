package org.emp;

import java.util.Scanner;

public class EmployeeDetails {
	
	       public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1. what is your name?");
		String name = scanner.nextLine();
		System.out.println("Ans : hello " + name);

		System.out.println("2. what is your rating?");
		int rating = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ans : you rated as " + rating);

		System.out.println("3. what is your email?");
		String mail = scanner.nextLine();
		System.out.println("Ans : email is " + mail);

		
	  
	}

}

