package edu.handong.csee.java.lab13.prob4;

public class Animal {	//public modifier class Animal
	private String name;	//call String type 'name'
	public void setName(String name)	//call the constructor (setName()) & obtain the name
	{
		this.name = name;	//provide published value into instance 'name'
	}
	public void getName()		//call the constructor (getName())
	{
		System.out.println("Name: "+name);	//print out the Name
	}
}
