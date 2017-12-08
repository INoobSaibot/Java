/*
	Chapter :  The Circumference  Calculator
	Programmer: Toby
	Date:
	Filename:	 CircumCalcSwing.java
	Purpose:	 This project calculates the circumference
				 on a circle.
				 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Currency
{
			public static void main(String[] args)
			{
				// declare and construct variables


				double dollars;
				double pounds = .64; double euros = .91; double rubles = 61.73;
				DecimalFormat twoDigits = new DecimalFormat("###,###.00");

				//print prompts and get input
				System.out.println("\t Currency CALCULATOR");

				dollars = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your dollar amount: "));



				 // calculations
				String inDollars = twoDigits.format(dollars);
				String inPounds = twoDigits.format(dollars * pounds);
				String inEuros = twoDigits.format(dollars * euros);
				String inRubles = twoDigits.format(dollars * rubles);


				 // output
				 JOptionPane.showMessageDialog(null, "YOUR DOLLAR AMOUNT OF " + inDollars +"\n is equal to " + inEuros + " euros, \n" + inPounds + " pounds\n and " + inRubles + " rubles"
				 ,"CURRENCY Calculator",JOptionPane.PLAIN_MESSAGE);


			System.exit(0);
			}

}