package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet {	//public modifier class Dog and inherits Animal & implements Pet interface
	public String food()	//public modifier method 'food', returns string values
	{
		return "(Dog!)"+"Sausage";		//return "(Dog!)" + "Sausage"
	}

}

