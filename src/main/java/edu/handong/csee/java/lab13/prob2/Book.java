package edu.handong.csee.java.lab13.prob2;

public class Book {		//public modifier class Book
	private static int idCount = 0;		//call private static integer idCount
	private String BookName;		//call private String type BookName
	private int id;				//call private integer id
	
	public Book(String Name)		//call constructor and obtain Name
	{
		this.BookName = Name;	//provide published value into instance 'BookName'
		idCount++;		//increase idCount value one by one 
		id = idCount;	//id is equals to idCount
	}
	public String toString()	//public modifier String type method toString
	{
		return "\n\tId: " + id + "\n\tBook Name: " + BookName;	//call the return value which is the BookName
	}
	public void show()	//public modifier method show
	{
		System.out.println("<<<BOOK>>>" + this.toString());		//print out the BOOK
	}
}


