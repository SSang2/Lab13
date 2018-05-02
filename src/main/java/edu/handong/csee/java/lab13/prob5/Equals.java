package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;		//import the java Scanner 
public class Equals {		//public modifier class Equals
	public static boolean equals(int[][] m1, int[][] m2) {	//public static boolean method called equals includes integer double array m1 and m2
		int count = 0;		//declare the integer value count
		if (m1.length != m2.length) // if the number of row is different, return false
			return false;			//returns false value
		for (int i = 0; i < m1.length; i++) //for statement: when the integer value i = 0, i is less than length of m1, increase the i value one by one
		{
			for (int j = 0; j < m1[i].length; j++)	//for statement: when the integer value j = 0, j is less than length of m1 array value, increase the j value one by one
			{
				if (m1[i][j] != m2[i][j])		//if the array value of m1 is not equals to array value of m2
					count++;		//increase the count value one by one
			}
		}
		if(count <= 3)		//if the count number is less than or equal to 3
			return true;		//returns true value
		else		//else
			return false;		//returns false value
	}
	public static void main(String[] args) {	//public modifier static main method
		int n1, n2 = 0;			//declare the integer value n1 and n2
		Scanner keyboard = new Scanner(System.in);		//instantiate Scanner class called keyboard
		System.out.print("Enter row size(maximum 5): ");		//print out "Enter row size(maximum 5): "
		n1 = keyboard.nextInt();		//get the input n1
		System.out.print("Enter column size(maximum 5): ");		//print out "Enter column size(maximum 5): "
		n2 = keyboard.nextInt();		//get the input n2
		int[][] m1 = new int[n1][n2];		//integer array value m1 
		System.out.print("Enter row size(maximum 5): ");		//print out "Enter row size(maximum 5): "
		n1 = keyboard.nextInt();		//get the input value n1
		System.out.print("Enter column size(maximum 5): ");		//print out "Enter column size(maximum 5): "
		n2 = keyboard.nextInt();		//get the input value n2
		int[][] m2 = new int[n1][n2];		//declare the new instance double integer array includes n1 and n2 values
		System.out.print("Enter List1: ");			//print out "Enter List1: "
		for (int i = 0; i < m1.length; i++)		//for statement: when the integer value i = 0, i is less than length of m1, increase the i value one by one
			for (int j = 0; j < m1[i].length; j++)	//for statement: when the integer value j = 0, j is less than length of m1 array i value, increase the j value one by one
				m1[i][j] = keyboard.nextInt();		//get the input m1 which is an array values
		System.out.print("Enter list2: ");			//print out "Enter list2:"
		for (int i = 0; i < m2.length; i++){	//for statement: when the integer value i = 0, i is less than length of m2 value, increase the i value one by one
			for (int j = 0; j < m2[i].length; j++)	//for statement: when the integer value j = 0, j is less than length of m2 array i value, increase the j value one by one
				m2[i][j] = keyboard.nextInt();		//get the input m2 which is an array values
		}
		for (int i = 0; i < m1.length; i++){ //for statement: when the integer value i = 0, i is less than length of m1 value, increase the i value one by one
			for (int j = 0; j < m1[i].length; j++)	//for statement: when the integer value j = 0, j is less than length of m1 array i value, increase the j value one by one
				System.out.print(m1[i][j] + " ");		//print the m1[i][j] + " "
			System.out.println();		//print out
		}
		System.out.println();				//print out
		for (int i = 0; i < m2.length; i++){		//if the integer value 
			for (int j = 0; j < m2[i].length; j++)	//for statement: when the integer value j = 0, j is less than length of m2 array i value, increase the j value one by one
				System.out.print(m2[i][j] + " ");	//print the m2[i][j] + " "
			System.out.println();		//print out
		}
		System.out.println();		//print out


		if (equals(m1, m2)) 
			System.out.println("The two arrays are approximately identical.");		//print out "The two arrays are approximately identical."
		else 
			System.out.println("The two arrays are not identical");		//print out "The two arrays are not identical"



	}
}

