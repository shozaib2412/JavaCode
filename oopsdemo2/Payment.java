package oopsdemo2;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 4, 2025
* Time    : 12:44:22 PM
* Project : CoreJava
*/

public class Payment {
	private String paymentId;
	private double amount;
	private String mode;
	
	public Payment(String paymentId, double amount, String mode) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.mode = mode;
	}
	
	public void displayPayment() {
		System.out.println("Payment ID: " +paymentId);
		System.out.println("Amount    : " +amount);
		System.out.println("Mode      : " +mode);
	}
}
