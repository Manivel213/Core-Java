package org.coding;

public class Challenge4 {
	public static void main(String[] args) {
		
		String s = "velaneee.trt@gmail.com";
		boolean contains = s.contains("@");
		System.out.println(contains);
		
		String s1 = "Inmakes Infotech, Vijay Tower, Kochi";
		boolean contains2 = s1.contains("pincode");
		System.out.println(contains2);
		
		String s2 = "Inmakes Infotech, Vijay Tower, Kochi";
		boolean empty = s2.isEmpty();
		System.out.println(empty);
		
		String s3 = "Welcome to class java";
		String replace = s3.replace("java", "sql");
		System.out.println(replace);
		
		String s4 = "Inmakes Kochi";
		String replace1 = s4.replace("Kochi", "Chennai");
		System.out.println(replace1);
		
		String s5 = "Welcome to Java Class";
		String replace2 = s5.replace("Welcome to Java Class", "Welcome#to#Java#Class");
		System.out.println(replace2);
		
		String s6 = "Inmakes Infotech";
		String lowerCase = s6.toLowerCase();
		System.out.println(lowerCase);
		
		String s7 = "Welcomme to Java Class";
		boolean empty2 = s7.isEmpty();
		System.out.println(empty2);
		
		
		
	}

}
