package controlflow;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 3:10:02 PM
* Project : CoreJava
*/

public class Multiplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int num , i;
		System.out.println("Enter the Number : ");
		num = scanner.nextInt();
		System.out.println("Multiplication table of : "+num);
		for(i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i );
		}
		scanner.close();

	}

}
