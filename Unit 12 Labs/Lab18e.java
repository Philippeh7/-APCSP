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
		ArrayList<Wordlab18e> words = new ArrayList<Wordlab18e>();
		Scanner file = new Scanner(new File("C:\\Users\\hansenestruchp0969\\Desktop\\hansenestruchjava\\Unit 12\\src\\lab18e.dat"));

		int size = file.nextInt();
		for(int i=0;i<size;i++)
		{
			Wordlab18e newword = new Wordlab18e(file.nextLine());
			words.add(newword);
		}
		
		for(int z=0;z<words.size();z++)
		{
			for(int i=0;i<words.size();i++)
			{
				if(words.get(z).compareTo(words.get(i)) == 1)
				{
					Wordlab18e temp = words.get(i); 
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