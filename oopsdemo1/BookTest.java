package oopsdemo1;

import java.util.Scanner;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 3, 2025
 * Time    : 10:01:17 AM
 * Project : CoreJava
 */

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();

		b1.setBookId(101);
		b1.setBookName("Programming in C");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");

		System.out.println("********** Book Details **************");
		b1.display();
		System.out.println(b1.getBookId()+", "+b1.getBookName()+", "+b1.getPrice()+ ", "+b1.getPublisher());

		System.out.println("Discounted price of book : "+b1.discountPrice());

		System.out.println(b1);  //invoke the toString method of instance class
		
		Scanner sc = new Scanner(System.in);

		Book b2 = new Book();

		System.out.println("Enter Book id, name , price & publisher : ");
		b2.setBookId(sc.nextInt());
		sc.nextLine();
		b2.setBookName(sc.nextLine());
		b2.setPrice(sc.nextFloat());
		sc.nextLine();
		b2.setPublisher(sc.nextLine());
		sc.close();

		System.out.println("********** Book Details **************");
		b2.display();
		System.out.println("Book Id            :"+b2.getBookId());
		System.out.println("Book Name          :"+b2.getBookName());
		System.out.println("Book Price         :"+b2.getPrice());
		System.out.println("Book Publisher     :"+b2.getPublisher());
		System.out.println("Discounted Price   :"+b2.discountPrice());
		System.out.println("***************************************");
		System.out.println();
		System.out.println(b2.getBookId()+", "+b2.getBookName()+", "+b2.getPrice()+ ", "+b2.getPublisher());

		System.out.println("Discounted price of book : "+b2.discountPrice());

		System.out.println(b2);

	}

}

