package oopsdemo1;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 3, 2025
* Time    : 10:46:58 AM
* Project : CoreJava
*/

public class Bicycle {
	
	int gear ;
	
	void applyBrake() {
		System.out.println("Applying Brakes.....");
	}
	
	public void startCycling() {
		gear = gear+1;
		System.out.println("Cycling in gear no :"+gear);
	}
	

	public static void main(String[] args) {
		Bicycle sportsBicycle = new Bicycle();
		
		sportsBicycle.startCycling();
		sportsBicycle.startCycling();
		sportsBicycle.startCycling();
		sportsBicycle.applyBrake();

	}

}
