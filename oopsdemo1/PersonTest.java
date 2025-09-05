package oopsdemo1;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 3, 2025
* Time    : 2:22:33 PM
* Project : CoreJava
*/

public class PersonTest {

	public static void main(String[] args) {
		
		Person objPerson1 = new Person();
		
		objPerson1.input();
		objPerson1.print();
		
		System.out.println("---------------------------------------------");
		Person objPerson2 = new Person("Mike" , 45);
		
		objPerson2.print();
		
		System.out.println("---------------------------------------------");
		Person objPerson3 = new Person("Navin" ,"Chennai", 45);
		objPerson3.print();
		
		System.out.println("---------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name , Constituency, Age: ");
		String name = sc.next();
		String c = sc.next();
		int a = sc.nextInt();
		
		Person objPerson4 = new Person(name , c , a);
		objPerson4.print();
		sc.close();
		
		
		
	}

}
