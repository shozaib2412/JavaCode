package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Aug 30, 2025
 * Time    : 10:35:39 AM
 * Project : CoreJava
 */

public class BufferReaderDemo {

	public static void main (String args []) throws Exception{
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		System.out.println("Enter Your Name : ");
		String name  = br.readLine();
		System.out.println("Enter Your Age : ");
		int age = Integer.parseInt(br.readLine());



		System.out.println("Enter Your Salary : ");
		int salary = Integer.parseInt(br.readLine());

		System.out.println("Welcome " +name+ ", your Age is : " +age+". And Your Salary is : "+salary);

		r.close();
		br.close();

	}

}
