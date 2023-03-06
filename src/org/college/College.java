package org.college;

public class College {
	private void collegeName() {
		System.out.println("GRT IET");
	}
	private void collegeCode() {
		System.out.println("1103");
	}
	private void collegeRank() {
		System.out.println("1st Rank");
	}
	public static void main(String[] args) {
		
		College c = new College();
		
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
	}
	

}
