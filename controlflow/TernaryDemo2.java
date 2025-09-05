package controlflow;

import java.util.Scanner;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 1, 2025
 * Time    : 11:53:36 AM
 * Project : CoreJava
 */

public class TernaryDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Program to Check whether entered alphabet using Ternary Operator


		char myChar;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter a Character :");
		myChar=scanner.next().charAt(0); // Take Single character Input
		
		scanner.close();

		// Ternary Operator
		String output = (myChar >= 'a' && myChar <= 'z') || (myChar >= 'A' && myChar <='Z') ? myChar+" is an Alphabet" : myChar+" is not an Alphabet";
		System.out.println(output);

	}

}
