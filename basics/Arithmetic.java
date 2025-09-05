package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Aug 30, 2025
* Time    : 11:26:18 AM
* Project : CoreJava
*/

public class Arithmetic {

	public static void main(String[] args) throws IOException{
		
		//declaration of variables 
		int a , b , sum, sub, mul;
		float div ;
		String name ;
		
		//BufferedReader for input 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Input Statement - Take input using BufferedReader 
		System.out.println("Enter 2 Numbers : ");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Your Name : ");
		name = br.readLine();
		
		
		//Process
		sum = a+b;
		sub = a-b;
		mul = a*b;
		div = (float)a/b;
		System.out.println("*********************************************");
		System.out.println("The name of developer is : "+name);
		System.out.println("The Sum of 2 Numbers is : "+sum);
		System.out.println("The Substraction of 2 Numbers is : "+sub);
		System.out.println("The Product of 2 Numbers is : "+mul);
		System.out.println("The Division of 2 Numbers is : "+div);
		System.out.println("*********************************************");
		
		
	}

}
