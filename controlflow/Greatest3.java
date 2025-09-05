package controlflow;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 10:22:05 AM
* Project : CoreJava
*/

public class Greatest3 {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 3 Numbers : " );
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if(a>b && a>c) {
			System.out.println(+a+" is the Greatest of 3");
		}else if(b>c) {
			System.out.println(+b+" is the Greatest of 3");
		}else if(a==b && b==c) {
			System.out.println("All are equal");
		}else {
			System.out.println(+c+" is the Greatest of 3");
		}
		scanner.close();

	}

}
