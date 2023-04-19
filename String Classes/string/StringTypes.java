package org.string;

public class StringTypes {
	public static void main(String[] args) {
		
		System.out.println("Literal String : - ");
		
		String s1 = "Inmakes";
		String s2 = "Infotech";
		
		System.out.println("s1 : " + System.identityHashCode(s1));
		System.out.println("s2 : " + System.identityHashCode(s2));
		
		String s3 = "Inmakes";
		System.out.println("s3 : " + System.identityHashCode(s3));
		
		System.out.println("\nNon Literal String : - ");
		
		String s4 = new String("Java");
		String s5 = new String("Selenium");
		
		System.out.println("s4 : " + System.identityHashCode(s4));
		System.out.println("s5 : " + System.identityHashCode(s5));
		
		String s6 = new String("Selenium");
		System.out.println("s6 : " + System.identityHashCode(s6));
		
		System.out.println("\nImmutable String : - ");
		
		String s7 = "Phython";
		String s8 = "Selenium";
		
		System.out.println("s7 : " + System.identityHashCode(s7));
		System.out.println("s8 : " + System.identityHashCode(s8));
		
		s7 = s8.concat(s7);
		System.out.println(s7);
		
		System.out.println("s7 : " + System.identityHashCode(s7));
		
		System.out.println("\nMutable String : - ");
		
		StringBuffer s9 = new StringBuffer("Framework");
		StringBuffer s10 = new StringBuffer("Class");
		
		System.out.println("s9 : " + System.identityHashCode(s9));
		System.out.println("s10 : " + System.identityHashCode(s10));
		
		s9 = s9.append(s10);
		System.out.println(s9);
		
		
	}

}
