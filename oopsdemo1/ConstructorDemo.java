package oopsdemo1;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 3, 2025
 * Time    : 11:49:01 AM
 * Project : CoreJava
 */

public class ConstructorDemo {

	int id;
	String name ;
	float salary;

	public ConstructorDemo() {
		System.out.println("I am implicit constructor ");
		id = 101;
		name = "Mike";
		salary = 5000.00f;
	}

	// generate Constructor with arguments
	// Source Menu -> Generate Constructor using Fields
	// --> Select All --> Generate Button
	public ConstructorDemo(int id, String name, float salary) {
		System.out.println("I am Parameterized Constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}


	public static void main(String[] args) {
		ConstructorDemo cd1 = new ConstructorDemo();  //invokes implicit constructor 
		ConstructorDemo cd2 = new ConstructorDemo(102 , "John" , 6000.00f);
		ConstructorDemo cd3 = new ConstructorDemo(103 , "Gavin" , 5000.00f);  //invoke parameterized constructor
		
//		ConstructorDemo cd4 = new ConstructorDemo(); // this will be called automatically when an obj is created 
//		ConstructorDemo cd5 = new ConstructorDemo();
		
		cd1.display();
		cd2.display();
		cd3.display();
	}

}
