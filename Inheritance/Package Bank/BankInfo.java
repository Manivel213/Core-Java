package org.bank;

public class BankInfo extends AxisBank{
	private void saving() {
		System.out.println("Saving Account");

	}
	private void fixed() {
		System.out.println("Fixd Account");

	}
	public static void main(String[] args) {
		
		BankInfo b = new BankInfo();
		
		b.deposit();
		b.saving();
		b.fixed();
	}

}
