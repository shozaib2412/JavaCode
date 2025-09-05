package oopsdemo1;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 2, 2025
* Time    : 4:42:15 PM
* Project : CoreJava
*/

//main class to test employee class methods 

public class CoforgeEmployeeTest {

	public static void main(String[] args) {
		Employee developer = new Employee();
		Employee tester = new Employee();
		Employee sales = new Employee();
		
		System.out.println("************ Coforge Technologies ***************");
		
//		invoke methods (method calls)
		developer.inputEmployeeDetails();   //p1.eat
		developer.calculateNetSalary();
		developer.displayEmployeeDetails();
		
		tester.inputEmployeeDetails();   //p1.eat
		tester.calculateNetSalary();
		tester.displayEmployeeDetails();
		
		sales.inputEmployeeDetails();   //p1.eat
		sales.calculateNetSalary();
		sales.displayEmployeeDetails();
	}

}
