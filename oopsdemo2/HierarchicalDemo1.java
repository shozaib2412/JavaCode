package oopsdemo2;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 4, 2025
 * Time    : 10:41:33 AM
 * Project : CoreJava
 */

//Java program to implement Hierarchical Inheritance
//		 * 
//		 * 				Doctor
//		 *     Specialist	 NonSpecialist
//		 

public class HierarchicalDemo1 {

	public static void main(String[] args) {


		//invoke child class Specialist constructor
		Specialist spObj1=new Specialist(1001,"Mary","New York","Cardiologist");
		Specialist spObj2=new Specialist(1001,"Jane","Sydney","Orthopedic");
		Specialist spObj3=new Specialist(1001,"Spider","Sudan","Neurologist");


		spObj1.display(); // invoke child class Specialist display() method
		spObj2.display(); 
		spObj3.display(); 

		//invoke child class NonSpecialist constructor
		NonSpecialist nspObj=new NonSpecialist(1005,"John","Sydney");

		nspObj.display();// invoke base class Doctor display() method

	}

}
