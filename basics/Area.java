package basics;
/**
 * THis program calculates the area of a circle.
 * It demonstrate the use of variable, arithmetic operations,
 * and console output in java.
 * 
 * @version 1.0
 */

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius = 7.5; //radius of the circle 
		double area ; //variable to store the area 
		final double PI = 3.14159; //constant value for pi
		
		area = PI * radius * radius;
		
		//print the area to the console
		System.out.println("The area of the circle with radius" + radius + "is : " + area);
	}

}
