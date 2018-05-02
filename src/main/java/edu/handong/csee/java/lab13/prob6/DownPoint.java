package edu.handong.csee.java.lab13.prob6;

public class DownPoint {	//public modifier class DownPoint
	private int x, y;		//call private integer x and y
	DownPoint(int x, int y){this.x = x; this.y = y;}	//DownPoint have integer x coordinate, and y coordinate. It provide published value into instance integer x and y
	public String toString() 	//public modifier String type method toString
	{
		return "x : " + x + " y : " + y;	//return value "x : " + x + "y : " +y;
	}
}
