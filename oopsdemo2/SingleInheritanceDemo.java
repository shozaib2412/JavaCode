package oopsdemo2;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 3, 2025
* Time    : 4:31:36 PM
* Project : CoreJava
*/

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		Developer d1 = new Developer(101, "James Gosling", "JDBC", "Santender Bank");
		Developer d2 = new Developer(105, "Rod Johnson", "Spring Framework", "Virgin Atlantic");
		
		d1.display();  //child class obj invokes parent class method - inheritance 
		d1.displayDeveloperDetails(); //child class obj invoke child class method
		
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee e1 = new Employee(106, "Mike"); //invokes parent class constructor
		e1.display();
		

	}

}
