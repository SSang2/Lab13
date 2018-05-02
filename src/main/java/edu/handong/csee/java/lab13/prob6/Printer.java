package edu.handong.csee.java.lab13.prob6;

public class Printer {		//public modifier class Printer
	public static void print(Object object)		//call the public static void constructor & obtain the object
	{
		String str = object.toString();		//call String type str of toString method 
		if(object instanceof CapitalPrintable)	//if object is instance of CapitalPrintable
			str = str.toUpperCase();		//call str of toUpperCase method
		System.out.println(str);		//print out str
	}

}
