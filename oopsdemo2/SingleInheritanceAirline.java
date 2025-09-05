package oopsdemo2;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 3, 2025
* Time    : 4:54:50 PM
* Project : CoreJava
*/

public class SingleInheritanceAirline {

	public static void main(String[] args) {
		
		AirlineBooking booking1 = new AirlineBooking("James Gosling" , 32 , "FG567766");
		
		booking1.bookTicket();
		booking1.displayBookingDetails();
		booking1.displayPassengerDetails();
		
		AirlineBooking booking2 = new AirlineBooking("Rod Johnson" , 32 , "ZWER6766");
		
		
		booking2.bookTicket();
		booking2.displayBookingDetails();
		booking2.displayPassengerDetails();
		

	}

}
