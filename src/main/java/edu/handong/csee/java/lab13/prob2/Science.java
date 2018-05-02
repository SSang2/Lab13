package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {		//public modifier Science class and inherits the Book class
	private String publisher;		//call String class publisher
	public Science(String Name, String Publisher)		//constructor get String class Name & Publisher
	{
		super(Name);		//call super class and string value for input (name)
		this.publisher = Publisher;		//provide published value into instance 'Publisher'
	}
	public String toString()			//public modifier String type method toString
	{
		return super.toString() + "\n\tPublisher: " + publisher;	//call the return value which is the publisher name
	}
	public void show()		//public modifier method show
	{
		System.out.println("<<<Science>>>" + this.toString());		//print out the science
	}
}
