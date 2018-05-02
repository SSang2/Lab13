package edu.handong.csee.java.lab13.prob2;

public class History extends Book{		//public modifier History class and inherits the Book class
	private String Author;			//call String class Author
	public History(String Name, String Author)		//constructor get String class Name & Author
	{
		super(Name);	//call super class and string value for input (name)
		this.Author = Author;		//provide published value into instance 'Author'
	}
	public String toString()		//public modifier String type method toString
	{
		return super.toString() + "\n\tAuthor: " + Author;		//call the return value which is the Author name 
	}
	public void show()		//public modifier method show
	{
		System.out.println("<<<History>>>" + this.toString());	//print out the History
	}
}

