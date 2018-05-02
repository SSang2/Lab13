package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape {		//public modifier class Circle and inherits the Shape class
	private double radius;	//private modifier double method radius
	public Circle(double r)		//public modifier method Circle and it gets double r
	{
		radius = r;		//returns r value
	}
	public double area()	//public modifier double method area
	{
		return Math.PI * Math.pow(radius, 2); //returns value pi * r * r
	}
	public double perimeter()		//public modifier double method perimeter
	{
		return 2.0 * Math.PI * radius; //returns value 2 * pi * radius
	}
	public double get_Radius()		//public modifier double method get_Radius
	{
		return radius;	//returns radius value
	}
}
