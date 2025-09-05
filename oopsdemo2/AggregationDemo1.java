package oopsdemo2;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 4, 2025
* Time    : 11:53:36 AM
* Project : CoreJava
*/

public class AggregationDemo1 {

	public static void main(String[] args) {
		
		Address ad1 = new Address("Bengaluru", "Karnataka", "India", 566061);
		Address ad2 = new Address("Prague", "Austin", "Czech Republic", 777777);
		
		Student s1 = new Student(101, "Ravii", ad1);
		Student s2 = new Student(102, "Sonu", ad2);
		
		s1.display();
		s2.display();  

	}

}
