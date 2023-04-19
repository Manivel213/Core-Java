package org.bank;

public class AxisBank extends BankInfo{
	
	@Override
	public void saving(String Name) {
		System.out.println("Saving Account Holder Name is  : " + Name);
	}
	@Override
	public void fixed(long AccountNumber) {
		System.out.println("Fixed Amount is  : " + AccountNumber);
	}
	@Override
	public void deposite(float deposite) {
		System.out.println("Deposite Amount is : " + deposite);
	}

	
	private void deposite() {
		

	}
	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		a.fixed(110311105311l);
		a.saving("Velan Mani");
		a.deposite();
		a.deposite(300000f);
	}
	

}
