package org.poly;

public class Arts extends Education {

	@Override
	public void ug(String Department) {
		System.out.println("Which Department : " + Department);
	}

	@Override
	public void pg(int Students) {
		System.out.println("Number of Students : " + Students);
	}

	private void Bsc() {
		System.out.println("Computer Science");

	}

	private void Bed() {
		System.out.println("Education");

	}

	private void Bba() {
		System.out.println("Business Administration");

	}

	public static void main(String[] args) {

		Arts a = new Arts();
		a.ug("EEE");
		a.pg(30);
		a.Bsc();
		a.Bed();
		a.Bba();

	}
}
