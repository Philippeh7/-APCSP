//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "";
		lookFor = 'a';
		
	}

	public LetterRemover(String sent, char b)
	{
		sentence = sent;
		lookFor = b;
	}
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned="";
	for(int i=0;i<sentence.length();i++)
	{
		if(sentence.charAt(i) != lookFor)
		{
			cleaned = cleaned + sentence.charAt(i);
		}
	}

		return cleaned;
	}

	public String toString()
	{
		return removeLetters() + "\nOld sentence:"+ sentence + " - letter to remove " + lookFor;
	}
}