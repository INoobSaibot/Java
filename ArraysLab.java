/*
	Chapter :  7
	Programmer: Toby stecker
	Date:		10.24.17
	Filename:	 ArraysLab.java
	Purpose:	 Lab 7
*/

import java.util.Scanner;

public class ArraysLab
{
	public static void main(String[] args)
	{
		// declare vars
		int[] list1 = new int[10];
		double[] list2 = new double[10];

		//new scanner
		Scanner input = new Scanner(System.in);

		//header
		System.out.println("     Average arrays");

		// populate array
		System.out.print("Input ten integers: ");
		for (int i = 0; i < list1.length; i++)
			list1[i] = input.nextInt();

		//output
		System.out.println("  The average of the ten integers is " + average(list1) + "\n");

		//populate other array
		System.out.println("Enter 10 double values: ");
		for (int i = 0; i < list2.length; i++)
			list2[i] = input.nextDouble();

		//output
		System.out.println("  The average of the ten doubles is " + average(list2));




	}

	public static int average(int[] array)
	{
		//declare vars
		int returnValue = 0;

		for (int value: array)
			returnValue += value;
		return returnValue / array.length;
	}

	public static double average(double[] array)
	{
		//declare vars
		double returnValue = 0;

		for(double value: array)
			returnValue += value;
		return returnValue / array.length;
	}


}