/*
	Chapter 10:	Account program
	Programmer: Tobias Stecker
	Date:		11.12.17
	Filename:	BankAcctDemo.java
	Purpose:	LAb 9, bank account objects
*/

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


class CheckAcct
{
	private int id;
	private double balance;
	private static double annualInterestRate = .050;
	private String dateCreated;

	DateFormat df = new SimpleDateFormat("E MMM dd HH:mm:ss zzz yyyy G");
	Date dateobj = new Date();

	Calendar calobj = Calendar.getInstance();



	//constructior
	public CheckAcct(int acctID, double initialBalance)
	{
		id = acctID;
		balance = initialBalance;
		//dateCreated = (df.format(dateobj));
		dateCreated = (df.format(calobj.getTime()));
	}

	public int getId()
	{
		return id;
	}

	public double getBalance()
	{
		return balance;
	}

	public static double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double newRate)
	{
		annualInterestRate = newRate;
	}

	public String getDateCreated()
	{
		return dateCreated;
	}

	public double getMonthlyInterest()
	{
		return annualInterestRate / 12.00;
	}

	public void withdraw(double withdrawing)
	{
		balance = balance - withdrawing;
	}

	public void deposit(double depositing)
	{
		balance = balance + depositing;
	}
	//end of class
}