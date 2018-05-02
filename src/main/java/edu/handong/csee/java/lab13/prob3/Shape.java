package edu.handong.csee.java.lab13.prob3;

public abstract class Shape {	//public modifier abstract class call Shape
	public abstract double area();		//public modifier abstract double method called area
	public abstract double perimeter();		//public modifier abstract double method called perimemter
	public void display()		////public void method called display
	{
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() +"\n");	//print out "Area: "+area()+"\nPerimeter: "+perimeter() +"\n"
	}
}
