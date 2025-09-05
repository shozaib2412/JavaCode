package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 2, 2025
 * Time    : 10:01:42 AM
 * Project : CoreJava
 */

public class ArraysIO {

	public static void main(String[] args) {

		int[] marks = {78,56,23,44,90,98,67,55,35,84};

		System.out.println("********************** Arrays of Marks ***********************");
		for (int i = 0 ; i< marks.length; i++) {
			System.out.println(marks[i]+"\t");
		}
		System.out.println();
		System.out.println("The size of array : " +marks.length);
		System.out.println("First element of array is : " +marks[0]);
		System.out.println("Last element of array is : " +marks[marks.length-1]);

		//enter values to array at run time 
		System.out.println("***************************************************************");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Total no of students : ");
		int n= scanner.nextInt();

		int marks2[] = new int[n];    //declare array & allocate memory of size n

		System.out.println("Enter marks2 array Elements");
		for (int i =0 ; i<n ; i++) {
			marks2[i] = scanner.nextInt(); 
		}

		System.out.println("***************** Marks2 Array Contents*************************");
		for (int i = 0 ; i< marks2.length; i++) {
			System.out.print(marks2[i]+" ");

		}
		System.out.println();
		System.out.println("Display marks array without loop");
		System.out.println(Arrays.toString(marks));

		scanner.close();
	}

}
