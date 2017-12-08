/*
	Chapter :	9
	Programmer: Toby
	Date:		1
	Filename:	Car.Java
	Purpose:	Lab 8
*/

class Car
{
	int yearModel;
	String make;
	int speed;

	//Constructor
	public Car (int newYearModel, String newMake)
	{
		yearModel = newYearModel;
		make = newMake;
		speed = 0;
	}

	public int getYearModel()
	{
		return yearModel;
	}

	public String getMake()
	{
		return make;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void accelerator()
	{
		speed += 5;
	}

	public void brake()
	{
		speed -=5;
	}
}