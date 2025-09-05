package controlflow;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 4:08:55 PM
* Project : CoreJava
*/

public class NestedLoopDemo {

	public static void main(String[] args) {
		for (int i = 1 ; i <=5 ; i++) {
			for (int j = 1 ; j <= i ; j++ ) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}

}
