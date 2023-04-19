package org.emp;

import java.util.Scanner;

public class MarkDetails {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. what is your name?");
		String name = scanner.nextLine();
		System.out.println("Ans : hello " + name);

		System.out.println("2. what is your Id Number?");
		int ID = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ans : My ID Number as " + ID);
		
		System.out.println("3. what is Mark1?");
		byte mark1 = scanner.nextByte();
		System.out.println("Ans : My mork1 is  " + mark1);

		System.out.println("4. what is Mark2?");
		short mark2 = scanner.nextShort();
		scanner.nextLine();
		System.out.println("Ans : Ans : My mork2 is " + mark2);
		
		System.out.println("5.what is Mark3?");
		long mark3 = scanner.nextLong();
		System.out.println("Ans : My mork3 is" + mark3);

		System.out.println("6.what is Mark4?");
		int mark4 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ans : My mork4 is " + mark4);
		
		System.out.println("7.what is Mark5?");
		long mark5 = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Ans : My mork5 is " + mark5);
		
	}


}
