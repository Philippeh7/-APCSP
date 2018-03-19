//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Wordlab18e implements Comparable<Wordlab18e>
{
	private String word;

	public Wordlab18e( String s)
	{
		word = s;
		
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int i=0;i<word.length();i++)
		{
			for(int k=0;k<vowels.length();k++)
			{
				if(word.charAt(i) == vowels.charAt(k))
					vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(Wordlab18e rhs)
	{
		if(rhs.numVowels() > numVowels())
			return 1;
		else if(rhs.numVowels() < numVowels())
			return -1;
		
		return 0;
	}

	public String toString()
	{
		return word;
	}
}