package controlflow;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 1, 2025
* Time    : 12:52:29 PM
* Project : CoreJava
*/
/*Program to display Odd & Even Numbers between 1-10
*
* ODD  EVEN
* ---  ----
* 1    2
* 3    4
* 5    6
* 7    8
* 9    10
*/
public class OddEvenDisplay {

	public static void main(String[] args) {
		System.out.println("ODD \t EVEN");
		System.out.println("---- \t ----");
		
		for(int i = 1; i<=10 ; i++ ) {
			if(i % 2 != 0) {
				System.out.print(i+"\t");
			}else {
				System.out.println(i);
			}
			
		}

	}

}
