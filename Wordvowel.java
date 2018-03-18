//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Wordvowel implements Comparable<Wordvowel>
{
	private String word;

	public Wordvowel( String s)
	{
		word = s;
		
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int i=0;i<word.length();i++)
		{
			for(int k=0;i<vowels.length();i++)
			{
				if(word.charAt(k) == vowels.charAt(k))
					vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(Wordvowel rhs)
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