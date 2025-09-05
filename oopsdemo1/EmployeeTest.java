package oopsdemo1;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 2, 2025
* Time    : 4:42:15 PM
* Project : CoreJava
*/

//main class to test employee class methods 

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
//		invoke methods (method calls)
		e1.inputEmployeeDetails();   //p1.eat
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails();   //p1.eat
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();
		
		e3.inputEmployeeDetails();   //p1.eat
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();
	}

}
