//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "Philippe";

	}

	public StringChecker(String s)
	{
		word = s;

	}

   public void setString(String s)
   {
   		word = s;
   		
   }

	public boolean findLetter(char c)
	{
		int finder = word.indexOf(c);
		
		if (finder == -1)
			return false;
		else
			return true;
	}

	public boolean findSubString(String s)
	{
		int finder = word.indexOf(s);
		if (finder == -1)
			return false;
		else
			return true;
	}

 	public String toString()
 	{
 		return "\n" + word;
	}
}