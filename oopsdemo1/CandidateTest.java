package oopsdemo1;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 3, 2025
* Time    : 12:14:55 PM
* Project : CoreJava
*/

public class CandidateTest {

	public static void main(String[] args) {
		
		Candidate cd1 = new Candidate(101 ,"James Gosling" , 5000.00f );
		Candidate cd2 = new Candidate(102,"RK Rowling" , 6000.00f);
		
		cd1.calculateDA();
		cd1.display();
		
		cd2.calculateDA();
		cd2.display();
	}

}
