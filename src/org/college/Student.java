package org.college;

public class Student {
	private void studentName() {
		System.out.println("GRT IET");
	}
	private void studentCode() {
		System.out.println("1103");
	}
	private void studentRank() {
		System.out.println("1st Rank");
	}
	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentCode();
		s.studentName();
		s.studentRank();
	}

}
