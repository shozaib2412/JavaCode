package oopsdemo1;

import java.util.Scanner;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 2, 2025
* Time    : 4:11:26 PM
* Project : CoreJava
*/

//javaClass to define blueprint of a Student 

//instance class

public class Student {

	private int rollNumber;
	private String name , course ;
	private float m1,m2,m3,total ;
	
	Scanner scanner = new Scanner(System.in);
	// instance methods/behaviour, functions 
	// JVM will invoke default constructor for initialization of object 
	public void input() {
		System.out.println("Enter roll No, Name , Course");
		rollNumber = scanner.nextInt();
		name = scanner.next();
		course = scanner.next();
		
		System.out.println("Enter Marks of 3 students :");
		m1 = scanner.nextFloat();
		m2 = scanner.nextFloat();
		m3 = scanner.nextFloat();	
	}
	
	public float calculate() {
		total = m1+m2+m3;
		return total;
	}
	public void display() {
		System.out.println("************ Student Details **************");
		System.out.println("Roll No             :"+rollNumber);
		System.out.println("Name                :"+name);
		System.out.println("Course              :"+course);
		System.out.println("Total Marks         :"+total);
		System.out.println("********************************************");
	}
}
