package edu.handong.csee.java.lab13.prob2;

public class Book_main {	//public modifier class Book_main

	public static void main(String[] args) {		//public modifier main method (static)
		Book book = new Book("Simple Book");	//instantiate the Book class & provide "Simple Book"
		Science science = new Science("Hello Physics!", "ScienceWorld"); 	//instantiate the Science class & provide "Hello Physics!", "ScienceWorld" with inheritance of Book class
		History history1 = new History("What Is history?", "E.H.Carr" );	//instantiate the History class & provide "What Is history?", "E.H.Carr" with inheritance of Book class
		History history2 = new History("The South Korea", "Judis");		//instantiate the History class & provide "The South Korea", "Judis" with inheritance of Book class
		book.show();	//call show method of book
		science.show();		//call show method of science
		history1.show();	//call show method of history1
		history2.show();	//call show method of history2
	}
}

