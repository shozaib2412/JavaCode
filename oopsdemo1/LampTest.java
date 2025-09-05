package oopsdemo1;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 3, 2025
 * Time    : 10:33:43 AM
 * Project : CoreJava
 */

//Java Program to implement instance class & main class in a Single file

//instance class 
class Lamp{
	// stores the value for light
	// true if light is on
	// false if light is off
	boolean isOn;

	//method to turn On the light
	void turnOn() {
		isOn = true ;
		System.out.println("Light on? "+isOn);
	}

	//method to turn Off the light
	void turnOff() {
		isOn = false ;
		System.out.println("Light on? "+isOn);
	}
}


public class LampTest {
	public static void main(String[] args) {
		//create an object led & halogen
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		//switch on led & halogen
		led.turnOn();
		halogen.turnOn();
		
		//switch off led and halogen
		led.turnOff();
		halogen.turnOff();
	}
}

