package control;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.io.IOException;
import java.io.Console;
import java.io.StringWriter;
import java.io.PrintWriter;


public class Prin
{

	/**
	*Call to skip a line
	*/
	public static void ln()
	{
		System.out.println();
	}

	/**
	*Call to skip multiple lines
	*/
	public static void ln(int num)
	{
		for(int i = 0; i < num; i++)
		{
			ln();
		}
	}

	/**
	*Call to print a message on the console slowly
	*75--Fast, 90--moderate, 125--slow
	*@param message to print
	*@param time between chars
	*/
	public static void tSlow(String message, int time)
	{
		if(message!=null)
		{
			for(int i = 0; i < message.length(); i++)
			{
					pause(time);
					System.out.print(message.substring(i, i+1));
			}
		}
	}

	/**
	*Print message at normal speed
	*@param message to print
	*/
	public static void t(String message)
	{
		System.out.print(message);
	}

	/**
	*Print message at normal speed and skip lines before and after
	*@param message to print
	*/
	public static void tln(String message)
	{
		System.out.println(message);
	}
	
	/**
	*Print message to standard error
	*@param message to print
	*/
	public static void err(String message)
	{
		System.err.print(message);
	}

	/**
	*Call to pause program for number of milliseconds
	*@param time in milliseconds
	*/
	public static void pause(int time)
	{
		try
		{
			TimeUnit.MILLISECONDS.sleep(time);
		}
		catch(Exception e)
		{
			System.out.print("");
		}
	}

	/**
	*Clear the console window all at once
	*/
	public static void clearAll()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		catch(IOException a)
		{
			System.out.print("\033[H\033[2J"); 
			System.out.flush();
		}
		catch(InterruptedException b)
		{
			System.out.print("\033[H\033[2J"); 
			System.out.flush();
		}
	}

	/**
	*Clear line of text while on that line
	*/
	public static void clearCurrLine()
	{
		System.out.print("\r                                                                               \r");
		
		//System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
		//System.out.print("                                                                               ");
		//System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
	}

	/**
	*Print ASCII spinner
	*/
	public static void spinner()
	{
		final int PAUSE = 55;

		System.out.print("\\");
		pause(PAUSE);
		System.out.print("\b|");
		pause(PAUSE);
		System.out.print("\b/");
		pause(PAUSE);
		System.out.print("\b-");
		pause(PAUSE);
		System.out.print("\b");
	}

	//------------------------------------------------------
	/**
	*Print a white space buffer to center
	*@param number of total columns
	*@param number of occupied spaces in that which you are centering
	*/
	public static void center(int col, int usedSpaces)
	{
		int buffer = (col - usedSpaces)/2;

		for(int i = 0; i < buffer; i++)
			System.out.print(" ");
	}

	/**
	*Print a white space buffer
	*@param number of whitespaces
	*/
	public static void buff(int spaces)
	{
		for(int i = 0; i < spaces; i++)
			System.out.print(" ");
	}
	//------------------------------------------------------

	//--------------------------------------------------------------------------------------------------------------
	/**
	*OVERLOADED 1
	*Print divider
	*@param columns
	*@param char
	*@param speed
	*/
	public static void divider(String charr)
	{
		divider(80, charr, 0);
	}

	/**
	*OVERLOADED 2
	*Print divider
	*@param columns
	*@param char
	*@param speed
	*/
	public static void divider(int col, String charr, int speed)
	{
		if(speed==0)
		{
			for(int i = 0; i < col; i++)
				System.out.print(charr);
		}
		else if(speed > 0)
		{
			for(int i = 0; i < col; i++)
			{
				System.out.print(charr);
				pause(speed);
			}
		}
	}
	//---------------------------------------------------------------------------------------------------------------




	//---------------------------------------------------title-----------------------------------------------------
	/**
	*OVERLOADED 1
	*Print title surrounded centered by specified chars
	*@param title
	*@param char
	*@param columns
	*/
	public static void title(String titl, String charr)
	{
		title(titl, charr, 80, 0);
	}

	/**
	*OVERLOADED 2
	*Print title surrounded centered by specified chars
	*@param title
	*@param char
	*@param columns
	*/
	public static void title(String titl, String charr, int col)
	{
		title(titl, charr, col, 0);
	}

	/**
	*OVERLOADED 3
	*Print title surrounded centered by specified chars
	*@param title
	*@param char
	*@param columns
	*@param speed in milliseconds
	*/
	public static void title(String titl, String charr, int col, int speed)
	{
		byte numChars = (byte)(col - titl.length());
		String out = "";

		if(numChars%2 != 0)
		{
			out += charr;

			for(int i = 0; i < numChars/2; i++)
				out += charr;

			out += titl;

			for(int i = 0; i < numChars/2; i++)
				out += charr;
		}
		else
		{
			for(int i = 0; i < numChars/2; i++)
				out += charr;

			out += titl;

			for(int i = 0; i < numChars/2; i++)
				out += charr;
		}

		tSlow(out, speed);
	}
	//--------------------------------------------------------------------------------------------------------------------

	/**
	*gets a string from console input
	*@reutrn obatined string
	*/
	public static String getString()
	{
		Scanner kbd = new Scanner(System.in);

		String input = kbd.nextLine();
		
		kbd.close();

		return input;
	}

	/**
	*gets an int from console input
	*@reutrn obatined int
	*/
	public static int getInt()
	{
		Scanner kbd = new Scanner(System.in);

		int input = kbd.nextInt();
		
		kbd.close();

		return input;
	}

	/**
	*gets a double from console input
	*@reutrn obatined double
	*/
	public static double getDouble()
	{
		Scanner kbd = new Scanner(System.in);

		double input = kbd.nextDouble();
		
		kbd.close();

		return input;
	}
	
	/**
	*Masks password input and gets password
	*@return password
	*/
	public static String getPassword()
	{
		Console console = System.console();
		String password = "";
        if (console == null) 
		{
			pause(100);
            console = System.console();
        }
		
		if(console == null)
		{
			password = getString();
		}
		else
		{
			char passwordArray[] = console.readPassword();
			
			for(int i = 0; i < passwordArray.length; i++)
			{
				password += passwordArray[i];
			}
		}
		
		return password;
	}
	
	/**
	*Returns stack trace as a string
	*@param exception
	*@return string 
	*/
	public static String getStackTrace(Exception e)
	{
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		String sStackTrace = sw.toString(); // stack trace as a string
		
		return sStackTrace;
	}
	
	/**
	*Displays Yes/No Prompt with custom message
	*@param the message string
	*@return true/false
	*/
	public static boolean yesOrNo(String message)
	{
		String answer = "";
		boolean yesOrNo = false;
		boolean valid = false;
		
		t("\n" + message + " [Y]es/[N]o: ");
		answer = getString();
		
		if(answer.replaceAll("\\s+","").equalsIgnoreCase("Y"))
		{
			yesOrNo = true;
			valid = true;
		}
		else if(answer.replaceAll("\\s+","").equalsIgnoreCase("N"))
			valid = true;
		
		//if yes or no was not entered, prompt again
		while(!valid)
		{
			t("\n\nInvalid Entry! Try again--> [Y]es/[N]o: ");
			answer = getString();
			
			if(answer.replaceAll("\\s+","").equalsIgnoreCase("Y"))
			{
				yesOrNo = true;
				valid = true;
			}
			else if(answer.replaceAll("\\s+","").equalsIgnoreCase("N"))
				valid = true;
		}
		
		return yesOrNo;
	}
	
	/**
	*Displays money in correct format
	*@param dollars
	*@param cents
	*@formatted money
	*/
	public static String money(int dollars, int cents)
	{
		double money = dollars + cents * .01;
		String str = String.format("$%.2f", money);
		
		return str;
	}
	
	/**
	*Displays money in correct format
	*@param money in decimal
	*@formatted money
	*/
	public static String money(double money)
	{
		String str = String.format("$%.2f", money);
		
		return str;
	}
}
