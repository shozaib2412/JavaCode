package controlflow;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 2:26:21 PM
* Project : CoreJava
*/

public class DoWhileDemo2 {

	public static void main(String[] args) {
		int i = 20;
		
		do {
			System.out.println(i+"\t");
			i = i+1;
			
		}while(i<=50);
		
		System.out.println("******************** Guess Name **********************");
		String guess;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		
		do {
			System.out.println("Guess my Name ");
			guess=scanner.next();
		} while(!"James".equals(guess));
		System.out.println("Congratulations you guessed name correctly"+guess);
		scanner.close();
				

	}

}
