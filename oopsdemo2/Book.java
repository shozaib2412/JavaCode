package oopsdemo2;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 4, 2025
 * Time    : 12:09:10 PM
 * Project : CoreJava
 */

public class Book {

	private String name ;
	private int price;

	//Agregation
	private Author author;
	private Publisher publisher;

	public Book(String name, int price, Author author, Publisher publisher) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}

	void display()
	{
		System.out.println("*************** Book Details ****************");
		System.out.println("Book Name    : "+name);
		System.out.println("Book Price   : "+price);

		System.out.println("------------Author Details----------");
		System.out.println("Author Name  : "+author.authorName);
		System.out.println("Author Age   : "+author.age);
		System.out.println("Author place : "+author.place);

		System.out.println("------------Publisher Details-------");
		System.out.println("Publisher Name: "+publisher.name);
		System.out.println("Publisher ID  : "+publisher.publisherID);
		System.out.println("Publisher City: "+publisher.city);

	}

}
