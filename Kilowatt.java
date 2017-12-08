/*
	Chapter :  Circumference Calculator
	Programmer: Toby Stecker
	Date: 10.12.17
	Filename:	 Kilowatt.java
	Purpose:	 This project calculates the energy use of an appliance.
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Kilowatt extends Applet implements ActionListener
{
		// declare variables
		double kilowattHourCost, kilowattHoursConsumed;

		//construct components
		Label welcome = new Label("Welcome to the Appliance Energy Calculator");
		Label kilowattHourCostLabel = new Label("Please enter the cost per kilowatt-hour: ");
		TextField kilowattHourCostField = new TextField(5);

		Label kilowattHoursConsumedLabel = new Label("Please enter the kilowatt-hours consumes: ");
		TextField kilowattHoursConsumedField = new TextField(5);

		Button calcButton = new Button("Calculate");
		Label outputLabel = new Label("Click the Calculate button to display monthly energy cost.");
		DecimalFormat twoDigits = new DecimalFormat("$####.00");

		public void init()
		{
			setForeground(Color.red);
			setBackground(Color.yellow);
						add(welcome);
						add(kilowattHourCostLabel);
						add(kilowattHourCostField);

						add(kilowattHoursConsumedLabel);
						add(kilowattHoursConsumedField);
						add(calcButton);
						add(outputLabel);
						calcButton.addActionListener(this);




		}

		public void actionPerformed(ActionEvent e)
		{
			double khrs = Double.parseDouble(kilowattHourCostField.getText());
			double costPer = Double.parseDouble(kilowattHoursConsumedField.getText());

			double operatingCost = khrs * costPer;
			outputLabel.setText("The monthly cost to operate this appliance is "+ twoDigits.format(operatingCost) + ".");





		}


}