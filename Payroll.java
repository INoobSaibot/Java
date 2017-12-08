/*
	Chapter 4

	Programmer: Tobias Stecker

	Date: 9.18.17

	Filename: Payroll.java

	Purpose: Lab3, Payroll


*/

import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {

		// declare needed variables
		String name;
		float hoursWorked;
		float payRate;
		float grossPay;
		float fedTaxRate, fedTaxes, stateTaxRate, stateTaxes;

		String TWO_DECIMAL_PATTERN = "%2s%4.2f\r\n";
		String DEDUCTION_PATTERN = "%2s%4.2f%2s$%4.2f\r\n";

		// Create a new Scanner object
		Scanner input = new Scanner(System.in);
		// header
		System.out.println("                  Payroll Record                 \n");

		//inputs
		System.out.print("Enter employees name: ");
		name = input.nextLine();

		System.out.print("Enter number of hours worked: ");
		hoursWorked = input.nextFloat();

		System.out.print("Enter hourly pay rate: ");
		payRate = input.nextFloat();

		grossPay = payRate * hoursWorked;

		System.out.print("Please enter federal tax withholding rate: ");
		fedTaxRate = input.nextFloat();
		fedTaxes = grossPay * fedTaxRate;

		System.out.print("Enter state tax withholding rate: ");
		stateTaxRate = input.nextFloat();
		stateTaxes = grossPay * stateTaxRate;

		System.out.println();
		System.out.println("Employee Name: " + name);
		System.out.printf(TWO_DECIMAL_PATTERN, "Hours worked: ", hoursWorked,"\r\n");
		System.out.printf(TWO_DECIMAL_PATTERN, "Pay Rate:    $", payRate);
		System.out.printf(TWO_DECIMAL_PATTERN,"Gross Pay:   $" ,  grossPay);

		System.out.println("Deductions:");
		System.out.printf("%2s%4.2f%2s$%4.2f\r\n","  Federal Withholding <" ,fedTaxRate * 100, "%>: ", fedTaxes);
		System.out.printf(DEDUCTION_PATTERN,"  State Withholding <", stateTaxRate * 100, "%>: ", stateTaxes);
		System.out.printf("%2s%4.2f\r\n","  Total Deduction: $", (stateTaxes + fedTaxes));
		System.out.printf("%2s%4.2f\r\n","Net Pay:  $", (grossPay - stateTaxes - fedTaxes ));


		//calculations

		//outputs

		//goodbye


		}
	}