package org.univ;

public class College extends University {
	@Override
	public void ug(String Department) {
		System.out.println("Which Department : " + Department);
	}

	@Override
	public void pg(int Students) {
		System.out.println("Number of Students : " + Students);
	}

	private void ug() {
		System.out.println("Under Gratuate");

	}

	private void pg() {
		System.out.println("Post Gratuate");

	}
	public static void main(String[] args) {
		
		College c = new College();
		c.ug();
		c.ug("EEE");
		c.pg();
		c.pg(30);
	}

}
