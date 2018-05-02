package edu.handong.csee.java.lab13.prob6;

public class UpAndDown_main {	//public modifier class UpAndDown_main

	public static void main(String[] args) {	//public modifier main method (static)
		UpPoint p1 = new UpPoint(3,3);		//instantiate UpPoint(3,3) class to p1 
		DownPoint p2 = new DownPoint(2,5);	//instantiate DownPoint(2,5) class to p2
		DownPoint p3 = new DownPoint(4,7);	//instantiate DownPoint(4,7) class to p3
		UpPoint p4 = new UpPoint(9,12);		//instantiate UpPoint(9,12) class to p4
		Printer.print(p1);		//call the print method to carry the p1
		Printer.print(p2);		//call the print method to carry the p2
		Printer.print(p3);		//call the print method to carry the p3
		Printer.print(p4);		//call the print method to carry the p4
	}
}
