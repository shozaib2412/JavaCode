package controlflow;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 10:17:46 AM
* Project : CoreJava
*/

public class OddEven {

	public static void main(String[] args) {
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		num = scanner.nextInt();
		if(num%2==0) {
			System.out.println(+num+" is Even Number");
		} else {
			System.out.println(+num+" is Odd Number");
		}
		scanner.close();
	}

}
