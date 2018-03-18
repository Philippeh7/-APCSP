//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<Wordvowel> words = new ArrayList<Wordvowel>();
		Scanner file = new Scanner(new File("C:\\Users\\Philippe\\Desktop\\Unit12-2016\\Unit12-Assignments\\lab18d.dat"));

		int size = file.nextInt();
		for(int i=0;i<size;i++)
		{
			Wordvowel newword = new Wordvowel(file.nextLine());
			words.add(newword);
		}
		
		for(int z=0;z<words.size();z++)
		{
			for(int i=0;i<words.size();i++)
			{
				if(words.get(z).compareTo(words.get(i)) == -1)
				{
					Wordvowel temp = words.get(i); 
					words.set(i, words.get(z));
					words.set(z, temp);
					
				}
			}
		}

		for(int z=0;z<words.size();z++)
		{
			out.println(words.get(z));
		}











	}
}