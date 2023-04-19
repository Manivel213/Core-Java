package org.excep;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		//Arithmatic Exception
		
		
		//try catch Exception method
		//System.out.println(1);
				//System.out.println(2);
				//try {
					//System.out.println(3/0);
				//} catch (ArithmeticException e) {
					//System.out.println("Anything Devided By zero is inifinity");
			//}
		
		
		
		
		
		//try Catch finally Exception methods
		//System.out.println(1);
		//System.out.println(2);
		//try {
			//System.out.println(3/0);
		//} catch (ArithmeticException e) {
			//System.out.println("Anything Devided By zero is inifinity");
	//}
		//finally {
			//System.out.println("Finally.........");
		//}
		//System.out.println(4);
		//System.out.println(5);
		
		
		
		
		//try multiple Catch Exception Method
		//System.out.println(1);
		//System.out.println(2);
		//try {
			//System.out.println(3/0);
		//} 
		//catch (IndexOutOfBoundsException e) {
			//System.out.println("Index Out of Bound");
	//}
		//catch (NumberFormatException  e) {
			//System.out.println("Cannot Convert Alphabetic to Number");
	//}
		//catch (Exception e) {
			//System.out.println("Super class.........");
	//}
		//System.out.println(4);
		//System.out.println(5);
		
		
		
		
		
		
		//try finally Exception Method
		String s = "Java";
		try {
			char charAt = s.charAt(7);
		} finally {
			System.out.println("Finally........");
		}
		
		
		
		
		
		
	}

}
