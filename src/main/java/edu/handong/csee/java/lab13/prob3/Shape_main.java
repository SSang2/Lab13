package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;		//import the java Scanner

public class Shape_main {		//public modifier class Shape_main

	public static void main(String[] args) {		//public static main method

		double n1, n2;		//declare the n1 and n2 is double value
		Scanner keyboard = new Scanner(System.in);  //instantiate Scanner class called keyboard

		System.out.print("Enter radius: ");		//print the "Enter radius: "
		n1 = keyboard.nextDouble();		//input n1 (double)
		Circle c1 = new Circle(n1);		//instantiate Circle class

		System.out.println("Radius: "+ c1.get_Radius());	//print out "Radius: "+ c1.get_Radius()
		c1.display();		//display the c1

		System.out.print("Enter length and width: ");	//print the "Enter length and width: "
		n1 = keyboard.nextDouble();		//input n1 (double)
		n2 = keyboard.nextDouble();		//input n2 (double)
		Rectangle r1 = new Rectangle(n1, n2);		//instantiate Rectangle class

		System.out.println("Length: "+ r1.get_Length());	//print out "Length: "+ r1.get_Length()
		System.out.println("Width: "+ r1.get_Width());		//print out "Width: "+ r1.get_Width()
		r1.display();		//display the r1
	}



}
