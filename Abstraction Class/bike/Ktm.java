package org.bike;

public class Ktm extends Bike{

	@Override
	void speed() {
		System.out.println("Bike Speed : 120kmph");
		
	}
	@Override
	public void cost() {
		System.out.println("Bike cost is : 1.7Lacks");
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		
		k.speed();
		k.cost();
				
	}

}
