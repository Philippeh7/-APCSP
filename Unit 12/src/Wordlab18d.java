//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Wordlab18d implements Comparable<Wordlab18d>
{
	private String word;

	public Wordlab18d( String s )
	{
		word = s;
	}
	public String getword()
	{
		return word;
	}

	public int compareTo( Wordlab18d rhs )
	{
		if(rhs.getword().length() > getword().length())
			return 1;
		else if(rhs.getword().length() < getword().length())
			return -1;
		
		
		
		
		return 0;
	}

	public String toString()
	{
		return word;
	}
}