package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape {	//public modifier class Rectangle and inherits the Shape class
	private double length;		//private modifier double class called length
	private double width;		//private modifier double class called width
	public Rectangle(double length, double width)	//public constructor Rectangle get double class length& width
	{
		this.length = length;	//provide published value into instance 'length'
		this.width = width;		//provide published value into instance 'width'
	}
	public double area()		//public modifier double type method area
	{
		return length * width;	//returns length * width value
	}
	public double perimeter()	//public modifier double type method perimeter
	{
		return 2*(length+width);	//returns 2*(length+width) value
	}
	public double get_Length()	//public modifier double type method get_Length
	{
		return length;		//returns length value
	}
	public double get_Width()	//public modifier double type method get_Width
	{
		return width;		//returns width value
	}
}

