/*
	Chapter :	9
	Programmer: Toby
	Date:		1
	Filename:	CarDemo.Java
	Purpose:	Lab 8
*/

import java.util.Scanner;

public class CarDemo
{
	public static void main(String[] args)
	{


		//header
		System.out.println("\t Demonstration of the Car Class");


		Car myCar2 = new Car(1940, "Chevy");

		Car myCar = new Car(getInputYear(), getInputMake());

		// display car object and its fields
		System.out.println("demoCar\n\tModel Year: " + myCar.getYearModel() + " \n\tMake: " + myCar.getMake() + "\n\tSpeed: " + myCar.getSpeed());
		System.out.println();

		//accelerate five times and display current speed
		System.out.println("Speed Up!");
		for (int i = 0; i < 5; i ++)
		{
			myCar.accelerator();
			System.out.println("demoCars speed: " + myCar.getSpeed());
		}
		System.out.println();

		//Brake decel five times
		System.out.println("Slow Down!");
		for(int i=0; i < 5; i++)
		{
			myCar.brake();
			System.out.println("demoCars speed: " + myCar.getSpeed());
		}
		System.out.println();

		//end
		System.out.println("End of the Road for Car Class Demonstration");



	}

	private static int getInputYear()
	{
		//new scanner object
		Scanner input = new Scanner(System.in);
		int year;
		do
		{
			System.out.print("Enter the year of the car: ");
			year = input.nextInt();

			if (year < 1940 || year > 2016)
				System.out.println("Input error - enter a year between 1940 and 2016");
		} while (year < 1940 || year > 2016);
		return year;
	}

	private static String getInputMake()
	{
		//new scanner object
		Scanner input = new Scanner(System.in);
		String make;
		do
		{
			System.out.print("Enter the Make of the car: ");
			make = input.next();

			if (make == null || make == "")
				System.out.println("Input error - enter a car Make");
		} while (make == null || make == "");
		return make;
	}
}