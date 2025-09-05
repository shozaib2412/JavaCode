package controlflow;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 2:20:31 PM
* Project : CoreJava
*/

public class DoWhiledemo {

	public static void main(String[] args) {
//		Program to enter a Positive Number & display it


		  int number;
		        Scanner scanner=new Scanner(System.in);

		        do{
		            System.out.println("Enter a Number : ");
		            number=scanner.nextInt();
		            System.out.println(number);
		        }while(number>0);
		        scanner.close();
		        System.out.println("The Entered Number is : "+number);

	}

}
