//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.ArrayList;
public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<Wordlab18d> words = new ArrayList<Wordlab18d>();
		Scanner file = new Scanner(new File("C:\\Users\\hansenestruchp0969\\Desktop\\hansenestruchjava\\Unit 12\\src\\lab18d.dat"));

		int size = file.nextInt();
		for(int i=0;i<size;i++)
		{
			Wordlab18d newword = new Wordlab18d(file.nextLine());
			words.add(newword);
		}
		
		for(int z=0;z<words.size();z++)
		{
			for(int i=0;i<words.size();i++)
			{
				if(words.get(z).compareTo(words.get(i)) == 1)
				{
					Wordlab18d temp = words.get(i); 
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