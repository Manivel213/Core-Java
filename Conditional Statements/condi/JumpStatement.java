package org.condi;

public class JumpStatement {
	public static void main(String[] args) {

		// Break Statement

		// for (int i = 0; i <= 10; i++) {
		// if (i==5) {
		// break;
		// }
		// System.out.println(i);
		// }
		// System.out.println("End......");
		
		
		//Continue Statement

		//for (int i = 0; i <= 10; i++) {
			//if (i == 5) {
				//continue;
			//}
			//System.out.println(i);
		//}
		//System.out.println("End......");
		
		//exit statement
		
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				System.exit(i);
			}
			System.out.println(i);
		}
		System.out.println("End......");
		

	}
}