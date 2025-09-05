package controlflow;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 12:46:02 PM
* Project : CoreJava
*/

public class SumPositive {

	public static void main(String[] args) {
//		Java Program to find Sum of Positive Numbers

	       int sum=0,number=0;
	        Scanner input =new Scanner(System.in);

	// Loop continues until entered number is Positive
	        while(number>=0) {
	        	sum += number;
	        	System.out.println("Enter a Number : > ");
	        	number = input.nextInt();
	        }
	        System.out.println("The sum of positive no is : "+sum);
	        input.close();

	}

}
