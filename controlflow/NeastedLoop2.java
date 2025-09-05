package controlflow;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 4:17:04 PM
* Project : CoreJava
*/

public class NeastedLoop2 {

	public static void main(String[] args) {
		int weeks  = 3, days =  7 , i = 1;
		while (i<= weeks) {
			System.out.println("week : "+i);
			for(int j = 1 ; j <= days; j++ ) {
				System.out.println("\t"+"day : "+j);
			}
			i=i+1;
		}

	}

}
