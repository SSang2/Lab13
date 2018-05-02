package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;	//import java scanner

public class AnimalFarm {	//public modifier class AnimalFarm

	public static void main(String[] args) {	//main method
		String cat_name, dog_name;	//declare the String 'cat_name' and 'dog_name'

		Master master = new Master();
		Cat cat = new Cat();	//instantiate Cat class called cat
		Dog dog = new Dog();	//instantiate Dog class called dog

		Scanner keyboard = new Scanner(System.in);	//instantiate Scanner class called keyboard
		System.out.print("Enter the cat name and dog name: ");	//print out "Enter the cat name and dog name:"
		cat_name = keyboard.next();	//input cat name
		dog_name = keyboard.next();	//input dog name

		cat.setName(cat_name);	//call the constructor and obtain the cat name
		cat.getName();		//call the constructor and obtain the cat name which we got from the input
		master.feed(cat);	//call the feed method to carry the cat class

		dog.setName(dog_name);	//call the constructor and obtain the dog name
		dog.getName();		//call the constructor and obtain the cat name which we got from the input
		master.feed(dog);	//call the feed method to carry the cat class
	}
}
