package controlflow;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 12:28:51 PM
* Project : CoreJava
*/

//Program to display ur name 10 times & nos from 1-10
public class WhileDemo {

	public static void main(String[] args) {
		int i = 1 ;
		
		while(i<= 10) {
			System.out.println(i+".James");
			
			i = i+1;
		}
		System.out.println("Exit Loop");
		
		System.out.println("************ Reverse Loop ***************");
		int j = 10;
		while (j>=1) {
			System.out.println(j+"\t");
			j=j-1;
		}
		System.out.println("Loop Ended");
	}

}
