package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet {	//public modifier class Cat and inherits Animal & implements Pet interface
	public String food()	//public modifier method 'food', returns string values
	{
		return "(Cat!)" +"Fish";	//return "(Cat!)" + "Fish"
	}

}
