//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = 'a';

	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;

	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if(getASCII() >= 65 && getASCII() <= 90)
			return true;

		return false;
	}

	public boolean isLower( )
	{
		if(getASCII() >= 97 && getASCII() <= 122)
			return true;


		return false;
	}
	
	public boolean isNumber( )
	{
		if(getASCII() >= 48 && getASCII() <= 57)
			return true;


		return false;
	}	

	public int getASCII( )
	{
		int equal;
		equal = theChar;
		return equal;
	}

	public String toString()
	{
		if(isUpper())
		return ""+getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";

		else if(isLower())
		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		
		else if(isNumber())
		return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		
		else
		return "Your character is not a number, uppercase, or lowercase character";
	}
}