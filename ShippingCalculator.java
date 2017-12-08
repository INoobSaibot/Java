/*
	Chapter 2

	Programmer: Tobias Stecker

	Date: 9.5.17

	Filename: ShippingCalculator.java

	Purpose: Lab2-a, Nested if/else if Statements


*/

import java.util.Scanner;

public class ShippingCalculator
{

	public static void main (String[] args)
	{
		/* initialize variables */
		double packageWeight;

		/* Header */

		/* get input */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter package weight: ");
		packageWeight = input.nextDouble();


		/* if else selection */
		if (packageWeight <= 1)
		System.out.println("The shipping cost is $3.50");

		else if (packageWeight <= 3)
		System.out.println("The shipping cost is $5.50");

		else if (packageWeight <= 10)
		System.out.println("The shipping cost is $8.50");

		else if (packageWeight <= 20)
		System.out.println("The shipping cost is $10.50");

		else
		System.out.println("the package cannot be shipped");

	}
}