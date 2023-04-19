package org.string;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s = "Inmakes Infotech";
		
		char ch = s.charAt(8);
		System.out.println(ch);
		
		String upper = s.toUpperCase();
		System.out.println(upper);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean startsWith = s.startsWith("Inm");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("ech");
		System.out.println(endsWith);
		
		boolean contains = s.contains("Info");
		System.out.println(contains);
		
		int length = s.length();
		System.out.println(length);
		
		String replace = s.replace("n", "N");
		System.out.println(replace);
		
		String replace2 = s.replace("Infotech", "Selenium");
		System.out.println(replace2);
		
		String replaceAll = s.replaceAll(s, "cochin Branch Inmakes");
		System.out.println(replaceAll);
		
		int indexOf = s.indexOf("e");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		
		String e = "  I  N  M  A  K  E  S  ";
		String trim = e.trim();
		System.out.println(trim);
		
		String replace3 = e.replace("  ", "");
		System.out.println(replace3);
		
		String substring = s.substring(1, 12);
		System.out.println(substring);
		
		String s1 = "Inmakes";
		String s2 = "Infotech";
		
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		String concat = s1.concat(s2);
		System.out.println(concat);
			
		
	}

}
