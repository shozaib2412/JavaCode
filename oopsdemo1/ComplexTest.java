package oopsdemo1;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 3, 2025
* Time    : 12:31:16 PM
* Project : CoreJava
*/

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(10.3, 67.4);
		Complex c2 = new Complex(0.7, 3.6);
		Complex c3 = new Complex(1.0, 1.0);
		
		c1.add(c2);   // calls method add by passing obj c2
		System.out.print("This addition of 2 complex numbers is : ");
		c1.display();
		
		c1.add(c3);   // calls method add by passing obj c3
		System.out.print("This addition of 2 complex numbers is : ");
		c1.display();
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter real and imaginary part of complex numbers: ");
		double r = sc.nextDouble();
		double i = sc.nextDouble();
		
		Complex c4 = new Complex(r, i);
		
		c2.add(c4);
		System.out.print("The addition of 2 complex number is :");
		c2.display();
		
		sc.close();
	}

}
