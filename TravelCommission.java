/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
	Chapter :	Java 2467 ch12 exception handling
	Programmer: Toby
	Date:		11.21.17
	Filename:	TravelComission.java
	Purpose:	Lab 10
*/

//package travelcommission;
import javax.swing.JOptionPane;
import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author Toby
 */
public class TravelCommission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dollars = 0;
        double answer;
        int empCode = -1;

		//input
       	dollars = getSales();
        empCode = getCode();

		// calculations
        answer = getComm(dollars, empCode);

		// output
        output(dollars, answer);

		finish();

    }
    //-------------------------------------------------------------------------
    public static double getSales()
    {
        //declare variables
        double input = -1;

        do {
            try {
            input = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter sale amount\n(do not use commas or dollar signs)\nor click Cancel to exit:"));
            if (input <=0)
            	throw new IllegalArgumentException();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter the dollar amount and cents only", "Alert", JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException eee){
				System.out.println("narf in method" + eee);
            	finish();
			} catch (IllegalArgumentException ee) {
				JOptionPane.showMessageDialog(null, "Error - Enter a number greater than 0.", "Alert", JOptionPane.ERROR_MESSAGE);
			}
        } while (input <= 0);
        return input;
    }

    //-------------------------------------------------------------------------
    public static int getCode()
    {
		String input;
        int code = -1;
        do {
            try {
				//for some reason Integer.parseInt() would not throw a Java.Lang.NullPointerException (click cancel) for me like Double.parseDouble() does
				// so i resorted to this
                input = (JOptionPane.showInputDialog(null, "Enter commission code\n (1) for Telephone\n (2) for in-store\n (3) for outside"));
                if(input == null)
                	throw new NullPointerException();
                code = Integer.parseInt(input);
                if (code < 1 || code > 3)
					throw new IllegalArgumentException();
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Did you enter letters or spaces or nothing at all?\n Please enter 1, 2 or 3 only", "Alert", JOptionPane.ERROR_MESSAGE);
            }catch (NullPointerException eee){
				System.out.println("narf in method" + eee);
            	finish();
			}catch (IllegalArgumentException ee){
					JOptionPane.showMessageDialog(null, "You entered " + code + "\nPlease enter 1, 2 or 3 only", "Alert", JOptionPane.ERROR_MESSAGE);
					System.out.println(code);
			}
        } while(code !=1 && code !=2 &&  code != 3);return code;
    }

    //-------------------------------------------------------------------------
    public static double getComm(double theDollars, int empCode)
    {
        double rtn = 0;

        switch(empCode) {
            case 1: rtn =  theDollars * .10;
                    break;
            case 2: rtn = theDollars * .14;
                    break;
            case 3: rtn = theDollars * .18;
                    break;
        }
      return rtn;
    }

    //-------------------------------------------------------------------------
    public static void output(double d,double a) {
		// Format output for dollars
        DecimalFormat twoDigits = new DecimalFormat("$###,###.00");
		//output to message box
        JOptionPane.showMessageDialog(null, "Sales of " + twoDigits.format(d) +
                " earns " + twoDigits.format(a) + " comission");
    }
    //-------------------------------------------------------------------------
    public static void finish(){
        JOptionPane.showMessageDialog(null, "You clicked cancel \n or you're just done.", "Good Bye", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

