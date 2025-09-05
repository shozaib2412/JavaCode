package controlflow;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 9:37:12 AM
* Project : CoreJava
* 
* Program to find greatest of 2 Numbers.
*/

public class Greatest2 {

	public static void main(String[] args) {
		int a, b ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if(a>b) {
			System.out.println(+a+" is greater than "+b);
		} else {
			System.out.println(+b+" is greater than  "+a);
		}
		
		scanner.close();

	}

}
