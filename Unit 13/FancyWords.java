//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private ArrayList<String> wordRay;

	public FancyWords(String sentence)
	{
		wordRay = new ArrayList<String>();
		Scanner chopper = new Scanner(sentence);
		while(chopper.hasNext()) {
			wordRay.add(chopper.next());
		}
	}

	public void setWords(String sentence)
	{
		wordRay.clear();
		Scanner chopper = new Scanner(sentence);
		while(chopper.hasNext()) {
			wordRay.add(chopper.next());
		}
	}

	
	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		
	for(int k=0;k<wordRay.size();k++) 
	{
		if(k == 0 || wordRay.get(k).length() > max)
			max = wordRay.get(k).length();
	}
	for(int k=0;k<wordRay.size();k++) 
	{
		while(wordRay.get(k).length() < max) 
		{
			wordRay.set(k, " " + wordRay.get(k));
		}
	}
	
		for(int i =0;i<max;i++) 
		{
			for(int k=wordRay.size() - 1;k>=0;k--) 
			{ 
				output += wordRay.get(k).charAt(max - 1 - i);
			}
			output += "\n";
		}
	
		





		return output+"\n\n";
	}
}