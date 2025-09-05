package controlflow;

import java.util.Scanner;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 1, 2025
 * Time    : 12:12:34 PM
 * Project : CoreJava
 */

public class SwitchDemo3 {

	public static void main(String[] args) {
//		Program to display Shirt size using switch -case statement


		int number;
		String size;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter ur Shirt Size:");
		number=s.nextInt();
		s.close();

		// switch statement to check size
		switch (number) {
		case 1:
		case 2:
		case 3:

			size="Kids";
			break;
		case 29:
			size = "Small";
			break;

		case 42:
			size = "Medium";
			break;

		case 44:
			size = "Large";
			break;

		case 48:
			size = "Extra Large";
			break;

		default:
			size = "Unknown";
			break;

		}
		System.out.println("Size: " + size);

	}

}
