/*
Chapter XX

Programmer:   Tobias Stecker

Date: 12.1.17

Filename: Candleline.java

Purpose: Lab 11.
*/

import java.util.*;
import java.text.DecimalFormat;
public class Candleline {

    public static void main(String[] args) {
        // declare some variables
        double candleCost, shippingCost;
        int shippingType;
        // Format output for dollars
        DecimalFormat twoDigits = new DecimalFormat("$###,###.00");

        //header console app
        System.out.println("\tCandleLine - Candles Online");
        System.out.println();

        candleCost = getCandleCost();
		System.out.println();

        shippingType = getShippingType();
		System.out.println();

        shippingCost = getShippingCost(candleCost, shippingType);

        //finish
        System.out.println("The candle cost of " + twoDigits.format(candleCost) + " plus shipping cost of " +
        	twoDigits.format(shippingCost) + " equals " +
        	twoDigits.format(shippingCost + candleCost));

    }
    //-----------------------------------------------------------------------
    public static double getCandleCost()
    {
        Scanner userInput = new Scanner(System.in);
        boolean tryAgain = false;
        double order = 0;

        do
        {
			tryAgain = false;
            System.out.print("Enter the cost of the candle order: ");
            try
                {
                order = userInput.nextDouble();
                if (order <= 0)
                	throw new IllegalArgumentException();
            }catch (InputMismatchException e)
            {
             System.out.println("numbers only please\n");
             userInput.nextLine();
             tryAgain = true;
             //System.out.println();
            }catch (IllegalArgumentException ee)
            {
			System.out.println("amount higher than zero only please\n");
			userInput.nextLine();
            tryAgain = true;
			}


        }while(tryAgain);
        return order;
    }

    //-----------------------------------------------------------------------
    public static int getShippingType()
    {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        boolean contInput = false;

        do
        {
			contInput = false;
			System.out.print("Enter the type of shipping:\n"+
			"\t1) Priority (Overnight)\n"+
			"\t2) Express (2 business days)\n"+
			"\t3) Standard (3 to 7 business days)\n"+
			"Enter the type number: ");
			try
			{
				choice = input.nextInt();
				if(choice != 1 && choice != 2 && choice != 3)
					throw new IllegalArgumentException();
			}catch (InputMismatchException e)
			{
			System.out.println("Enter 1 2 or 3 only please");
			input.next();
			contInput = true;
			}catch (IllegalArgumentException ee)
			{
			System.out.println("You entered " + choice + ", Enter 1 2 or 3 only please");
			//input.next();
			contInput = true;
			}

		}while(contInput);

		return choice;

    }

    //-----------------------------------------------------------------------
    public static double getShippingCost(double theCandleCost, int theShippingType)
    {
		double rtn = 0;
		if (theCandleCost >= 100 && theShippingType == 3)
			return 0;
		switch(theShippingType) {
			case 1:
				rtn = 16.95;
				break;
			case 2:
				rtn = 13.95;
				break;
			case 3:
				rtn = 7.95;
				break;
			}
        return rtn;
    }
}
