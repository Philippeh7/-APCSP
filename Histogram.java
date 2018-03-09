//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{

		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();



	}

	public Histogram(char[] values, String fName)
	{
		this();
		fileName = fName;
		for(int i=0;i<values.length;i++)
		{
			letters.add(values[i]);
			count.add(0);
		}
		out.println("search letters = "+letters);
		
		
	}

	public void loadAndAnalyzeFile() throws IOException
	{
	try{
		Scanner file = new Scanner(new File(fileName));
		int linecount = file.nextInt();
		String ayylmao = "";
		while(file.hasNextLine())
		{
			ayylmao = file.nextLine();
			for(int k=0;k<letters.size();k++)
			{
				for(int j=0;j<ayylmao.length();j++)
				{
					if(ayylmao.charAt(j) == letters.get(k))
					{
						count.set(k, count.get(k)+1);
					}
				}
			}
		}
	}
	
	catch(Exception e)
	{
		System.out.println("kill me");
	}





	}

	public char mostFrequent()
	{
		int max = 0;
		for(int i=0;i<count.size();i++)
		{
			if(i == 0)
				max = i;
			else if(count.get(i) > count.get(max))
				 max = i;
		}

		return letters.get(max);
	}

	public char leastFrequent()
	{
		int min = 0;
		for(int i=0;i<count.size();i++)
		{
			if(i == 0)
				min = i;
			else if(count.get(i) < count.get(min))
				 min = i;
		}

		return letters.get(min);

	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}