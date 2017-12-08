/*
	Chapter

	Programmer: Tobias Stecker

	Date: 9.

	Filename: Brake.java

	Purpose:


*/

import java.util.Scanner;

public class Average
{

	public static void main (String[] args)
	{
		// declare
		int total = 0;
		double average;
		int userInput;
		int count = 0;

		Scanner input = new Scanner(System.in);

		do
		{
			System.out.print("enter a positive number value or zero to quit: ");
			userInput = input.nextInt();

			System.out.println();

			if(userInput > 0)
			{
				total += userInput;
				count += 1;
			}
		}
		while (userInput > 0);


		if (total == 0)
		{
			System.out.println("No valid values entered");
		} else {
			System.out.println("The total number of legal input is: " + count);
			System.out.println("The average is " + (total / count));
		}
	}
}
