package basics;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Aug 30, 2025
* Time    : 9:34:10 AM
* Project : CoreJava
* This program calculates the sum and avg of a set of numbers.
*/

public class SumAverage {
	public static void main(String[] args) {
		System.out.println();
		
		int number1, number2, number3 , sum ;
		float avg;
		Scanner scanner = new Scanner(System.in) ; //declare scanner object 
		
		System.out.println("Enter your organisation : ");
		String org = scanner.nextLine();
		
		System.out.println("Enter three numbers : ");
		
		//take input
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		number3 = scanner.nextInt();
		
		scanner.nextLine();  //for pause 
		System.out.print("Enter Your Name :");
		String name = scanner.nextLine();
		
		//process
		sum = number1+number2+number3;
		avg = (float)sum/3;
		
		System.out.println("*************************************");
		System.out.println("The sum of 3 numbers is : " +sum);
		System.out.println("The avg of 3 numbers is : " +avg);
		System.out.println("Coded by " +name+ " at "+org+" training");
		System.out.println("*************************************");
		
		scanner.close();
	}

}
