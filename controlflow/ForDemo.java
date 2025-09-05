package controlflow;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 2:54:40 PM
* Project : CoreJava
*/
//For Loop Demonstration -
//use For Loop, when u want to execute a loop fixed no. of times

public class ForDemo {

	public static void main(String[] args) {
		int i,j;
		
		System.out.println("Display nos from 1-25");
		for(i=1;i<=25;i++) {
			System.out.print(i+"\t");
		}

		System.out.println();
		System.out.println("Display NOS from 100-75");
		for(j=100;j>=75;j--) {
			System.out.print(j+"\t");
			
		}
	}

}
