package oopsdemo2;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 3, 2025
 * Time    : 4:40:21 PM
 * Project : CoreJava
 */

public class Passenger {

	//	 * Single Inheritance example in Java for an Airline Booking System



	private String name;
	private int age;
	private String passportNumber;

	public Passenger(String name, int age, String passportNumber) {
		super();
		this.name = name;
		this.age = age;
		this.passportNumber = passportNumber;
	}

	//genearete constructor

	public void displayPassengerDetails() {
		System.out.println("----- Passenger Details -----");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Passport Number: " + passportNumber);
	}

}
