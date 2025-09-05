package oopsdemo1;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 2, 2025
* Time    : 4:25:39 PM
* Project : CoreJava
*/
//java program to implement object oriented programming
public class StudentTest {

	public static void main(String[] args) {
//		create an object of student class
		Student s1 = new Student();
		Student s2 = new Student();

		
//		invoke methods of student class using dot operator
		s1.input();
		float tot = s1.calculate();
		s1.display();
		System.out.println("Total Displayed from main:"+tot);
		
//		invoke methods of student class using dot operator
		s2.input();
		float tot1 = s2.calculate(); 
		s2.display();
		System.out.println("Total Displayed from main"+tot1);
	}

}
